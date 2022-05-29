package TestNG_Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTwoDiamentionalArray
{
	
	@Test(dataProvider = "testData")
	public void tesLogin(Object[] s)
	{
		for(int i=0; i<s.length; i++)
		{
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.println("=====================");
	}
	
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] data = new Object[][]
				{
				{"abc","123","yhb","852"},      //jagged array
				{"pqr","456"},
				{"xyz","789","lkj"}
				
				};
		return data;
	}

}
