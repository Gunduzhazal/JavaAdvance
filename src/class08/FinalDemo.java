package class08;

public class FinalDemo {

    public static void main(String[] args) {

        Phone phone = new Phone();
    }
}

class Phone {
    final int RAM = 12;

    void takePics() {
        final int number = 10;
    }
}

final class Iphone extends Phone {
    void takePics() {

    }
}
