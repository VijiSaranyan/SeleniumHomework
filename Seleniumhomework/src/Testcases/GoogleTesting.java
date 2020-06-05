package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTesting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Viji/Desktop/Selenium/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
        driver.get("http://www.google.com"); 

		//using xpath for the textbox in google search
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Testing");
		
		//using xpath for search button
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).submit();
		
		//Get list of web-elements 
		
        
		List<WebElement> links =driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println("Total number of links on home page  " +   count);

		/*List<WebElement>linksize =driver.findElements(By.tagName("a")).size();
		String[] links = new String[linksCount];
		System.out.println("Number of links available");
		for(int i=0;i<linksCount;i++) {
			links[i]=linksize.get(i).getAttribute("href");
			System.out.println(links[i]);

        }	*/
		
		
	}
}


