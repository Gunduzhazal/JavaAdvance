package class11;

import java.util.ArrayList;

public class IteratorDemo4WithLambda {

    public static void main(String[] args) {

        // delete all the products which start with letter B or ends with letter a

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");

        beautyProducts.removeIf(x -> x.startsWith("B"));
        System.out.println(beautyProducts);
    }
}
