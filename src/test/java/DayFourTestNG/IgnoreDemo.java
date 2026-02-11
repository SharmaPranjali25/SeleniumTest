package DayFourTestNG;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//disabled all test in class
//@Ignore
public class IgnoreDemo {
//    @Ignore
    // String[] list={"Hello","world"};
    //@Ignore
    @Test(groups={"smoke"})
    public void test1(){
        System.out.println(10/0);
        System.out.println("Test1");
    }

    @Test(groups = {"functional"})
    public void test2(){
        System.out.println(5/0);
        System.out.println("Test2");
    }
//    @Test(groups={"functional","regression"})
     @Test(groups={"smoke"})
    public void test3(){

        System.out.println("Test3");
    }

// excute only if functional test case executed
//    @Test(dependsOnGroups = "functional",alwaysRun = true)
@Test(dependsOnGroups = "functional")
    public void mainTest(){
        System.out.println("main test");
    }

}
