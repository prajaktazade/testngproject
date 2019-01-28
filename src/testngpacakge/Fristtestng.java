package testngpacakge;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Fristtestng {

	public String baseurl="http://demo.guru99.com/test/newtours/";
	String drivepath="C:\\Users\\Nikita\\Downloads\\chromedriver_win32";	
	public WebDriver driver;


	@Test
	public void homepage() {
		System.out.println("homepage lunch");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new CromeDriver();
		driver.get(baseurl);
		String Expectedtitile="Welcome: Mercury Tours";
		String actualtitile=driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	}
}
