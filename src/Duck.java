import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{
    public Duck(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner) {
        super(name, localDate, vaccinations, illness, owner);
    }


}
