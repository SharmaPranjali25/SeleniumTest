package DayOneTestNG;

import org.testng.annotations.Test;

public class DemoTestng1 {
    @Test(priority = 1)
    public void SignUp(){
        System.out.println("SignUp Successful");
    }
    @Test(priority = 2)
    public void Login(){
        System.out.println("Login Successful");
    }
    @Test(priority = 3)
    public void SearchForTheFlight(){
        System.out.println("Search Successful");
    }
    @Test(priority = 4)
    public void BookTheFlight(){
        System.out.println("Book Successful");
    }
    @Test(priority = 5)
    public void SaveTheTicket(){
        System.out.println("Save the Ticket Successful");
    }
    @Test(priority = 6)
    public void Logout(){
        System.out.println("LogOut Successful");
    }

}
