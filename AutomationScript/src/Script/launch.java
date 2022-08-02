package Script;

public class launch
{
WebDriver driver;
@Test public void Launching_the_Browser() 
{
	System.setProperty("C:\\Users\\anjugaselvi.m\\Downloads\\chromedriver_win32.exe");
	driver = new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	
}
}
