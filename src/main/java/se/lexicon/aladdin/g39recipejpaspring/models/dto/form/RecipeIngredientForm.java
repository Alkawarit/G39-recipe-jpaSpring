package se.lexicon.aladdin.g39recipejpaspring.models.dto.form;

import org.springframework.validation.annotation.Validated;
import se.lexicon.aladdin.g39recipejpaspring.models.constants.Measurement;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPost;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPut;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

import static se.lexicon.aladdin.g39recipejpaspring.validation.message.ValidationMessages.MANDATORY_FIELD;

@Validated
public class RecipeIngredientForm implements Serializable {

    @NotBlank(message = MANDATORY_FIELD, groups = OnPost.class)
    private String id;
    @NotBlank(message = MANDATORY_FIELD, groups = {OnPost.class, OnPut.class})
    private double amount;

    private Measurement measurement;

    public RecipeIngredientForm() {
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

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }
}
