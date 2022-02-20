package se.lexicon.aladdin.g39recipejpaspring.models.dto.form;

import org.springframework.validation.annotation.Validated;
import se.lexicon.aladdin.g39recipejpaspring.models.entity.RecipeIngredient;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPost;
import se.lexicon.aladdin.g39recipejpaspring.validation.OnPut;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

import static se.lexicon.aladdin.g39recipejpaspring.validation.message.ValidationMessages.MANDATORY_FIELD;

@Validated
public class RecipeForm implements Serializable {
@NotBlank(message = MANDATORY_FIELD, groups = {OnPost.class, OnPut.class})
    private String id;
@NotBlank(message = MANDATORY_FIELD, groups = {OnPost.class,OnPut.class})
    private String recipeName;

    private RecipeIngredientForm recipeIngredient;

}
