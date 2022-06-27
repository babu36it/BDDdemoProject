package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

//    Driver initialization
    public static WebDriver initiateDriver(){

        System.setProperty("webdriver.chrome.driver","src/test/java/Utilities/chromedriver.exe");

        driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in");

        return driver;

    }

//    reading the properties file
    public static Map<String, String> testData(){

//        Properties class as we are using the properties file the properties class is used to load the data
        Properties prop= new Properties();

        try {
//            Input steam is used to read the files
            FileInputStream fis= new FileInputStream("src/test/java/Utilities/testdata.properties");
//            load method is used to load the data from the mentioned properties file
            prop.load(fis);
        }catch (Exception e){
            System.out.println("Unable to find the file in the preferred location");
        }
//       Hash Map is used to store the data in Key and value pair
        Map<String,String> map= new HashMap<>();

//        Entry is used to store the data that is populated in the properties file
        for (Map.Entry<Object, Object> m1:prop.entrySet()){
            map.put((String) m1.getKey(), (String) m1.getValue());
        }

        return map;

    }



}
