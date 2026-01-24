package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        WebElement computer=driver.findElement(By.xpath("//a[normalize-space()='Computers']"));
        WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
        Actions act= new Actions(driver);
        // .perform() is important to hover and click
        // MOUSE HOVER
        act.moveToElement(computer).moveToElement(desktop).click().build().perform();
        Thread.sleep(3000);

        //RIGHT CLICK
        act.contextClick(computer).perform();
        //DOUBLE CLICK
        act.doubleClick(computer).perform();
        //DRAG and DROP 
        //two elements (two locations)
        act.dragAndDrop(computer,desktop);


    }
}
