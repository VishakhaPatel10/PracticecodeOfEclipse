package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Muthu {
	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("https://openlibrary.org/");
	WebElement books = driver.findElement(By.xpath("//img[@class='bookcover']"));
	String tooltip = books.getAttribute("title");
	System.out.println(tooltip);
	}
}
