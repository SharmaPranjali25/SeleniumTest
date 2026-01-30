import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.KeyStoreSpi;
import java.time.Duration;

public class KeyboardactionByAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        //         TYPING INTO AN INPUT FIELD AND PRESSING ENTER
        WebElement searchBox= driver.findElement(By.xpath("//input[@id='user-name']"));
        actions.sendKeys(searchBox,"standard_user")
                //.sendKeys(Keys.ENTER)
                .build()
                .perform();
        Thread.sleep(2000);

        // PERFORMING CTRL+A
        WebElement currentAddressField= driver.findElement(By.xpath("//input[@id='user-name']"));
        String cmdctrl= String.valueOf(Keys.CONTROL);
        //Keys.CONTROL represents Ctrl key on keyboard
        actions.keyDown(cmdctrl)//pressing ctrl key and not relaease yet
                .sendKeys("a")
                .keyUp(cmdctrl)
                .build()
                .perform();

        // PERFORMING CTRL+C AND CTRL+V
        WebElement copyaddress= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement pasteaddress= driver.findElement(By.xpath("//input[@id='password']"));
        actions.click(copyaddress)
                .keyDown(cmdctrl)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(cmdctrl)
                .click(pasteaddress)
                .keyDown(cmdctrl)
                .sendKeys("v")
                .keyUp(cmdctrl)
                .build()
                .perform();







    }
}
