package class16;

import utils.ExcelReader;

import java.io.IOException;

public class TypesOfExcep {

    public static void main(String[] args) throws IOException {

        try {
            System.out.println(ExcelReader.read("/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsx"));

        } catch (NullPointerException e){

        }

        System.out.println("important line of code");

    }
}
