import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", LocalDate.of(2000, 5, 9), new ArrayList<>(),"чумка", "Иванов",4);
        Animal bobik = new Dog("Бобик", LocalDate.of(1990, 1, 23), new ArrayList<>(),"перелом ноги", "Иванов");
        Duck duck = new Duck("Дак", LocalDate.of(1995, 3, 13), new ArrayList<>(),"чумка", "Иванов");
        Snake snake = new Snake("Снэк", LocalDate.of(2010, 10, 1), new ArrayList<>(),"чумка", "Иванов");
        Nurse nurse = new Nurse("Ирина", 2);
        Doctor doctor = new Doctor("Иван", "Ветеринар", 5, 10, nurse);
        doctor.getRecommendations(duck);
        doctor.getRecommendations(bobik);
        doctor.getTimetable();
        nurse.giveAnInjection(barsik);
        System.out.println();
        nurse.getReference();

//        List<Animal> animals = new ArrayList<>();
//        animals.add(barsik);
//        animals.add(bobik);
//        animals.add(duck);
//        animals.add(snake);
//        System.out.println("=================================================");
//
//        barsik.lifeCycle();
//        System.out.println("==================================================");
//        duck.fly();
//        duck.swim();
//        duck.toGo();
//        System.out.println("===================================================");
//        snake.fly();
//        snake.swim();
//        snake.toGo();
        System.out.println();
        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();
        veterinaryClinic.addPatients(barsik, bobik, duck, snake);
        System.out.println(veterinaryClinic.getPatients());
        System.out.println(veterinaryClinic.getGoables());
        System.out.println(veterinaryClinic.getFlyables());
        System.out.println(veterinaryClinic.getSwimables());
        barsik.swim();



    }
}