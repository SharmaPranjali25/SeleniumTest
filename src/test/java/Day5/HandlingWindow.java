package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// HANDLING TWO WINDOWS
public class HandlingWindow {
    public static void main(String[]args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
        Thread.sleep(2000);
        Set<String> windowIds=driver.getWindowHandles();
//        for(String win: windowIds){
//            System.out.println(driver.getCurrentUrl()+" : "+win);
//
//        }

        List<String> windowList= new ArrayList<>(windowIds);
//        String parentID= windowList.get(0);
//        String childID= windowList.get(1);
//        System.out.println(windowList.get(0)); // 0:index
//        System.out.println(windowList.get(1));
//        driver.switchTo().window(childID);

        for(String win: windowIds){
            String title=driver.switchTo().window(win).getTitle();
            if(title.equals("NopCommerce | Facebook")){
                System.out.println(driver.getCurrentUrl());
                //driver.close();

            }
        }
        //      System.out.println(driver.getTitle());

        // MAKE FOCUS OF DRIVER FROM 1ST WINDOW TO 2ND:
        //SWITCH THE WINDOW SO DRIVER FOCUS ON THAT WINDOW
Thread.sleep(3000);
        // OPEN NEW WINDOW
        driver.switchTo().newWindow(WindowType.WINDOW);


        //OPEN NEW TAB
       // driver.switchTo().newWindow(WindowType.TAB);
        driver.quit();








    }
}
