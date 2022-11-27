import Animals.Amphibias.Amphibia;
import Animals.Birds.Flying;
import Animals.Mammals.Carnivore;
import Animals.Mammals.Herbivore;

public class Main {

    public static void main(String[] args) {
        Herbivore[] herbivores = {
                new Herbivore("Газель", 3, "Саванна", 67.5f, "Трава"),
                new Herbivore("Жираф", 14, "Африка", 22.4f, "Трава и листья"),
                new Herbivore("Лошадь", 7, "Везде", 50f, "Трава и яблоки")
        };

        for (int i = 0; i < herbivores.length; i++) {
            System.out.println(herbivores[i]);
            herbivores[i].eat();
            herbivores[i].go();
            herbivores[i].sleep();
            herbivores[i].action();
        }

        Carnivore[] carnivores = {
                new Carnivore("Гиена", 4, "Африка", 35f, "Мелкие животные"),
                new Carnivore("Тигр", 13, "Тайга", 44f, "Животные и люди"),
                new Carnivore("Медведь", 20, "Прохладные леса", 33f, "Рыба и млекопитающие"),
                new Carnivore("Волк", 12,"Лес",  39f, "Зайцы")
        };
        for (int i = 0; i < carnivores.length; i++) {
            System.out.println(carnivores[i]);
            carnivores[i].eat();
            carnivores[i].go();
            carnivores[i].sleep();
            carnivores[i].action();
        }

        Amphibia[] amphibias = {
                new Amphibia("Лягушка", 2, "Болото"),
                new Amphibia("Уж пресноводный", 1, "Близ водоёмов и рек")
        };
        for (int i = 0; i < amphibias.length; i++) {
            System.out.println(amphibias[i]);
            amphibias[i].eat();
            amphibias[i].go();
            amphibias[i].action();
        }

        Flying[] flyings = {
                new Flying("Чайка", 6, "Прибрежные территории", "Летает"),
                new Flying("Альбатрос", 3, "Север океанов", "Летает"),
                new Flying("Сокол", 8, "Холмистая и горная местость", "Летает")
        };

        for (int i = 0; i < flyings.length; i++) {
            System.out.println(flyings[i]);
            flyings[i].eat();
            flyings[i].go();
            flyings[i].action();
        }

    }
}
