package class14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {

    public static void main(String[] args) throws IOException {

        var path = "/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/config.properties";

        var fileInputStream = new FileInputStream(path);

        var properties = new Properties();

        properties.load(fileInputStream);

        System.out.println(properties.getProperty("URl"));

        System.out.println(properties.getProperty("password"));

        fileInputStream.close();


    }
}
