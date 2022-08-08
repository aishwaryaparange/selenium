import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class FluentWaitTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.findElement(By.cssSelector(".heading")).getText());
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		//System.out.println(driver.findElement(By.xpath("//h3")).getText());
		String heading=driver.findElement(By.xpath("//h3")).getText();
		Assert.assertEquals(heading, "Dynamically Loaded Page Elements");
		
		driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		Wait<WebDriver> obj=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		
		//driver.quit();
	}

}
