package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalCommands {
    public static void main(String[]args) throws InterruptedException, MalformedURLException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        URL myurl= new URL("https://www.orangehrm.com/");
        driver.navigate().to(myurl); //passing object (can take object as argument)

        // BACK AND FORWARD

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        System.out.println("==========================================");
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        //REFRESH

        driver.navigate().refresh();

        //driver.navigate().to("https://www.orangehrm.com/");
        //driver.get("https://www.orangehrm.com/");
        Thread.sleep(4000);
        driver.quit();


    }

}
