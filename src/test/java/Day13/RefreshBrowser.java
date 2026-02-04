package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class RefreshBrowser {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("About")).click();
        Thread.sleep(2000);

        //1. METHOD1
        //driver.navigate().refresh();
        //Thread.sleep(2000);
        //driver.close();

        //2 METHOD2
        driver.get(driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.close();





    }
}
