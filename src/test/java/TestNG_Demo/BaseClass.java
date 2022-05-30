package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass
{
	public WebDriver driver;
	
	@Parameters("browserName")   // We can pass the environment URL aslo
	@BeforeMethod
	public void initialiseBrowser(String browserName)
	{
		switch(browserName) {
		case "Chrome":
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\TESTNG\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				// comment in Branch 1
		break;
		
		case "Edge":
			System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\eclipse-workspace\\TESTNG\\Browser\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			break;
			
		case "Firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\eclipse-workspace\\TESTNG\\Browser\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			break;
		
		}
	}
	
	//Closing the Browser
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
