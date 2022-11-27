package Animals.Birds;

import java.util.Objects;

public class Flying extends Bird {

    private String movementType;

    public Flying(String name, int age, String habitat, String movementType) {
        super(name, age, habitat);
        this.movementType = validateLines(movementType);
    }

    public Flying(String habitat, String movementType) {
        super(habitat);
        this.movementType = validateLines(movementType);
    }

    public void action() {
        System.out.println("Гулять");
    }

    @Override
    public void eat() {
        System.out.println("Ест насекомых и мелких животных");
    }

    @Override
    public void go() {
        System.out.println("Летают");
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = validateLines(movementType);
    }

    @Override
    public String toString() {
        return super.toString() + ", Метод передвижения - " + getMovementType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return getName() == flying.getName() && Objects.equals(getName(), flying.getName()) && Objects.equals(getAge(), flying.getAge())
                && Objects.equals(getHabitat(), flying.getHabitat()) && Objects.equals(getMovementType(), flying.getMovementType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMovementType());
    }
}
