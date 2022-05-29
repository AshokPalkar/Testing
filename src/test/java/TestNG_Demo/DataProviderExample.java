package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample
{
	
	@Test(dataProvider = "loginData",dataProviderClass = DataSupplier.class)
	public void login(String userName, String Password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\TESTNG\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[@id='welcome']")).isDisplayed());
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
