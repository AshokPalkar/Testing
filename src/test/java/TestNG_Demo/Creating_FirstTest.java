package TestNG_Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;



public class Creating_FirstTest extends BaseClass
{
	
	
	@Test(groups= {"smoke"})
	public void testGoogle()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYr Tutorials",Keys.ENTER);
		System.out.println(driver.getTitle());
		

	}
	
	@Test(groups= {"smoke","functional"})
	public void testFacebook()
	{
		
		driver.get("https://www.Facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("HYr Tutorials");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456",Keys.ENTER);
		System.out.println(driver.getTitle());
		


}
}
