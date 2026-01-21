package Day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoTest {
    public static void main(String[] args){
        //validate home page title
        //launch the browser
        ChromeDriver driver= new ChromeDriver();
        //search the link in browser
        driver.get("https://demoqa.com/");
        //to maximize the window
        driver.manage().window().maximize();
        //check page title is matching or not
        String actualTitle=driver.getTitle();
        if(actualTitle.equals("DEMOQA")){
            System.out.println("Title Matched");
        } else{
            System.out.println("Title not Matched");
        }




    }

}
