package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shantanu {

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
		
		//Select Country
		driver.findElement(By.xpath("//*[@class='select2-selection__arrow']")).click();
		Thread.sleep(5000);
		
		//Select Country Textbox
		driver.findElement(By.xpath("//*[@class='select2-search select2-search--dropdown']/input")).sendKeys("India");
		Thread.sleep(3000);
		
		//Available value
		driver.findElement(By.xpath("//*[@id='select2-country-results']")).click();
	}
		/*
		 * //*[@id='select2-country-results'] 
		 * WebElement element =driver.findElement(By.		 * xpath("//*[@class='select2-search select2-search--dropdown']/input"));
		 * Actions act=new Actions(driver); //act.sendKeys(Keys.ENTER);
		 * act.doubleClick(element).build().perform();
		 */
		
	
	

	

}
