package se.lexicon.aladdin.g39recipejpaspring.models.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

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
    private String userRole;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "role_app_user",
            joinColumns = @JoinColumn(name = "fk_app_role_id", table = "role_app_user"),
            inverseJoinColumns = @JoinColumn(name = "fk_app_user_id", table = "role_app_user")
    )
     private Set<AppUser> appUser;

    public AppRole() {
    }

    public AppRole(String id, String userRole) {
        this.id = id;
        this.userRole = userRole;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}
