package class13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        /*
        Collection<String> allKeys = fruit.keySet();
        System.out.println(allKeys);

        Iterator<String> iterator = allKeys.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.contains("n")) {
                iterator.remove();
            }

        }
        */

        fruit.keySet().removeIf(x-> x.contains("n"));
        System.out.println(fruit);
    }
}
