package Animals.Amphibias;

import Animals.Animals;

import java.util.Objects;

public class Amphibia extends Animals {

    private String habitat;

    public Amphibia(String name, int age, String habitat) {
        super(name, age);
        this.habitat = validateLines(habitat);
    }

    public Amphibia(String habitat) {
        this.habitat = habitat;
    }

    public void action() {
        System.out.println("Поохотиться");
    }

    @Override
    public void eat() {
        System.out.println("Насекомые и мелкие животные");
    }

    @Override
    public void go() {
        System.out.println("Ходят лапками или ползают");
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = validateLines(habitat);
    }

    @Override
    public String toString() {
        return  super.toString() + " Среда обитания - " +  habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibia)) return false;
        if (!super.equals(o)) return false;
        Amphibia amphibia = (Amphibia) o;
        return habitat.equals(amphibia.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
