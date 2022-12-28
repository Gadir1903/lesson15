package hw.family;

public class Human {
    public Human() {
    }
    private String name;
    private String surname;
    private int dob;
    private int iqLvl;
    private Pet pet;
    private Human mother;
    private Human father;
    private int[][] schedule;

    public Human(String name, String surname, int dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public Human(String name, String surname, int dob, int iqLvl, Human mother, Human father, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.iqLvl = iqLvl;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dob, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dob, int iqLvl, Pet pet, Human mother, Human father, int[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.iqLvl = iqLvl;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getIqLvl() {
        return iqLvl;
    }

    public void setIqLvl(int iqLvl) {
        this.iqLvl = iqLvl;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public int[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(int[][] schedule) {
        this.schedule = schedule;
    }

    // Methods

    public String greetPet(){
        return "Hello";
    }
    public String describePet(){
        var s = "I have a" + " " + pet.getSpices() + " " + "he is" + " " + pet.getAge() + " " +
                "years old, he is" + " " + " " ;
        return s;
    }
//    public String sly() {
//        if (pet.gettrickLevel() > 50) {
//            System.out.println("very sly");
//        } else {
//            System.out.println("sly");
//        }
//    }
}
