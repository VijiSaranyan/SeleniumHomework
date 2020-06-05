package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LoginIEPage {

	private static final String InternetExplorerOptions = null;

	public static void main(String[] args) {
		
		
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();

		capability.setCapability("ignoreZoomSetting", true);
		                 capability.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, "");

		InternetExplorerDriver driver1 = new InternetExplorerDriver(capability);

		//System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Viji\\Desktop\\Selenium\\IEDriverServer.exe");

        //Initialize Chrome driver Instance.
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("The title of the page is "  +   driver.getTitle());
	}

}
