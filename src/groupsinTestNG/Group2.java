package groupsinTestNG;

import org.testng.annotations.Test;
@Test(groups = {"sanity"})
public class Group2 {
	@Test
	public void test2() {
		System.out.println("YASH");
	}
}
