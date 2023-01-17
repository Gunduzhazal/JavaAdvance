package class01;

public class LocalVariableDemo {
    String name = "Confused";

    public static void main(String[] args) {

        int number = 0;
        System.out.println();

        for (int i=0; i<10; i++) {
            System.out.println(i);
        }
    }

    void displayNum() {
        int number = 4;
        String name = "Allan";
        System.out.println(name);
        // System.out.println(number);  we cannot access 'number' variable outside the main.

    }
}
