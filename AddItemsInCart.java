import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsInCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//declare array for product that user want to add in a cart
		
		String[] productArr= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
	
		AddItemsInCart obj=new AddItemsInCart();
		obj.addItem(driver, productArr);
	}
	
	public void addItem(WebDriver driver,String[] productArr) throws InterruptedException
	{
		int j=0;
		List<WebElement> product =driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0; i<product.size();i++)
		{
			String[] productName=product.get(i).getText().split("-");
				String formattedName=productName[0].trim();
				
			
			//Convert array to arrayList for easy search
			//check whether name you expected is available in arraylist
			List item=Arrays.asList(productArr);
			
			if(item.contains(formattedName))
					{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				Thread.sleep(3000);
				
				if(j==productArr.length)
				{
					break;
				}
					}
		}
	}

}
