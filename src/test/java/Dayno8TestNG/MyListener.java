package Dayno8TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
    public void onStart(ITestContext context) {
        System.out.println("This is on Start: Test Exceution Started only ONCE ");
    }
    public void onTestStart(ITestResult result){
        System.out.println("Test Started");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test successful");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test execution is Finished");
    }



}
