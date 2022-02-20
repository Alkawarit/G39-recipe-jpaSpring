package se.lexicon.aladdin.g39recipejpaspring.models.dto.form;

import org.springframework.validation.annotation.Validated;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPost;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPut;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

import static se.lexicon.aladdin.g39recipejpaspring.validation.message.ValidationMessages.MANDATORY_FIELD;


@Validated
public class RecipeInstructionForm implements Serializable {

    @NotBlank(message = MANDATORY_FIELD, groups = OnPost.class)
    private String id;
    @NotBlank(message = MANDATORY_FIELD)
    private String instructions;

    public RecipeInstructionForm() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
