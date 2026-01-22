package Day7;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleFrames {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
         //         FRAME-1
        //directly we cannot pass xpath
        // we have to get the frame as WebElement
       WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame_1.html']")); //return the webElement
       // switch to frame1
        driver.switchTo().frame(frame1); //passed frame as web Element
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
         // come out of frame and go back to tha page again
        driver.switchTo().defaultContent(); // go back to page

        //          FRAME-2
        WebElement frame2= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
        driver.switchTo().defaultContent();


        //         FRAME-3
        WebElement frame3= driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Testing");

        // Inner iframe Part of Frame-3
        driver.switchTo().frame(0); //switch using index as only one frame is there
       // driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
        WebElement rdbtn=driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",rdbtn);
        driver.switchTo().defaultContent();





    }


}
