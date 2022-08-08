import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Scope obj=new Scope();
		obj.linkCount(driver);
		
		driver.quit();
	}

	private void linkCount(WebDriver driver) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//creating subset of driver to get link from particular area like only want link which are present in footer
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//Count link which are present in first column--create subset of footerdriver
		WebElement firstcolumncount=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int firstcollinkcount=firstcolumncount.findElements(By.tagName("a")).size();
		System.out.println(firstcollinkcount);
		
		//click on each link in first column and check pages are opened
		for(int j=1;j<firstcollinkcount;j++)
		{
			
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstcolumncount.findElements(By.tagName("a")).get(j).sendKeys(clickOnLink);
			Thread.sleep(2000);
		}
			//go to each and every window and grab title
			Set<String> windows=driver.getWindowHandles();	//stores parent window ID and child window ID
			Iterator<String> it=windows.iterator();	//to iterator set of window handles
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
			
			
		}
		
	}
	


