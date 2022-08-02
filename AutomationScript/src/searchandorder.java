import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

public class searchandorder {
	public class search extends Launch
	{
		@Test
		(priority = 2)
		public void search() throws InterruptedException
		{
			driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
			WebElement ele = driver.findElement(By.xpath("//b[.='All Mobile Details']"));
			Assert.assertTrue(ele.isDisplayed());
			driver.findElement(By.id("myInput")).sendKeys("Apple Iphone 13");
			Thread.sleep(2000);
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,700)");
			Assert.assertTrue(driver.findElement(By.xpath("//h2[='Our New Feature Courses']")).isDisplayed();
			driver.findElement(By.xpath("(//a[.='Order'])[4]")).click();
		}
		}
	}

}
