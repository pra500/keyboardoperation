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

public class Keyboardaction1Test {
	
	
	
	WebDriver driver;
	
  //@Test
  public void fTest() {
	  
	  WebElement fullName = driver.findElement(By.id("userName"));
      fullName.sendKeys("Mr.Peter Haynes");
      
      //Enter the Email
      WebElement email=driver.findElement(By.id("userEmail"));
      email.sendKeys("PeterHaynes@toolsqa.com");
      
      // Enter the Current Address
      WebElement currentAddress=driver.findElement(By.id("currentAddress"));
      currentAddress.sendKeys("43 School Lane London EC71 9GO");
      
      // Copy the Current Address
      currentAddress.sendKeys(Keys.CONTROL);
      currentAddress.sendKeys("A");
      currentAddress.sendKeys(Keys.CONTROL);
      currentAddress.sendKeys("C");
      
      //Press the TAB Key to Switch Focus to Permanent Address
      currentAddress.sendKeys(Keys.TAB);
      
      //Paste the Address in the Permanent Address field
      WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
      permanentAddress.sendKeys(Keys.CONTROL);
      permanentAddress.sendKeys("V");
      
      //Compare Text of current Address and Permanent Address
      Assert.assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
      //assertEquals(currentAddress.getAttribute("value"),permanentAddress.getAttribute("value"));
      
	  
	  
	  
  }
  
  
  @Test
  public void geeTest()
  {
	  
	  String title=driver.getTitle();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
  }

  @AfterClass
  public void afterClass() {
	  
	 // driver.close();
	  
  }

  
  
  //**********************
  //first
  //second
//third
//fourth
  //five
  
  
  
  //hhhh
  
}
