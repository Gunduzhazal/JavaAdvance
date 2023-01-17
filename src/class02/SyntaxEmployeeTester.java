package class02;

public class SyntaxEmployeeTester {

    public static void main(String[] args) {

        SyntaxEmployee hazel = new SyntaxEmployee();
        hazel.empId = "123";
        hazel.salary = 100000;

        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee emp = new SyntaxEmployee();
        emp.empId = "123";
        emp.salary = 200000;

        System.out.println(SyntaxEmployee.CEO);
    }
}
