package se.lexicon.aladdin.g39recipejpaspring.models.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class RecipeCategory {
@Id
@GeneratedValue(generator = GENERATOR)
@GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
@Column(updatable = false)
    private String  id;
    private String category;

    @ManyToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "recipe_recipe_category",
            joinColumns = @JoinColumn(name = "fk_recipe_id", table = "recipe_recipe_category"),
            inverseJoinColumns = @JoinColumn(name = "recipe_category_id", table="recipe_recipe_category")
    )
    private Set<Recipe> recipe;

    public RecipeCategory() {
    }

    public RecipeCategory(String  id, String category) {
        this.id = id;
        this.category = category;
    }

    public String  getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return Objects.equals(id, that.id) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
