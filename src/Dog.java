import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal {

    public Dog(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner) {
        super(name, localDate, vaccinations, illness, owner);
    }
}
