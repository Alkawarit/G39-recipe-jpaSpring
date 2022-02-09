package se.lexicon.aladdin.g39recipejpaspring.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39recipejpaspring.models.entity.Ingredient;

import java.util.List;

public interface IngredientDAO extends JpaRepository<Ingredient, String> {

List<Ingredient> findByIngredientNameIgnoreCase (String ingredient);
List<Ingredient> findByIngredientNameLikeIgnoreCase( String ingredient);

}
