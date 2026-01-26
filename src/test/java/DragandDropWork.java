import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragandDropWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        //switch to iframe

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        //DRAG AND DROP
        WebElement drag= driver.findElement(By.xpath("//h5[text()='High Tatras']"));
        WebElement drop= driver.findElement(By.xpath("//div[@id='trash']"));
        Actions act= new Actions(driver);
        //act.contextClick(drag).perform();
        //Thread.sleep(3000);
        act.dragAndDrop(drag,drop).perform();
        Thread.sleep(3000);




    }

}
