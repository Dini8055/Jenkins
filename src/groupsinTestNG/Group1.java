package groupsinTestNG;

import org.testng.annotations.Test;
@Test(groups = {"smoke"})
public class Group1 {
	@Test
	public void test1() {
		System.out.println("Toxic");
	}
}
