package testngxml;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Keyboardaction3Test {
	//will check later

	WebDriver driver;
	

	@Test
	public void fTest() throws InterruptedException {

		WebElement a = driver.findElement(By.id("username"));
		
		a.sendKeys("paaa");
		a.sendKeys(Keys.CONTROL, "A", "C");
		
		a.sendKeys(Keys.TAB);
		
		
		WebElement b = driver.findElement(By.id("password"));
		a.sendKeys(Keys.CONTROL, "V");
		
		
	
	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");

	}

	@AfterClass
	public void afterClass() {

		driver.quit();

	}

}
