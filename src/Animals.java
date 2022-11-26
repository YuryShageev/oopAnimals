import java.util.Objects;

public class Animals {

    private String name;
    private int age;


    public Animals(String name, int age) {
        this();
        this.name = validateLines(name);

        String comment = "";
        String ageComment = "Возраст не указан";
        if (age == 0) {
            comment = ageComment;
        } else if (age < 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }
    public Animals() {
        name = "Животное";
        age = 0;
    }

    public void eat() {
        System.out.println("Я не ем после шести");
    }

    public void go() {
        System.out.println("Мы с Тамарой ходим парой");
    }

    public void sleep() {
        System.out.println("Сова или жаворонок");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String validateLines(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? "Данные не указаны" : value;
    }

    @Override
    public String toString() {
        return "Название животного" + name + '\'' +
                ", Возраст животного " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animals animal = (Animals) obj;
        return name == animal.getName() && Objects.equals(name, animal.getName()) && Objects.equals(age, animal.getAge());
    }
}
