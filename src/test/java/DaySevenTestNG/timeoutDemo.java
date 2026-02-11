package DaySevenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeoutDemo {

    @Test(timeOut = 2000)
    public void test1(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
