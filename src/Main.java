import hw.family.Human;
import hw.family.Pet;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("dog","Rock",5,75,new String[]{"eat", "drink", "sleep"});
        Human human = new Human("Michael","Karleone", 1977,90,
                      new Human().getMother(),new Human().getFather(),pet);
        human.greetPet();
        System.out.println(human.describePet());
        System.out.println(pet.respond());
    }
}