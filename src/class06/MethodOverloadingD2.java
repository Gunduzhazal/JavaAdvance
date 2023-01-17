package class06;

public class MethodOverloadingD2 {

    private static MethodOverloading md;

    void F1(String name, int number) {
        System.out.println("1");
    }

    void F1(String name, int number, int number2) {
        System.out.println("2");
    }

    void F1(int number, String name) {
        System.out.println("4");
    }

    public static void main(String[] args) {
        MethodOverloadingD2 md = new MethodOverloadingD2();
        md.F1("Taras", 20);
    }
}
