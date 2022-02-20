package se.lexicon.aladdin.g39recipejpaspring.models.dto;

import se.lexicon.aladdin.g39recipejpaspring.models.entity.Recipe;

import java.io.Serializable;
import java.util.Set;

public class RecipeCategoryDTO implements Serializable {

    private String  id;
    private String category;
    private Set<Recipe> recipe;

    public RecipeCategoryDTO() {
    }

    public RecipeCategoryDTO(String id, String category, Set<Recipe> recipe) {
        this.id = id;
        this.category = category;
        this.recipe = recipe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<Recipe> getRecipe() {
        return recipe;
    }

    public void setRecipe(Set<Recipe> recipe) {
        this.recipe = recipe;
    }
}
