import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		Assignment6 obj=new Assignment6();
		String optionText=obj.selectCheckbox(driver);
		obj.selectDropdown(driver,optionText);
		obj.Alert(driver,optionText);
		//driver.quit();
	}


	private String selectCheckbox(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]/input")).click();
		
		//grab checkbox text
		String userinput=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(userinput);
		return userinput;
	}
	
	private void selectDropdown(WebDriver driver, String optionText) {
		// TODO Auto-generated method stub
		WebElement dropdowns=driver.findElement(By.id("dropdown-class-example"));
		Select dropdownvalue=new Select(dropdowns);
		dropdownvalue.selectByVisibleText(optionText);;
	}
	
	private void Alert(WebDriver driver, String optionText) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys(optionText);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String AlertText=driver.switchTo().alert().getText();
		System.out.println(AlertText);
		driver.switchTo().alert().accept();
		/*String[] arr1=AlertText.split(",");
		String[] arr2=arr1[0].split(" ");
		String finalText=arr2[1].trim();
		System.out.println(finalText);
		Assert.assertEquals(optionText, finalText);*/
		
		//d9ifferent method
		if(AlertText.contains(optionText))
		{
			System.out.println("Alert box is having " + optionText); 
		}
		else
		{
			System.out.println("Alert box is not having " + optionText); 
		}
	}

	

}
