package class01;

public class Dog {

    String name;  // instance
    static int noOfLegs = 4;
    String color;

    void bark() {
        int i = 10; // local

        for (int j=0; j<i; j++) {
            System.out.println("Barking...");
        }
    }

    void printInfo() {
        System.out.println("name " + name +" color " + color);
    }

    void printName() {
        System.out.println("name " + name);
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Tomy";
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.name = "Lucky";

    }
}