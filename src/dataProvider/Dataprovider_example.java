package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_example {
@Test(dataProvider = "testdata")
public void launch(String un, String pwd)
{
	System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.findElement(By.cssSelector("input[name='email']")).sendKeys(un);
    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys(pwd);
    driver.findElement(By.name("login")).click();
    driver.close();
}
	@DataProvider(name="testdata")
	public Object[][] createData1() {
		return new Object[][] {
			{"admin","123"},
			{"manager","12345"},
			{"shopper","123456"},
		
		};
	}
}

