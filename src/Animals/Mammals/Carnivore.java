package Animals.Mammals;

import java.util.Objects;

public class Carnivore extends Mammals{
    private String foodType;

    public Carnivore(String name, int age, String habitat, float movementSpeed, String foodType) {
        super(name, age, habitat, movementSpeed);
        this.foodType = validateLines(foodType);
    }

    public Carnivore(String habitat, float movementSpeed, String foodType) {
        super(habitat, movementSpeed);
        this.foodType = validateLines(foodType);
    }

    public void action() {
        System.out.println("Поохотиться");
    }
    @Override
    public void eat() {
        System.out.println("Животная пища");
    }

    @Override
    public void go() {
        System.out.println("Лапами");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = validateLines(foodType);
    }

    @Override
    public String toString() {
        return super.toString() + " Вид пищи  - " + foodType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carnivore)) return false;
        if (!super.equals(o)) return false;
        Carnivore carnivore = (Carnivore) o;
        return getName() == carnivore.getName() && Objects.equals(getName(), carnivore.getName()) && Objects.equals(getAge(), carnivore.getAge())
                && Objects.equals(getHabitat(), carnivore.getHabitat()) && Objects.equals(getMovementSpeed(), carnivore.getMovementSpeed())
                && Objects.equals(getFoodType(), carnivore.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }
}
