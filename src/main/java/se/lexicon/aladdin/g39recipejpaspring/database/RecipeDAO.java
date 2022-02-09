package se.lexicon.aladdin.g39recipejpaspring.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import se.lexicon.aladdin.g39recipejpaspring.models.entity.Recipe;

import java.util.List;
import java.util.Optional;

public interface RecipeDAO extends JpaRepository<Recipe, String > {

    @Query("SELECT r FROM Recipe r WHERE UPPER(r.recipeName) LIKE UPPER(CONCAT('%',:recipeName,'%'))")
    List<Recipe> findByRecipeNameContaining(@Param("recipeName")String recipeName);

    @Query("SELECT r FROM Recipe r WHERE UPPER(r.recipeName) LIKE UPPER(CONCAT('%',:name,'%'))")
    Optional<Recipe> searchByRecipeName(@Param("name") String name);



}
