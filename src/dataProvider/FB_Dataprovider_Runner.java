package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_Dataprovider_Runner 
{
@Test(dataProvider = "LoginData", dataProviderClass = FB_Dataprovider.class)
public void loginTest(String un, String pwd) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.facebook.com");
    Thread.sleep(2000); 
    driver.findElement(By.cssSelector("input[name='email']")).sendKeys(un);
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys(pwd);
    Thread.sleep(2000);
    driver.findElement(By.name("login")).click();
    Thread.sleep(2000);
    driver.close();
}
}
