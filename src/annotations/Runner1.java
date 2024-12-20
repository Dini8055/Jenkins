package annotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1 extends Generic
{
@Test
public void Flipkart() throws InterruptedException
{
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9663080984");
    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("9663080984");
    Thread.sleep(2000);
    driver.findElement(By.name("login")).click();
}
}
