package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        //                   implicit wait
        // must declare immediately after driver object creation only
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        //                   explicit wait
//        WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(5));
//        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

        //                    FLUENT WAIT

        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
       // driver.quit();






    }

}
