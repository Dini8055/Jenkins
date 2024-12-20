package qsp;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports1 
{
@Test
public void test1()
{
	ExtentReports rep=new ExtentReports("./Reports/r1.html",false);
	ExtentTest test = rep.startTest("Testcase1");
	test.log(LogStatus.PASS, "testcase passed");
	test.log(LogStatus.FAIL, "testcase failed");
	test.log(LogStatus.SKIP, "testcase skipped");
	rep.endTest(test);
	rep.flush();
}

}
