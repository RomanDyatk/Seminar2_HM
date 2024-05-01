import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal implements Goable{
    private int legsCount;
    public Cat(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, localDate, vaccinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void fly() {
        System.out.println("Animal can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Animal can't swimming");
    }

    @Override
    public double run() {
        System.out.printf("%s going", type);
        return 25.0;
    }
}
