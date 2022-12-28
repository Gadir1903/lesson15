package hw.family;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;


    public Pet(String species , String nickname){
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    // Getter & Setter

    public String getSpices() {
        return species;
    }

    public void setSpices(String spices) {
        this.species = spices;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int gettrickLevel() {
        return trickLevel;
    }

    public void setAgeLevel(int ageLevel) {
        this.trickLevel = ageLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    // Methods

    public String eat(){
        return "i'm eating";
    }
    public String respond(){
        return "Hello, owner. I am " + getNickname() + ". I miss you!";
    }
    public String foul(){
        return "I need to cover it up";
    }
}
