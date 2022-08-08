//import java.time.Duration;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert; 

public class AddItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] item= {"Brocolli","Brinjal"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(2000);
		AddItems obj=new AddItems();
		obj.AddItemToCart(driver,item);
		obj.Applypromocode(driver);
		
		driver.close();
	
		
	}


	private void AddItemToCart(WebDriver driver,String[] Item) throws InterruptedException
	{
		int j=0;
		
		List<WebElement> Product=driver.findElements(By.xpath("//h4[@class='product-name']"));
				for(int i=0;i<Product.size();i++)
				{
					String[] Product1=Product.get(i).getText().split("-");
					String formattedProduct=Product1[0].trim();
				
		// TODO Auto-generated method stub
		List<String> itemToBeadded=Arrays.asList(Item);
		if(itemToBeadded.contains(formattedProduct))
		{
			j++; 
			
		driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
			Thread.sleep(2000);
			
			if(j==Item.length)
			{
				break;
			}
		}
		
		
	}

}
	
	
	private void Applypromocode(WebDriver driver)
	{
		
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		//explicit wait apply only for specific step (message is taking time to display after clicking on apply)
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		String message=driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		Assert.assertEquals("Code applied ..!", message);		
	}
	
	
}
