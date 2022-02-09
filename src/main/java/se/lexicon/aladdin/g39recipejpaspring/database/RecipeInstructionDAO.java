package se.lexicon.aladdin.g39recipejpaspring.database;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.aladdin.g39recipejpaspring.models.entity.RecipeInstruction;

public interface RecipeInstructionDAO extends JpaRepository<RecipeInstruction, String> {

}
