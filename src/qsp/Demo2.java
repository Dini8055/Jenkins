package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
@Test
public void test1()
{
	Reporter.log("Virat");
}


@Test(dependsOnMethods = "test1")
public void test2()
{
	Reporter.log("Rcb");
}

@Test
public void test3()
{
	Reporter.log("escn");
}
}
