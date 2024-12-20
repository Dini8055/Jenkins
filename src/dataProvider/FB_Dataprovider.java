package dataProvider;

import org.testng.annotations.DataProvider;

public class FB_Dataprovider 
{
@DataProvider(name="LoginData")
public Object[][] getData()
{
	Object[][] data= {{"dinesh@gmail.com","1234"},
			{"Ash@gmail.com","1234"},	
			{"raj@gmail.com","1234"},
	};
	return data;
}
}
