package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static  void main(String[] args){
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
       WebElement file= driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
       file.sendKeys("C:\\Users\\hp\\OneDrive\\Desktop\\junk.txt");



    }
}
