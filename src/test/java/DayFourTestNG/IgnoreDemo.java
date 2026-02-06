package DayFourTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
//disabled all test in class
@Ignore
public class IgnoreDemo {
//    @Ignore
    @Test
    public void test1(){
        System.out.println("Test1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
    @Test
    public void test3(){
        System.out.println("Test3");
    }

}
