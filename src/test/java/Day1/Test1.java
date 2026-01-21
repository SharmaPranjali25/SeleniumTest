package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
    @Test
    void setup() throws InterruptedException {
        // WebDriver-> interface
        // WebDriver has method and ChromeDriver has implementation
        //ChromeDriver driver= new ChromeDriver();
        WebDriver driver= new ChromeDriver(); //object creation of Chrome Driver
        driver.get("https://www.google.com/");
        Thread.sleep(3000); //open and close after 3sec
        driver.close();



    }


}

