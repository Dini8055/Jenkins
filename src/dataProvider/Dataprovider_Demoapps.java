package dataProvider;

import org.testng.annotations.DataProvider;

public class Dataprovider_Demoapps 
{
	@DataProvider(name="FillData")
	public Object[][] getData()
	{
		Object[][] data= {{"dinesh@gmail.com"},
				{"Ash@gmail.com"},	
				{"raj@gmail.com"},
		};
		return data;
	}
	}


