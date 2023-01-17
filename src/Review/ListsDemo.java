package Review;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListsDemo {

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        System.out.println(animals);

        for (String animal : animals) {
            System.out.println(animal.length());
        }

        for (int i=0; i<animals.size(); i++) {
            if (animals.get(i).length()>4) {
                animals.set(i, "Camel");
            }
        }
        System.out.println(animals);

        System.out.println(animals.subList(0,3));

        ListIterator<String> stringListIterator = animals.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }
    }
}
