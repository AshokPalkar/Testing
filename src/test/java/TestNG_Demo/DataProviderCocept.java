package TestNG_Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCocept
{
	
	@Test(dataProvider = "testData")
	public void tesLogin(Object O)
	{
		System.out.println(O);
	}
	
	@DataProvider
	public Object[] testData()
	{
		Object[] data = new Object[]
				{
						1,"hello",2
				
				};
		return data;
	}

}
