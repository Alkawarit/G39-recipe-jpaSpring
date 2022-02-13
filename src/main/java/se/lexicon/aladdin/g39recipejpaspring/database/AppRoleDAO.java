package se.lexicon.aladdin.g39recipejpaspring.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39recipejpaspring.models.constants.UserRole;
import se.lexicon.aladdin.g39recipejpaspring.models.entity.AppRole;

import java.util.Optional;

public interface AppRoleDAO extends JpaRepository<AppRole, String > {

    Optional<AppRole> findByAppRole(@Param("appRole") String appRole);
}
