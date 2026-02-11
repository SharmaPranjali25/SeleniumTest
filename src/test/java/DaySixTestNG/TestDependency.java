package DaySixTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {
    @Ignore
    @Test()
    public void signup(){
        //System.out.println(10/0);
        // whenever exception in main class, then dependent classes are skipped
        System.out.println("Signup");
    }
// dependenceMethods has higher precedence so it will neglect priority
    @Test(dependsOnMethods = "signup",ignoreMissingDependencies = true)
    public void login(){
//        System.out.println(10/0);
        System.out.println("login");
    }
// even login fails we want logout to run then we use alwaysRun=true
//    @Test(priority = 3, dependsOnMethods = {"signup","login"},alwaysRun = true)
//    @Test(dependsOnMethods = {"signup","login"})
@Test(dependsOnMethods = "login")
    public void logout(){
        System.out.println("logout");
    }
}
