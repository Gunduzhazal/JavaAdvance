package class15;

import class13.Dog;
import utils.ExcelReader;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MethodsDemo {

    public static Dog returnDog() {
        return new Dog("Fuff", "green", "German");
    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("Apple", "Mango");

        return map;
    }

    public static void main(String[] args) throws IOException {

        Dog dog = returnDog();
        System.out.println(dog);

        System.out.println(getMap());

        var data = ExcelReader.read("/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsx");

        System.out.println(data.get(1));
        Map<String, String> map = data.get(1);
        System.out.println(map.get("Age"));
    }
}
