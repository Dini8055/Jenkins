package groupsinTestNG;

import org.testng.annotations.Test;
@Test(groups = {"Regression"})
public class Group3 {
	@Test
	public void test3() {
		System.out.println("Googly");
	}
}
