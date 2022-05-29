package TestNG_Demo;

import org.testng.annotations.DataProvider;

public class DataSupplier
{
	@DataProvider
	public Object[][] loginData()
	{
		Object[][] data = new Object[][] {
			{"Admin","admin123"},
			{"admin","admin123"},
			{"Admin","Admin123"}	
		};
		return data;
	}

}
