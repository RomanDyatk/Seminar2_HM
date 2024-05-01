import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal implements Swimable {
    public Snake(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner) {
        super(name, localDate, vaccinations, illness, owner);
    }

    @Override
    public void fly() {
        System.out.println("Animal can't fly");
    }

    @Override
    public void toGo() {
        System.out.println("Animal can't walks");
    }

    @Override
    public double swimm() {
        System.out.printf("%s swimming", type);
        return 20.0;
    }
}
