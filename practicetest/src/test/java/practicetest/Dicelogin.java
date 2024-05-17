package practicetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dicelogin {
	
	WebDriver driver;
	
	@BeforeTest
	public void methodsetup()
	{
	driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void methodTeardown()
	{
		driver.quit();
	}
	
	
	
	@Test
	public void loginsuccess() {
        driver.get("https://www.dice.com/dashboard/login");
		System.out.println("test loginsuccess");
		System.out.println("First edit");
		System.out.println("second edit");
		System.out.println("Third edit done on Github or mastr updated by another user");
	}
	@Test
	public void loginfailure() {
		driver.get("https://www.dice.com/dashboard/login");
		System.out.println("test loginfailure");

	}

	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
