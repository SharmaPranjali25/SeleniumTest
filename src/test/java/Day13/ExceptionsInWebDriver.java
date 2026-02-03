package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsInWebDriver {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
       //  1 . NO SUCH ELEMENT EXCEPTION
        //     driver.findElement(By.xpath("//input[@value='Loginxxx']")).click();

        //2. NO SUCH WINDPW EXCEPTION
        //driver.switchTo().window("anywindowname");

        //3. NO SUCH FRAME EXCEPTION
        //driver.switchTo().frame("abcd");

        //4. NO SUCH ALERT EXCEPTION
        //driver.switchTo().alert();

        //5. INVALID SELECTOR EXCEPTION
        driver.get("http://omayo.blogspot.com/");
        //driver.findElement(By.xpath("///input[@value='Login']")).click();

        //6. ELEMENT NOT INTERACTABLE EXCEPTION
        //driver.findElement(By.id("hbutton")).click();

        //7. NO SUCH SESSION EXCEPTION
        driver.quit();
        driver.findElement(By.xpath("//input[@value='Login']")).click();


    }
}
