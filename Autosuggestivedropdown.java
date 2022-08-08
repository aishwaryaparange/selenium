import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		String text ="Indonesia";
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase(text))
			{
			  option.click();
			 // System.out.println(option.getText());autosuggest
				break;
			}
		}
		System.out.println("test "+driver.findElement(By.id("autosuggest")).getAttribute("value"));
		//driver.close();
		
	}

}
