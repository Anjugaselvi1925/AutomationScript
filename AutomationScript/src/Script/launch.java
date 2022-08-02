package AutomationScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launch
{
WebDriver driver;
@Test 
public void Launching_the_Browser() 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\anjugaselvi.m\\Downloads\\chromedriver_win32.exe");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
	
}
}
