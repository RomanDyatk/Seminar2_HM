import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Animal {
    private String name;
    private LocalDate localDate;
    private List<String> vaccinations;
    private String illness;
    private String owner;

    public Animal(String name, LocalDate localDate, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.localDate = localDate;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    private void wakeup(){
        System.out.println("Animal is wakeup");
    }

    private void eat(){
        System.out.println("Animal ate");
    }

    private void play(){
        System.out.println("Animal played");
    }

    private void sleep(){
        System.out.println("Animal sleeping");
    }

    public void toGo(){
        System.out.println("Animal walks");
    }

    public void fly(){
        System.out.println("Animal flies");
    }

    public void swim(){
        System.out.println("Animal swimming");
    }

    public void lifeCycle(){
        wakeup();
        eat();
        play();
        sleep();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", localDate=" + localDate +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
