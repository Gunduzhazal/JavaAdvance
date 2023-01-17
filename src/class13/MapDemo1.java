package class13;

import java.util.HashMap;

public class MapDemo1 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango",2.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Mango");
        System.out.println(fruit);

        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(4.99));
        System.out.println(fruit.isEmpty());

        fruit.replace("Apple", 2.99);
        System.out.println(fruit);
    }
}
