package se.lexicon.aladdin.g39recipejpaspring.models.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    private String recipeName;
    @OneToMany(
            cascade = {CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY,
            orphanRemoval = true,
            mappedBy = "recipe"
    )
    private Set<RecipeIngredient> recipeIngredient;
    public Recipe(int id, String recipeName) {
        this.id = id;
        this.recipeName = recipeName;
    }

    public Recipe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

}
