package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// ALERT IS NOT A WEB ELEMENT IN THIS CANNOT BE INSPECTED
// DRIVER.SWITCHTO().ALERT()
public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //1) Handle alert with OK button : normal alert
        
        /*
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(4000);
        // driver.switchTo().alert().accept(); to perform multiple action don't use accept() direct store this in some variable
        // capture the text
         Alert myalert= driver.switchTo().alert();
         System.out.println(myalert.getText());
         myalert.accept(); //close alert window


         */
        
        // 2) Confirmation alert : have OK  and CANCEL button
        
        /*
        // close it by OK : accept()
        // close it by cancel: dismiss()
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
         //driver.switchTo().alert().accept(); //close alert by ok button
        driver.switchTo().alert().dismiss(); // close alert by cancel button
        */

        // 3) Alert having input box: prompt alert
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        //pass value
        // capture alert window : shift driver to alert window
        Alert myPrompyAlert=driver.switchTo().alert();
        myPrompyAlert.sendKeys("Welcome");
        myPrompyAlert.accept();



    }
}
