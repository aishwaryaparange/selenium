import java.awt.Frame;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		
		WebElement dragpoint=driver.findElement(By.id("draggable"));
		WebElement droppoint=driver.findElement(By.id("droppable"));
		
		Actions obj=new Actions(driver);
		obj.dragAndDrop(dragpoint, droppoint).build().perform();
		
		driver.quit();
	}

}
