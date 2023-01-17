package class07;

public class Parent {

    void getMarry() {
        System.out.println("You will marry with that girl");
    }
}

class Zam extends Parent {

    void getMarry() {
        System.out.println("I want to marry with Taylor");
    }
}

class Test {

    public static void main(String[] args) {

        Zam zam = new Zam();
        zam.getMarry();
    }
}
