package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class getMethods {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/"); //it will return nothing as void is written
        driver.manage().window().maximize();
        //GET-TITLE
        String pageTitle=driver.getTitle(); // STRING
        System.out.println(pageTitle);

        //driver.get("https://www.orangehrm.com/");
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        //String pageSource=driver.getPageSource();
        //System.out.println(pageSource);

       // getWindowHandle: at one point driver will point to onw window handle
//        String windowId=driver.getWindowHandle();
//        System.out.println(windowId);
//        System.out.println("======================================================");
//        driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
//        Set<String> windows= driver.getWindowHandles();
//
//        System.out.println(windows);
//
//        driver.close(); //close active window
//        //to point driver to another window we have : SWITCH()
//        driver.quit();
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        boolean logoStatus=logo.isDisplayed();
        System.out.println(logoStatus);

        //isEnabled()
        boolean btnStatus=driver.findElement(By.xpath("//button[normalize-space()='Search']")).isEnabled();
        System.out.println(btnStatus);

        //isSelected()
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
       boolean checkStatus= driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
       System.out.println(checkStatus);












    }

}
