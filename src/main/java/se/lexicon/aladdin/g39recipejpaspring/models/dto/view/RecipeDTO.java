package se.lexicon.aladdin.g39recipejpaspring.models.dto.view;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class RecipeDTO implements Serializable {

    private String id;
    private String recipeName;
    private List<RecipeIngredientDTO> recipeIngredient;
    private RecipeInstructionDTO recipeInstruction;
    private Set<RecipeCategoryDTO> categories;

    public RecipeDTO(String id,
                     String recipeName,
                     List<RecipeIngredientDTO> recipeIngredient,
                     RecipeInstructionDTO recipeInstruction,
                     Set<RecipeCategoryDTO> categories) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeIngredient = recipeIngredient;
        this.recipeInstruction = recipeInstruction;
        this.categories = categories;
    }

    public RecipeDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredientDTO> getRecipeIngredient() {
        return recipeIngredient;
    }

    public void setRecipeIngredient(List<RecipeIngredientDTO> recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
    }

    public RecipeInstructionDTO getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstructionDTO recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public Set<RecipeCategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(Set<RecipeCategoryDTO> categories) {
        this.categories = categories;
    }
}
