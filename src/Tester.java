
public class Tester {
    public static void main(String[] args) {
        Animal basicAnimal = new Animal("Basic Animal");
        Lion lion = new Lion("Lion");
        Cow cow = new Cow("Cow");

        basicAnimal.animalSound();
        lion.animalSound();
        cow.animalSound();
    }
}
