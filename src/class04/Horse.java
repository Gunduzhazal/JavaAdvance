package class04;

public class Horse extends Animal {

    public Horse(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Horse horseObj = new Horse("Sprit", "Stallation", 20, 400);
        horseObj.printInfo();
    }
}
