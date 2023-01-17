package class11;

import java.util.ArrayList;

public class IteratorDemo3 {

    public static void main(String[] args) {

        // delete all the products which start with letter B or ends with letter a

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");

        var iterator = beautyProducts.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.startsWith("B")||item.endsWith("a")) {
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }
}
