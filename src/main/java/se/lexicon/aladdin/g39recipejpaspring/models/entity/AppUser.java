package se.lexicon.aladdin.g39recipejpaspring.models.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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
             fetch = FetchType.LAZY,
             mappedBy = "appUser"
     )
    private Set<AppRole> appRole;

    public AppUser() {
    }

    public AppUser(String id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
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
}
