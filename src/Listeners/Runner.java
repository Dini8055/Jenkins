package Listeners;

import static org.junit.Assert.fail;

import org.testng.annotations.Test;

public class Runner {
	@Test
	public void compose() {
		System.out.println("message composed");
	}

	@Test(dependsOnMethods = "compose")
	public void sentitems() {
		System.out.println("message sent");
		fail();
	}

	@Test(dependsOnMethods = "sentitems")
	public void trash() {
		System.out.println("message deleted");
	}

}
