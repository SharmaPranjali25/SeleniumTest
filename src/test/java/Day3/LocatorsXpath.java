package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsXpath {
    public static void main(String[] args) throws InterruptedException { //jvm calls this method automatically , static so that jvm will call it without creating the object
        WebDriver driver= new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //XPATH WITH SINGLE ATTRIBUTE
        //driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Watch");
       // Thread.sleep(3000);

        //XPATH WITH MULTIPLE ATTRIBUTES
       // driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys(" watch");
       // Thread.sleep(3000);

        //XPATH WITH AND, OR OPERATORS
        //driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search store']")).sendKeys(" watch");


        //driver.quit();
// XPATH text()- when no attribute present
        //text() is used to locate elements based on their visible
        // text when attributes are missing, dynamic, or not unique
        // a[text()='Documentation']
//        driver.findElement(By.xpath("//*[text()='Documentation']")).click();
//        System.out.println("*****Documentation clicked*******");
//        Thread.sleep(3000);
//        driver.quit();

        //text()
//        boolean displayStatus= driver.findElement(By.xpath("//*[text()='About nopCommerce']")).isDisplayed();
//        System.out.println(displayStatus);
//        String aboutText=driver.findElement(By.xpath("//h3[contains(text(),'About nopCommerce')]")).getText();
//        System.out.println(aboutText);
//        Thread.sleep(3000);
//        driver.quit();

        // CONTAINS METHOD: DO NOT WANT TO SPECIFY COMPLETE VALUES ONLY PARTIAL WE MENTION
        //CONTAINS WHEN VALUES ARE DYNAMIC ( WEB ELEMENT THAT IS DYNAMIC)
        // starts with: //*[starts-with(@placeholder,'Search')]
// Browser doesn't support XPATH 2.0 therefore ends with not work






    }

}
