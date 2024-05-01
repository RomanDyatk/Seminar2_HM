public class Nurse {
    private String name;
    private Integer experience;

    public Nurse(String name, Integer experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void giveAnInjection(Animal animal){
        System.out.printf("%s injection given", animal.type);
    }

    public void getReference(){
        System.out.println("Справка выдана больному");
    }
}
