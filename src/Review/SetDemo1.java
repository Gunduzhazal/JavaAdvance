package Review;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1500000);
        numbers.add(1200000);
        numbers.add(1300000);
        numbers.add(1400000);
        numbers.add(1400000);

        Set<Integer> set = new TreeSet<>(numbers);
        System.out.println(set);

        ArrayList<Integer> numbers2 = new ArrayList<>(set);
        System.out.println(numbers2);

    }
}
