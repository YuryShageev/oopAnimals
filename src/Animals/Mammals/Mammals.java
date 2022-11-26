package Animals.Mammals;

import Animals.Animals;

import java.util.Objects;

public abstract class Mammals extends Animals {
    private String habitat;
    private float movementSpeed;

    public Mammals(String name, int age, String habitat, float movementSpeed) {
        super(name, age);
        this.habitat = validateLines(habitat);

        String speedComment = "Не двигается";
        if (movementSpeed == 0) {
            speedComment = "Стоит";
        } else if (movementSpeed < 0) {
            speedComment = "Движется в обратном направлении";
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    public Mammals(String habitat, float movementSpeed) {
        this.habitat = habitat;
        this.movementSpeed = movementSpeed;
    }

    public void walk() {
        System.out.println("По ночам");
    }

    @Override
    public void eat() {
        System.out.println("Растительная пища или животная");
    }

    @Override
    public void go() {
        System.out.println("Лапами");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateLines(habitat);
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(float movementSpeed) {
        String speedComment = "Не двигается";
        if (movementSpeed == 0) {
            speedComment = "Стоит";
        } else if (movementSpeed < 0) {
            speedComment = "Движется в обратном направлении";
        } else {
            this.movementSpeed = movementSpeed;
        };
    }

    @Override
    public String toString() {
        return super.toString() + " Среда обитания " + getHabitat() + '\'' +
                ", Скорость передвижения " + getMovementSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getAge(),getHabitat(),getMovementSpeed());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mammals mammal = (Mammals) obj;
        return getName() == mammal.getName() && Objects.equals(getName(), mammal.getName()) && Objects.equals(getAge(), mammal.getAge())
                && Objects.equals(getHabitat(), mammal.getHabitat()) && Objects.equals(getMovementSpeed(), mammal.getMovementSpeed());
    }
}
