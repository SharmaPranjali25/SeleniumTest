package DayFourTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//disabled all test in class
//@Ignore
public class IgnoreDemo {
//    @Ignore
    // String[] list={"Hello","world"};
    @Test(groups={"smoke"})
    public void test1(){
        System.out.println("Test1");
    }
    @Test(groups = {"functional"})
    public void test2(){
        System.out.println("Test2");
    }
    @Test(groups={"functional","regression"})
    public void test3(){
        System.out.println("Test3");
    }

}
