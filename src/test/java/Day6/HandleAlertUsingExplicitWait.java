package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlertUsingExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait declaration
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(4000);
       Alert myalert=mywait.until(ExpectedConditions.alertIsPresent()); // this condition become true whenever alert is open
        //and return alert into a variable : myalert
        System.out.println(myalert.getText());
        myalert.accept();


    }

}
