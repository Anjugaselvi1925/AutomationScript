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
	
	

}
