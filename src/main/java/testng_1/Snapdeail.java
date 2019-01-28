package testng_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Snapdeail {
	
	public WebDriver driver;
	//String username="zade.prajakta08@gmail.com";
	//String password="zade";
	// New Commet 
  @BeforeTest
  public void init() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.flipkart.com/");
  }
  
  @Test
  public void login() {
	  driver.findElement(By.partialLinkText("Login & Signup")).click();
	  driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"))
				.sendKeys("9970124413");
		driver.findElement(
				By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"))
				.sendKeys("zade");
		driver.findElement(By.cssSelector(".submit-btn.login-btn.btn")).click();
  }

 
}
