package DayTwoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
    WebDriver driver;
    @Parameters("browserName")
    @BeforeTest
    public void initializeBrowser(@Optional ("chrome" )String browserName){
        switch(browserName){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "edge":
                driver=new EdgeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            default:
                System.out.println("No valid browser passed + Error occured");
                // return; return from entire function initializeBrowser

        }

    }
    @Parameters("url")
    @Test(enabled = false)
    public void login(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        String expectedTitle = "DEMOQAA";
        //String expectedTitle="DEMOQA";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        //Assertions : Assert class
        // Hard Assertion
        // Assert.assertEquals(actualTitle,expectedTitle,"Title miss-matched");

        //soft assertion
        String actualText = driver.findElement(By.xpath("//h5[text()='Elements']")).getText();
        String expectedText = "Elements";
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(actualTitle, expectedTitle, "Title MissMatch");
        softassert.assertEquals(actualText, expectedText, "Element not Present");
    }
        //softassert.assertAll();
        @AfterTest
        public void teardown(){
            driver.quit();
        }
    }

