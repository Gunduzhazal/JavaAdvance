package class04;

public class Task2 {

    /*  Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.  */

    private Task2(){
        System.out.println("private");
    }

    Task2(String name){
        System.out.println("Default");
    }

    protected Task2(int age){
        System.out.println("protected");
    }

    public Task2(boolean isTrue){
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task2();
        new Task2("Thank you");
        new Task2(10);
        new Task2(true);

    }

}
