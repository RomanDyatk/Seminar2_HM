public class Doctor {
    private String name;
    private String specialization;
    private Integer experience;
    private Integer officeNumber;
    private Nurse nurse;

    public Doctor(String name, String specialization, Integer experience, Integer officeNumber, Nurse nurse) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.officeNumber = officeNumber;
        this.nurse = nurse;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Integer getExperience() {
        return experience;
    }

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void getRecommendations(Animal animal){
        if(animal.getIllness().equals("чумка")){
            System.out.println("Вы серьёзно больны! Срочно пройдите полный курс лечения");
        } else if (animal.getIllness().equals("перелом ноги")) {
            System.out.println("Наложите гипс, и оставляйте ногу в покое");
        }
    }

    public void getTimetable(){
        System.out.println("Четные дни: с 8:00 до 18:00\n" +
                "Нечётные дни: c 10:00 до 16:00\n" +
                "сб, вс: Выходной");
    }
}
