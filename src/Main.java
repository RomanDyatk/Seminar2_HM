import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", LocalDate.of(2000, 5, 9), new ArrayList<>(),"чумка", "Иванов",4);
        System.out.println(barsik);
        Animal bobik = new Dog("Бобик", LocalDate.of(1990, 1, 23), new ArrayList<>(),"чумка", "Иванов");
        Duck duck = new Duck("Дак", LocalDate.of(1995, 3, 13), new ArrayList<>(),"чумка", "Иванов");
        Snake snake = new Snake("Снэк", LocalDate.of(2010, 10, 1), new ArrayList<>(),"чумка", "Иванов");

        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(bobik);
        animals.add(duck);
        animals.add(snake);
        System.out.println("=================================================");

        barsik.lifeCycle();
        System.out.println("==================================================");
        duck.fly();
        duck.swim();
        duck.toGo();
        System.out.println("===================================================");
        snake.fly();
        snake.swim();
        snake.toGo();


    }
}