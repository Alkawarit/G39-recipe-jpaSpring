package se.lexicon.aladdin.g39recipejpaspring.models.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class Recipe {
@Id
@GeneratedValue(generator = GENERATOR)
@GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
@Column(updatable = false)
    private String id;
    private String recipeName;
    @OneToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "recipe"
    )
    private List<RecipeIngredient> recipeIngredient;

    @OneToOne(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY
    )
    private RecipeInstruction recipeInstruction;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "recipe"
    )
    private Set<RecipeCategory> categories;

    public Recipe(String  id, String recipeName, RecipeInstruction recipeInstruction) {
        this.id = id;
        this.recipeName = recipeName;
        this.recipeInstruction = recipeInstruction;
    }

    public Recipe() {
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

}
