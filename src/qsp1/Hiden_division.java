package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hiden_division {
@Test
public void Test2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dini");
	}

}
