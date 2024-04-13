package testngxml;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class KeyboardactionTest {
	//will check later

	WebDriver driver;

	@Test
	public void fTest() throws InterruptedException {

		WebElement a = driver.findElement(By.xpath("//input[@id='autocomplete']"));
		a.sendKeys("India");
		a.sendKeys(Keys.CONTROL);
		a.sendKeys("A");
		a.sendKeys(Keys.CONTROL);
		a.sendKeys("C");

		a.sendKeys(Keys.TAB);
		WebElement b = driver.findElement(By.xpath("//input[@id='name']"));
		b.sendKeys(Keys.CONTROL, "V");

		Thread.sleep(8000);

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}

	@AfterClass
	public void afterClass() {

		driver.quit();

	}

}
