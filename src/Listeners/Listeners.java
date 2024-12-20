package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
    @Override
	public void onTestStart(ITestResult result) {
System.out.println("testcase exe started");
    }

	@Override
	public void onTestSuccess(ITestResult result) {
System.out.println("testcase success");
}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("testcase failed");
}

	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("testcase skipped");	}

}
