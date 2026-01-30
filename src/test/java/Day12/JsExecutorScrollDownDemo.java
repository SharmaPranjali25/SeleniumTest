package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorScrollDownDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;

        //1. SCROLL BY PIXELS
        //js.executeScript("window.scrollBy(0,1000)");
        js.executeScript("window.scrollBy({top:1000, left:0, behavior:'smooth'})");
        Thread.sleep(2000);

        //2. SCROLL TO SPECIFIC ELEMENT
        WebElement element=driver.findElement(By.xpath("//h3[text()='New online store is open!']"));
        //js.executeScript("arguments[0].scrollIntoView(true)",element);
        js.executeScript("arguments[0].scrollIntoView({behavior:'smooth', block:'center'})", element);
        Thread.sleep(2000);

        //3. SCROLL TO BOTTOM OF THE PAGE
        // (x,y): x is horizontal and y is vertical
        // x=0 : no horizontal scroll
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("window.scrollTo({top: document.body.scrollHeight, behavior:'smooth'})");
        Thread.sleep(3000);

        //4. SCROLL TO THE TOP
        js.executeScript("window.scrollTo({top:0, behavior: 'smooth'})");
        Thread.sleep(2000);
        driver.quit();




    }
}
