package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sujata {
	WebDriver driver = null;

	@BeforeTest
	public void browserLaunch() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://openlibrary.org/");
		// driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().window().maximize();
	}

	@Test
	public void bookList() throws InterruptedException {
		driver.findElement(By.linkText("Browse by Subject")).click();
		driver.findElement(By.id("searchSubjects")).sendKeys("royal shakespeare theatre");
		driver.findElement(By.xpath("//*[@id='contentBody']/form/p/input[2]")).click();
		driver.findElement(By.linkText("Royal Shakespeare Theatre (Stratford-upon-Avon, England)")).click();

		List<WebElement> booksList = driver.findElements(By.xpath(
				"//div[@class='carousel carousel-subjects carousel--progressively-enhanced slick-initialized slick-slider']/div/div/div/div/a/img"));

		for (WebElement ele : booksList) {
			String bookTitle = ele.getAttribute("title");
			Thread.sleep(3000);
			System.out.println(bookTitle);

		}

	}

}
