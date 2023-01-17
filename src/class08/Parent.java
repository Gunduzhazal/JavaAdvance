package class08;

public class Parent {

    static void print() {
        System.out.println("Hello World");
    }
}

    class Child extends Parent {

        static void print() {
            System.out.println("Hello there");
        }
    }

    class Test {

    public static void main(String[] args) {
        Child.print();
    }
}
