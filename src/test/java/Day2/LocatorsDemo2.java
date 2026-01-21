package Day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsDemo2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        // ID
//        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Apple");
//        Thread.sleep(2000); //this method may give exception so we handle that by throws interrupted exception
       // driver.quit();
        // CLASS
//        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Banana");
//        driver.quit();

        //driver.findElement(By.cssSelector("input#small-serachitems")).sendKeys("watch");
       // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("watch");
      //  driver.quit();

        //tag[attribute="value"]
       // driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("watch");
// DOUBLE QUOTE
       // driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("watch");

        //tag.classname[attribute="value"]
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Watch");

        List<WebElement> links= driver.findElements(By.tagName("a"));
        for(WebElement link: links){
            System.out.println(link.getText());
        }
        Thread.sleep(2000);
        driver.quit();











    }

}
