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

public class Keyboardaction4Test {
	

	WebDriver driver;
	

	@Test
	public void fTest() throws InterruptedException {

	WebElement wb= driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin"));
	wb.sendKeys("userr");
	
	
	wb.sendKeys(Keys.CONTROL, "A", "C");
	
	wb.sendKeys(Keys.TAB);
	
	WebElement wb1= driver.findElement(By.id("ctl00_CPHContainer_txtPassword"));
			
	wb1.sendKeys(Keys.CONTROL, "V");
	
	
	String s=wb.getAttribute("value");
	System.out.println(s);
	
		
	
	
	
	}



	

	

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.testyou.in/Login.aspx");

	}

	@AfterClass
	public void afterClass() {

		driver.quit();

	}
	
	
	//**********************
	//**********************

}
