package class14;

import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {

    public static void main(String[] args) {

        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        /*
        Iterator<Double> iterator = items.values().iterator();
        while (iterator.hasNext()) {
            Double price = iterator.next();
            if (price > 10) {
                iterator.remove();
            }
        }

        System.out.println(items);

         */

        items.values().removeIf(price -> price>10);
        System.out.println(items);
    }

}
