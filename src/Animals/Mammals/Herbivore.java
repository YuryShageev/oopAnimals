package Animals.Mammals;

import java.util.Objects;

public class Herbivore extends Mammals {
    private String foodType;


    public Herbivore(String name, int age, String habitat, float movementSpeed, String foodType) {
        super(name, age, habitat, movementSpeed);

        this.foodType = validateLines(foodType);
    }

    public Herbivore(String habitat, float movementSpeed, String foodType) {
        super(habitat, movementSpeed);

        this.foodType = validateLines(foodType);
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivore)) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return foodType.equals(herbivore.foodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}
