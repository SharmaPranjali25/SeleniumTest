package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class RobotFileUpload {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ilovepdf.com/pdf_to_word");
        driver.manage().window().maximize();

        // Click Upload button using Actions
        WebElement uploadBtn = driver.findElement(By.id("pickfiles"));
        Actions act = new Actions(driver);
        act.moveToElement(uploadBtn).click().perform();

        Thread.sleep(3000); // wait for dialog

        // Copy file path
        StringSelection filePath = new StringSelection("C:\\Users\\hp\\Downloads\\boarding pass.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // Robot paste + Enter
        Robot rb = new Robot();
        rb.delay(2000);

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(2000);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}
