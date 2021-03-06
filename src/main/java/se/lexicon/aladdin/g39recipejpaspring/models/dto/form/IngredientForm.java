package se.lexicon.aladdin.g39recipejpaspring.models.dto.form;

import org.springframework.validation.annotation.Validated;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPut;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

import static se.lexicon.aladdin.g39recipejpaspring.validation.message.ValidationMessages.MANDATORY_FIELD;

@Validated
public class IngredientForm implements Serializable {

    @NotBlank(message = MANDATORY_FIELD, groups = OnPut.class)
    private String  id;
    @NotBlank(message = MANDATORY_FIELD)
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
