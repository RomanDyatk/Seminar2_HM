import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal{
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
}
