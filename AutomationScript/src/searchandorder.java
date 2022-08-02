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
		@Test(priority = 3 ) public void Order() throws InterruptedException, Exception
		{
			Set window = driver.getWindowHandles();
			Iterator<String> it = window.iterator();
			Thread.sleep(2000);
			String parentId = it.next();
			String childId = it.next();
			driver.switchTo().window(childId);
			Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
			driver.findElement(By.id("inputFirstName")).sendKeys("anju");
			driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("selvi");
			driver.findElement(By.id("inputEmail")).sendKeys("anju@gmail.com");
			driver.findElement(By.id("inputPassword")).sendKeys("Anju@123");
			driver.findElement(By.id("flexRadioDefault2")).click();
			driver.findElement(By.xpath("//*[@placwholder='000000000000']")).sendKeys("123456");
			driver.findElement(By.id("addresss1")).sendKeys("abcdef ghij klmn");
			driver.findElement(By.id("address2")).sendKeys("abcdefghij klmno pqr");
			driver.findElement(By.id("inputcity")).sendKeys("Madurai");
		}
	}

}
