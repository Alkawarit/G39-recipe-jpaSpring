package se.lexicon.aladdin.g39recipejpaspring.models.entity;



import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class Ingredient {
@Id
@GeneratedValue(generator = GENERATOR)
@GenericGenerator(name = GENERATOR, strategy = UUID_GENERATOR)
@Column(updatable = false)
    private String  id;
    @Column(unique = true)
    private String ingredientName;

    public Ingredient() {
    }

    public Ingredient(String id, String ingredientName) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Objects.equals(id, that.id) && Objects.equals(ingredientName, that.ingredientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingredientName);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id='" + id + '\'' +
                ", ingredientName='" + ingredientName + '\'' +
                '}';
    }
}
