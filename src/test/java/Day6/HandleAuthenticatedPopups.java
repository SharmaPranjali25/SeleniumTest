package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopups {
    public static void main(String[] args){
        WebDriver driver= new ChromeDriver();
        // driver.get("https://the-internet.herokuapp.com/basic_auth");
        //SYNTAX
        // http://username:password@the-internet....url/basic_auth
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");




    }

}
