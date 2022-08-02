package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginandsignup 
@Test
(dependsOnMethods = {"Launching_the_Browser"})
public void Signup_for_mobiles() throws InterruptedException
{
	WebElement Signin = driver.findElement(By.xpath("/button[text()='SIGN IN']"));
	Signin.click();
	WebElement Signup = driver.findElement(By.xpath("//a[text()='Sign up']"));
	Signup.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@id='myName']"));
	firstname.sendKeys("Anjuga");
	WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Last_name.sendKeys("Selvi");
	WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
	Email.sendKeys("anju@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
	password.sendKeys("Anju@1919");
	WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
	Phone_number.sendKeys("8610811865");
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
	bio_story.sendKeys("I joined Qualitest before 2 months");
	driver.findElement(By.xpath("//input[@type='date']")).click();
	driver.findElement(By.xpath("//button[@type='Submit']")).click();
	Alert Al = driver.switchTo().alert(); Al.accept();
	Thread.sleep(2000);
	WebElement user_name = driver.findElement(By.id("username"));
	user_name.click();
	user_name.sendKeys("anju@gmail.com");
	
	
	

}
