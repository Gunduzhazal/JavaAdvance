package class08;

public class AnimalTester {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.sleep();
        cat.eat();

        Animal animal = new Panda();

        Animal animal1 = new Cat();

        Animal[] animals = {new Cat(), new Panda()};
    }
}
