package class16;

import utils.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {

    public static void main(String[] args) {

        method2();

    }

    public static void method1()  {

        System.out.println(ExcelReader.read("/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsxx"));

    }

    public static void method2()  {
        method1();
    }
}

