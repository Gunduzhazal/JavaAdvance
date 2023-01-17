package class05;

public class Vehicle {

    int noOfWheel;
    int topSpeed;

    public void printTopSpeed() {
        System.out.println(topSpeed);
    }
}

class Car extends Vehicle {
    String model;
    String make;
    int year;
}

class Tesla extends Car {
    void printInfo() {
        System.out.println("I am a Electrical Car");
    }
}

class Toyota extends Car {
    void printInfo() {
        System.out.println("I am a Combustion Engine Car");
    }
}

class Tester {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.printTopSpeed();
    }
}

