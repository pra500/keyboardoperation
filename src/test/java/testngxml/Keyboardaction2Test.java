package testngxml;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Keyboardaction2Test {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() throws InterruptedException {
	  
	  
	  
	WebElement wb=driver.findElement(By.id("username"));
	 wb.sendKeys("abc");
	 wb.sendKeys(Keys.CONTROL, "A", "C");
	 
	 Thread.sleep(3000);
	
	 
	 
	 wb.sendKeys(Keys.TAB);
	 
	 
	
	
	 WebElement wb1=driver.findElement(By.id("password"));
	 wb1.sendKeys(Keys.CONTROL, "V");
	 
	 Thread.sleep(3000);
	
	
	Assert.assertEquals(wb.getAttribute("value"),wb1.getAttribute("value"));
     
	 
	  
	
	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
	  
	  	  
	 
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
