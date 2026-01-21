package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {
    public static void main(String[]args) throws InterruptedException {

        //launch the browser
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        //*******using ID**********
        // method return us webElement
        WebElement username= driver.findElement(By.id("user-name"))
;
        username.sendKeys("standard_user");
        Thread.sleep(2000);
        //password locating
        // ********NAME ***********
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        //login
        //using ************CLASS***********
        driver.findElement(By.className("btn_action")).click();
        Thread.sleep(4000);

        // ********TAG*********
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);

        //***** LINK-TEXT  IDENTIFY USING ANCHOR TAG*******


       // driver.findElement(By.linkText("Logout")).click();


        //****PARTIAL LINK-TEXT******
        driver.findElement(By.partialLinkText("Log")).click();




    }
}
