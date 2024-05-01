import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Swimable, Goable{
    public Duck(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner) {
        super(name, localDate, vaccinations, illness, owner);
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 5.0;
    }

    @Override
    public double swimm() {
        System.out.printf("%s swimming", type);
        return 10.0;
    }
}
