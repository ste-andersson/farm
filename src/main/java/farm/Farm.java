package farm;

public class Farm {

    public static void main(String[] args) {
        Duck john = new Duck();
        Pig alfred = new Pig();
        Animal elaine = new Duck();

        john.makeSound();
        alfred.makeSound();
        ((Duck) elaine).makeSound();

        john.eat();
        alfred.eat();
        elaine.eat();
    }
}
