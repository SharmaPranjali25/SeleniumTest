package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckboxes {
    public static void  main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //1) Select specific checkbox
       // driver.findElement(By.xpath("//input[@id='sunday']")).click();

        // 2) Select multiple checkboxes : looping statement
        List<WebElement> checkboxes=driver.findElements(By.xpath("// input[@class='form-check-input'][@type='checkbox']"));
        /*
        for(int i=0;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }
         another way for each loop
        for(WebElement checkbox: checkboxes){
            checkbox.click();

        }
        */


        //3) Select last three checkboxes
        // total(checkboxes)-Number (checkboxes want to select)= starting index
        // 7-3(you want to select)= 4(starting index of third last checkbox)
        /*
        for(int i=4;i<checkboxes.size();i++){
            checkboxes.get(i).click();
        }
        */

        // 4) first three checkboxes
        /*
        for(int i=0;i<3;i++){
            checkboxes.get(i).click();
        }
        */


        // 5) unselect checkboxes
        for(int i=0;i<3;i++){
            checkboxes.get(i).click();
        }
        Thread.sleep(4000);

        for(int i=0;i<checkboxes.size();i++){
            if(checkboxes.get(i).isSelected()) {
                checkboxes.get(i).click();
            }
        }









    }
}
