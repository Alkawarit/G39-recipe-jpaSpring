package se.lexicon.aladdin.g39recipejpaspring.models.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class AppRole {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR,strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;
    @Column(unique = true)
    private String appRole;
   @ManyToMany(
           cascade = {CascadeType.REFRESH, CascadeType.DETACH},
           fetch = FetchType.LAZY
   )

   @JoinTable(
           name = "role_app_user",
           joinColumns = @JoinColumn(name = "fk_app_role_id", table = "role_app_user"),
           inverseJoinColumns = @JoinColumn(name = "fk_app_user_id", table = "role_app_user")
   )

    private Set<AppUser> appUsers;


    public AppRole() {
    }

    public AppRole(String id, String appRole) {
        this.id = id;
        this.appRole = appRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppRole() {

        return appRole;
    }

    public void setAppRole(String appRole) {
        this.appRole = appRole;
    }

    public Set<AppUser> getAppUsers() {
        if(appUsers == null) appUsers = new HashSet<>();
        return appUsers;
    }

    public void setAppUsers(Set<AppUser> appUsers) {
        if(appUsers == null) appUsers = new HashSet<>();
        if (appUsers.isEmpty()){
            if (this.appUsers!= null) {
                this.appUsers.forEach(appUser -> appUser.getRoles().remove(this));
            }

            }else{
            appUsers.forEach(appUser -> appUser.getRoles().add(this));
        }
        this.appUsers = appUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppRole appRole1 = (AppRole) o;
        return Objects.equals(id, appRole1.id) && Objects.equals(appRole, appRole1.appRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appRole);
    }

    @Override
    public String toString() {
        return "AppRole{" +
                "id='" + id + '\'' +
                ", appRole='" + appRole + '\'' +
                ", appUsers=" + appUsers +
                '}';
    }
}
