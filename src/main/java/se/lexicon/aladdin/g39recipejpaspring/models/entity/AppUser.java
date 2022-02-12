package se.lexicon.aladdin.g39recipejpaspring.models.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;
    @Column(length = 100, unique = true)
    private String userName;
    private String password;

    @ManyToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY,mappedBy = "appUsers"
    )
    private Set<AppRole> roles;

    public AppUser() {
    }

    public AppUser(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }


    public Set<AppRole> getRoles() {
        if(roles== null) roles = new HashSet<>();
        return roles;
    }

    public void setRoles(Set<AppRole> roles) {
        if(roles == null) roles = new HashSet<>();
        if(roles.isEmpty()) {
            if (this.roles != null) {
                this.roles.forEach(appRole -> appRole.getAppUsers().remove(this));
            }
        }else { roles.forEach(appRole -> appRole.getAppUsers().add(this));

        }
        this.roles = roles;
    }

    public void addAppRole(AppRole appRole){
        if(appRole == null) throw new IllegalArgumentException("AppRole was null");
        if(roles == null) roles = new HashSet<>();
        roles.add(appRole);
        appRole.getAppUsers().add(this);
    }

    public void removeAppRole(AppRole appRole){
       if(appRole == null) throw new IllegalArgumentException("AppRole was null");
       if (roles == null) roles = new HashSet<>();
       roles.remove(appRole);
       appRole.getAppUsers().remove(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(id, appUser.id) && Objects.equals(userName, appUser.userName) && Objects.equals(password, appUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
