package Review2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FileDemo1 {

    public static void main(String[] args) throws IOException {

        System.out.println(getProperty("password"));
    }

    public static String getProperty(String key) throws IOException {

            String path="/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/config.properties";
            FileInputStream fis=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fis);
            return properties.getProperty(key);

        }
}
