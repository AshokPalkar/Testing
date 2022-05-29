package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondClass extends BaseClass
{
	@Test(groups= {"smoke","sanity"})
	public void zomato()
	{
		
		driver.get("https://www.zomato.com/");
		System.out.println(driver.getTitle());
		
	}
	
	@Test(groups= {"functional","regression"})
	public void amazon()
	{
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	
	}
	
	@Test(groups= {"regression"})
	public void flipkart()
	{
		
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
	}
	

}
