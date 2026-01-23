package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dropcountryEle=driver.findElement(By.xpath("//select[@id='country']"));
        // capture drop down as element
        Select dropcountry= new Select(dropcountryEle); //select class object and in this pass dropdown element

        // select option from dropdown
        //dropcountry.selectByVisibleText("France");
        // dropcountry.selectByValue("japan");
        //dropcountry.selectByIndex(2);

        // capture the options from dropdown
        List<WebElement> options=dropcountry.getOptions();
        System.out.println("Number of options in a drop down "+ options.size()); //10

        //printing the options
        /*
        for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }
        */
         // Enhanced for loop
        for(WebElement op:options){
            System.out.println(op.getText());
        }




    }

}
