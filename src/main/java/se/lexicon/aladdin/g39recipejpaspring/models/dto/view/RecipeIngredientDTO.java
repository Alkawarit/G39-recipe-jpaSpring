package se.lexicon.aladdin.g39recipejpaspring.models.dto.view;

import se.lexicon.aladdin.g39recipejpaspring.models.constants.Measurement;

import java.io.Serializable;

public class RecipeIngredientDTO implements Serializable {

    private String id;
    private double amount;
    private IngredientDTO ingredient;
    private RecipeDTO recipe;
    private Measurement measurement;

    public RecipeIngredientDTO(String id,
                               double amount,
                               IngredientDTO ingredient,
                               RecipeDTO recipe,
                               Measurement measurement) {
        this.id = id;
        this.amount = amount;
        this.ingredient = ingredient;
        this.recipe = recipe;
        this.measurement = measurement;
    }

    public RecipeIngredientDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public IngredientDTO getIngredient() {
        return ingredient;
    }

    public void setIngredient(IngredientDTO ingredient) {
        this.ingredient = ingredient;
    }

    public RecipeDTO getRecipe() {
        return recipe;
    }

    public void setRecipe(RecipeDTO recipe) {
        this.recipe = recipe;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }
}
