import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Nested Frames")).click();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		//driver.switchTo().frame(driver.findElement(By.name("frame-top")));  parent frame-top
		//driver.switchTo().frame(driver.findElement(By.name("frame-middle")));   child frame
		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.quit();
	}

}
