package DayTwoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
    @Test
    public void login() {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
    String expectedTitle="DEMOQAA";
        //String expectedTitle="DEMOQA";
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);

        //Assertions : Assert class
        // Hard Assertion
       // Assert.assertEquals(actualTitle,expectedTitle,"Title miss-matched");

        //soft assertion
       String actualText= driver.findElement(By.xpath("//h5[text()='Elements']")).getText();
       String expectedText="Elements";
        SoftAssert softassert=new SoftAssert();
        softassert.assertEquals(actualTitle,expectedTitle,"Title MissMatch");

        driver.quit();
        softassert.assertEquals(actualText,expectedText,"Element not Present");
        softassert.assertAll();
    }
}
