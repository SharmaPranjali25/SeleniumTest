package DayFourTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//disabled all test in class
//@Ignore
public class IgnoreDemo2 {
    //    @Ignore
    // String[] list={"Hello","world"};
    @Test(groups={"sanity"})
    public void test4(){
        System.out.println("Test4");
    }
    @Test(groups = {"functional","smoke"})
    public void test5(){
        System.out.println("Test5");
    }
    @Test(groups={"functional","regression","sanity"})
    public void test6(){
        System.out.println("Test6");
    }

}
