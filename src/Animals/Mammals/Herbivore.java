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

    public void action() {
        System.out.println("Попастись");
    }

    @Override
    public void eat() {
        System.out.println("Растительная пища");
    }

    @Override
    public void go() {
        System.out.println("Ходят ногами");
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
        return getName() == herbivore.getName() && Objects.equals(getName(), herbivore.getName()) && Objects.equals(getAge(), herbivore.getAge())
                && Objects.equals(getHabitat(), herbivore.getHabitat()) && Objects.equals(getMovementSpeed(), herbivore.getMovementSpeed())
                && Objects.equals(getFoodType(), herbivore.getFoodType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodType);
    }

    @Override
    public String toString() {
        return super.toString() + " Пища - " + getFoodType();
    }
}
