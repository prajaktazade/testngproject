package testng;



import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homepage  {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	
	public WebDriver driver ; 
	String expected="";
	String actual="";


	@BeforeTest
	public void LaunchBrouser() throws Exception {
		System.out.println("launching grome browser"); 
	//System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Nikita\\Downloads\\geckodriver-v0.23.0-win64.exe");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setAcceptInsecureCerts(true);
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		driver = new ChromeDriver();
		driver.get(baseUrl);
		
	}
	
	
}
