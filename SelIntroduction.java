import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/rohanparange/Documents/Aishwarya_automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/");
		System.out.println("URL Title is" + driver.getTitle());
		System.out.println("Current URL Title is " + driver.getCurrentUrl());
		
		driver.findElement(By.className("register-btn")).click();
		driver.findElement(By.id("email")).sendKeys("parangeaishwarya@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pwd123");
		driver.findElement(By.className("button")).click();
		System.out.println("login button clicked");
		
		System.out.println(driver.findElement(By.className("auth-flash-error")).getText());
		driver.findElement(By.id("password")).sendKeys("Rohan@0702");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(02000);
		String loginMessage=driver.findElement(By.xpath("//div[@class='m-l-3-xs'][1]")).getText();
		System.out.println(loginMessage);
		Assert.assertEquals(loginMessage, "Please confirm your email to fully activate your account. You can do this by clicking the link in the email confirmation we sent you.");
		driver.findElement(By.xpath("//span[@class='navbar-current-user']")).click();
		driver.findElement(By.linkText("Log Out"));
		System.out.println("User has logged out");
		Thread.sleep(02000);
	//	String logoutMessage=driver.findElement(By.
		//System.out.println(logoutMessage);
		
		driver.close();
		
		
	}

}
