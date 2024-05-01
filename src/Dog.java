import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Goable, Swimable {

    public Dog(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner) {
        super(name, localDate, vaccinations, illness, owner);
    }

    @Override
    public void fly() {
        System.out.println("Animal can't fly");
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 30.0;
    }

    @Override
    public double swimm() {
        System.out.printf("%s swimming", type);
        return 2.0;
    }
}
