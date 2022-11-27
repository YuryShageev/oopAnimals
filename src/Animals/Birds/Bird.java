package Animals.Birds;

import Animals.Animals;

import java.util.Objects;

public class Bird extends Animals {

    private String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        this.habitat = validateLines(habitat);
    }

    public Bird(String habitat) {
        this.habitat = validateLines(habitat);
    }

    public void hunt() {
        System.out.println("Днём только");
    }

    @Override
    public void eat() {
        System.out.println("Что попало");
    }

    @Override
    public void go() {
        System.out.println("Летают или ходят");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateLines(habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Среда обитания - " + habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return getName() == bird.getName() && Objects.equals(getName(), bird.getName()) && Objects.equals(getAge(), bird.getAge())
                && Objects.equals(getHabitat(), bird.getHabitat());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHabitat());
    }
}
