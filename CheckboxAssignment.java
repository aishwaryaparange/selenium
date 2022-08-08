import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement checkboxoption1=driver.findElement(By.name("checkBoxOption1"));
		WebElement checkboxoption2=driver.findElement(By.name("checkBoxOption2"));
		WebElement checkboxoption3=driver.findElement(By.name("checkBoxOption3"));
		
		List<WebElement> checkboxCount=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//check the checkbox
		String option="Option1";
		switch(option)
		{
		 case "Option1":
			 checkboxoption1.click();
			 Thread.sleep(2000);
			// System.out.println(checkboxoption1.isSelected());
			 Assert.assertTrue(checkboxoption1.isSelected());
			 break;
		
		 case "Option2":
			 checkboxoption2.click();
			 Thread.sleep(2000);
			 Assert.assertTrue(checkboxoption1.isSelected());
			 break;
			 
		 case "Option3":
			 checkboxoption3.click();
			 Thread.sleep(2000);
			 Assert.assertTrue(checkboxoption1.isSelected());
			 break;	
			 
		}
		
		
		//Unchecked the checkbox
		switch(option)
		{
		 case "Option1":
			 checkboxoption1.click();
			 Thread.sleep(2000);
			// System.out.println(checkboxoption1.isSelected());
			 Assert.assertFalse(checkboxoption1.isSelected());
			 break;
		
		 case "Option2":
			 checkboxoption2.click();
			 Thread.sleep(2000);
			 Assert.assertFalse(checkboxoption1.isSelected());
			 break;
			 
		 case "Option3":
			 checkboxoption3.click();
			 Thread.sleep(2000);
			 Assert.assertFalse(checkboxoption1.isSelected());
			 break;	
			 
		}
		
		//get the Count of number of check boxes present in the page
		
		System.out.println(checkboxCount.size());
	}


}


