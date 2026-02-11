package DaySevenTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParallelExecution2 {

    @Test()
    public void test4(){
        System.out.println("test4");
        System.out.println("test4------"+Thread.currentThread().getId());
    }
    @Test()
    public void test5(){
        System.out.println("test5");
        System.out.println("test5------"+Thread.currentThread().getId());
    }
    @Test()
    public void test6(){
        System.out.println("test6");
        System.out.println("test6------"+Thread.currentThread().getId());
    }
}


