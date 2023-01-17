package class12;


import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        LinkedList<String> linkedList  =new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {

            linkedList.add(0,"Test");
        }

        long endTime = System.currentTimeMillis();

        System.out.println("LinkedList "+(endTime-startTime));

    }
}
