import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UIAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.name("name")).sendKeys("Aishwarya Rohan Parange");
		driver.findElement(By.name("email")).sendKeys("parangeaishwarya@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Rohan@1234");
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select staticdropdown=new Select(dropdown);
		staticdropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("08-05-1996");
		
		driver.findElement(By.className("btn-success")).click();
		
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		String outputText=driver.findElement(By.className("alert-success")).getText();
		Assert.assertEquals(outputText,"Success! The Form has been submitted successfully!.");
		driver.quit();		
	}

}
