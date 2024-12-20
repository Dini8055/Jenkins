package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dataprovider_Demo_runner 
{
@Test(dataProvider = "FillData", dataProviderClass = Dataprovider_Demoapps.class)
public void formvalidation(String req) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares1/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
    driver.findElement(By.name("requiredfield")).sendKeys(req);
}
}
