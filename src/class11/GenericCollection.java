package class11;

import java.util.ArrayList;

public class GenericCollection {

    public static void main(String[] args) {

        ArrayList names = new ArrayList();
        names.add("Serhi");
        names.add(10);

        System.out.println(((String)names.get(0)).length());
    }
}
