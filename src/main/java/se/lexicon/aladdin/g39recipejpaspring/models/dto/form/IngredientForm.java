package se.lexicon.aladdin.g39recipejpaspring.models.dto.form;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Validated
public class IngredientForm implements Serializable {

    @NotBlank
    private String  id;
    @NotBlank
    private String ingredientName;

    public IngredientForm(String id, String ingredientName) {
        this.id = id;
        this.ingredientName = ingredientName;
    }

    public IngredientForm() {
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
