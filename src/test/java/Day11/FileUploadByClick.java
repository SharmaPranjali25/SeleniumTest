package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//           ERRRROOOORRRRRRRRRRR
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadByClick {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));

        // Click using Actions class
        Actions act = new Actions(driver);
        act.moveToElement(button).click().perform();

        // Wait for file dialog
        Thread.sleep(3000);

        // Copy file path to clipboard
        StringSelection filePath = new StringSelection("C:\\Users\\hp\\OneDrive\\Desktop\\junk.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // Robot to paste path and press Enter
        Robot rb = new Robot();
        rb.delay(2000);

        // CTRL + V
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(2000);

        // Press ENTER
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}

