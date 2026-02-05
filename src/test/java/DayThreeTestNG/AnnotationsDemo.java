package DayThreeTestNG;

import org.testng.annotations.*;

public class AnnotationsDemo {
    @Test
    public void test1(){
        System.out.println("test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before Method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }


}
