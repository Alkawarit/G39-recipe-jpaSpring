package se.lexicon.aladdin.g39recipejpaspring.models.dto.view;

import se.lexicon.aladdin.g39recipejpaspring.models.entity.AppRole;

import java.io.Serializable;
import java.util.Set;

public class AppUserDTO implements Serializable {

    private String id;
    private String userName;
    private Set<AppRole> roles;

    public AppUserDTO(String id, String userName, Set<AppRole> roles) {
        this.id = id;
        this.userName = userName;
        this.roles = roles;
    }

    public AppUserDTO() {
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

    public Set<AppRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<AppRole> roles) {
        this.roles = roles;
    }
}
