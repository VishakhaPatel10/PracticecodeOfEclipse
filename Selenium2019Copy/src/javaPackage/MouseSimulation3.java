package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(3000);
	
		// Switching frame
		List <WebElement> allframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total frames available : " + allframes.size());
		driver.switchTo().frame(0);
	
		//driver.switchTo().frame(0).getLocation().getX();
		
		//Using Actions class dragging the element using coordinates
		WebElement src = driver.findElement(By.xpath("//*[@id='draggable']"));
		 Thread.sleep(9000);
        Actions act = new Actions(driver);
	   act.dragAndDropBy(src, 50, 50).build().perform();
	   // act.dragAndDropBy(src, 100, 100).build().perform();
	    
	    //Dragging the web Element and click and hold using coordinates
	    Thread.sleep(3000);
	    act.clickAndHold(src).dragAndDropBy(src,10,100).build().perform();
}

}
