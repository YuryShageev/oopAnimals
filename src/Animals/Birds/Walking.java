package Animals.Birds;

import java.util.Objects;

public class Walking extends Bird{

    private String movementType;

    public Walking(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = validateLines(movementType);
    }

    public Walking(String habitat, String movementType) {
        super(habitat);
        this.movementType = validateLines(movementType);
    }

    public void action() {
        System.out.println("Летать");
    }

    @Override
    public void eat() {
        System.out.println("Ест насекомых и мелких животных");
    }

    @Override
    public void go() {
        System.out.println("Ходят");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = validateLines(movementType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Метод передвижения" + movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Walking walking = (Walking) o;
        return getName() == walking.getName() && Objects.equals(getName(), walking.getName()) && Objects.equals(getAge(), walking.getAge())
                && Objects.equals(getHabitat(), walking.getHabitat()) && Objects.equals(getMovementType(), walking.getMovementType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }
}
