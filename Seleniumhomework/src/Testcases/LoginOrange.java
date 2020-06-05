package Testcases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class LoginOrange {
	WebDriver driver;

	public void insertapp(String url)	
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void enterbyid(String val,String name)
	{
		driver.findElement(By.id(val)).sendKeys(name);
	}
	
	public void clickbyxpath(String val1)
	{
		driver.findElement(By.xpath(val1)).click();
	}
	
	public void selectbydropdown(String val2,int n)
	
	{
		driver.findElement(By.xpath(val2));
		Select dropdownlist=new Select(driver.findElement(By.xpath(val2)));
		dropdownlist.selectByIndex(n);
	}
	public void takeScreenshot(String path)throws Exception
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(path));
		
	}
	
	public void closeapp()
	{
		driver.close();
	}
	
		/*launch the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// using name attribute for username
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		//using id attribute for password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin");
		
		//using xpath for login button
		driver.findElement(By.xpath("//*[@id='btnLogin']")).submit();
		
		//using link text for forgot password
		//driver.findElement(By.linkText("Forgot your password?")).click();
		
		//using partail text for forgot password
		//driver.findElement(By.partialLinkText("Forgot your passwor")).click();
		
		//using xpath  with contains for ADMIN 
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		
		//using xpath for UserMangament under admin
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		
		//using relativexpath for users under USERmanagemnt under Admin
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		//using xpath for username under USermanagement in ADMIN
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("thomas.fleming");
		
		//using xpath for userrole under usermangament in ADMIN
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']"));
		Select dropdownlist=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")));
		dropdownlist.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']"));
		Select dropdownlist1=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")));
		dropdownlist1.selectByIndex(1);
		
		driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']"));
		Select dropdownlist2=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")));
		dropdownlist2.selectByIndex(0);
		
		//using xpath for employee name under ADMIN
		driver.findElement(By.xpath("//*[@id='searchSystemUser_employeeName_empName']")).sendKeys("Thomas Fleming");
		
		//using xpath for Status under ADMIN
		driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		Select dp1=new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_status']")));
		dp1.selectByIndex(0);
		
		driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		Select dp2=new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_status']")));
		dp2.selectByIndex(1);
		
		driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		Select dp3=new Select(driver.findElement(By.xpath("//select[@id='searchSystemUser_status']")));
		dp3.selectByIndex(2);
		
		//click on the search button to search a record
		//driver.findElement(By.id("searchBtn")).submit();
		
		//click on the reset button
		driver.findElement(By.id("resetBtn")).click();*/




		
		
		
	

}
