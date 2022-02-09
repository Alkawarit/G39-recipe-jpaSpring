package se.lexicon.aladdin.g39recipejpaspring.models.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    private String category;

    public RecipeCategory() {
    }

    public RecipeCategory(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
