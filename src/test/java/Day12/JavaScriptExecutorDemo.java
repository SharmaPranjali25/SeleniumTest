package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        //in place of sendKeys
      //  [0]: whatever first value be giving there that action to perform
        js.executeScript("arguments[0].setAttribute('value','Watch')",search);
        Thread.sleep(3000);
        WebElement searchbtn= driver.findElement(By.xpath("//button[normalize-space()='Search']"));
        js.executeScript("arguments[0].click()",searchbtn);






    }

}
