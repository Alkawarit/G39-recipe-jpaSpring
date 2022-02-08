package se.lexicon.aladdin.g39recipejpaspring.models.entity;

import org.hibernate.annotations.GenericGenerator;
import se.lexicon.aladdin.g39recipejpaspring.models.constants.Measurement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.GENERATOR;
import static se.lexicon.aladdin.g39recipejpaspring.models.constants.EntityConstants.UUID_GENERATOR;

@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(generator = GENERATOR)
    @GenericGenerator(name = GENERATOR,strategy = UUID_GENERATOR)
    @Column(updatable = false)
    private String id;
    private double amount;
    private Measurement measurement;

    public RecipeIngredient() {
    }

    public RecipeIngredient(String id, double amount, Measurement measurement) {
        this.id = id;
        this.amount = amount;
        this.measurement = measurement;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(id, that.id) && measurement == that.measurement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, measurement);
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", measurement=" + measurement +
                '}';
    }
}
