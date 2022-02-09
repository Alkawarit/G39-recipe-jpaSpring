package se.lexicon.aladdin.g39recipejpaspring.models.entity;


import org.hibernate.annotations.GenericGenerator;
import se.lexicon.aladdin.g39recipejpaspring.models.constants.Measurement;

import javax.persistence.*;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;


@Entity
public class RecipeIngredient {
@Id
@GeneratedValue(generator = GENERATOR)
@GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
@Column(updatable = false)
    private String id;
    private double amount;
    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_ingredient_id")
     private Ingredient ingredient;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "fk_recipe_id")
     private Recipe recipe;

     private Measurement measurement;
    public RecipeIngredient() {
    }

    public RecipeIngredient(String id, double amount) {
        this.id = id;
        this.amount = amount;
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
}