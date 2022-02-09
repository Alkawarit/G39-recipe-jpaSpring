package se.lexicon.aladdin.g39recipejpaspring.models.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   @Column(updatable = false)
    private int id;
    @Column(unique = true)
    private String ingredientName;

    public Ingredient() {
    }

    public Ingredient(int id, String ingredientName) {
        this.id = id;
        this.ingredientName = ingredientName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        return id == that.id && Objects.equals(ingredientName, that.ingredientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ingredientName);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", ingredientName='" + ingredientName + '\'' +
                '}';
    }
}
