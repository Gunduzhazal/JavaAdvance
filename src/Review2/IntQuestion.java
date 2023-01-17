package Review2;

import java.util.HashMap;
import java.util.Map;

public class IntQuestion {

    // Create a method that returns a map of characters and their count in a String

    public static void main(String[] args) {

        String str = "bdfjhdfbewqbcnsdfsdf";

        System.out.println(getCount(str));
    }

    public static Map<Character, Integer> getCount(String str) {
        char[] charArr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char niazi : charArr) {

            if (map.get(niazi) == null) {
                map.put(niazi, 1);
            } else {
                int count = map.get(niazi);
                count = count + 1;
                map.put(niazi, count);
            }
        }

        return map;
    }
}
