import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		Assignment3 obj=new Assignment3();
		obj.login(driver);
		obj.AddItem(driver);
		
	}

	private void login(WebDriver driver) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy ");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
	
		driver.findElement(By.id("okayBtn")).click();
		System.out.println("Ok Button Clicked");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);	
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		}


	private void AddItem(WebDriver driver) 
	{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("ProtoCommerce Home")));
	
		List<WebElement> product=driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0;i<product.size();i++)
		{
			product.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
	}
}
