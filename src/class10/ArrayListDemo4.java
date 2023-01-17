package class10;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Hazel");
        names.add("Gunduz");
        names.add("MJ");
        names.set(2, "Hazel Again");
        System.out.println(names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1, 100);
        numbers.set(0, 120);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);

    }

}
