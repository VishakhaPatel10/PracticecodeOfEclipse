package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2JavaScript {
	
	WebDriver driver=null;
	@BeforeTest
	public void browserLaunch() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/");
		//driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		//Closing popupWindow
		driver.findElement(By.xpath("//*[@id='at-cv-lightbox-close']")).click();
		Thread.sleep(3000);

	}
	
	@Test
	public void dropDownselect() throws InterruptedException
	{
		//Input Forms
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
		Thread.sleep(5000);
		
		//JQuery Select Dropdown
		driver.findElement(By.xpath("//*[@id='navbar-brand-centered']/ul[1]/li[1]/ul/li[7]/a")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementsByClassName('select2-selection__arrow').click()");
		Thread.sleep(5000);
		jse.executeScript("document.getElementsByClassName('select2-search select2-search--dropdown').value='India'");
		Thread.sleep(3000);

		jse.executeScript("document.getElementById('select2-country-results').click()");
		
		
		
		
}
}
