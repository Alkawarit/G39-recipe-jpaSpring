package se.lexicon.aladdin.g39recipejpaspring.models.dto;

import java.io.Serializable;

public class IngredientDTO implements Serializable {

    private String  id;
    private String ingredientName;

    public IngredientDTO() {
    }

    public IngredientDTO(String id, String ingredientName) {
        this.id = id;
        this.ingredientName = ingredientName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
