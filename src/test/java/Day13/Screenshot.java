package Day13;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class Screenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.in");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // CLASS FILE
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Files.copy(
                f.toPath(),
                new File("C:\\Users\\hp\\OneDrive\\Desktop\\ScreenShots\\amazonsscreenshot.jpg").toPath(),
                StandardCopyOption.REPLACE_EXISTING
        );


    }
}

