package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdClass extends BaseClass
{
	@Test(groups= {"smoke","sanity","functional"})
	public void swiggy()
	{
		
		driver.get("https://www.swiggy.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@Test(groups= {"functional"})
	public void dominos()
	{
		
		driver.get("https://www.dominos.co.in/");
		System.out.println(driver.getTitle());
	}
	
	@Test(groups= {"regression","smoke"})
	public void cricbuzz()
	{
		
		driver.get("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void extentreports()
	{
		
		driver.get("https://www.extentreports.com/");
		System.out.println(driver.getTitle());
	}

}
