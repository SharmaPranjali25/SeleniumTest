package DayFiveTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataproviderDemo {
    WebDriver driver;

    @BeforeClass
    void setUp(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    //dataprovider: attribute of test annotation
    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(2000);
        boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
        if(status==true){
            driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
            Assert.assertTrue(true);
        }
        else{
            Assert.fail();
        }

    }
    @AfterClass
    void tearDown(){
        driver.close();
    }
    //creation and returning the test data
//    @DataProvider: alwaya return 2D Array
    @DataProvider(name="dp")
    Object[][] loginData()
    {
        Object data[][]={
                {"abc@gmail.com","test123"},
                {"xyz@gmail.com","test023"},
                {"john@gmail.com","test@123"},
                {"sharmapranjali115@gmail.com","1234567890"},
                {"johncanedy@gmail.com","test"},



        };
        return data;
    }
    //indices={0,3,4} --> specify rows




}
