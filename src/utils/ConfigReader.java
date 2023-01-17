package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties read (String path)  {

        var properties = new Properties();

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);

        }catch ( FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){

        }
        finally {

            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}