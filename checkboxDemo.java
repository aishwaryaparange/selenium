import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxDemo {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement familyCheckbox=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
		WebElement seniorCitizen=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
		WebElement IndArm=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']"));
		WebElement Student=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']"));
		WebElement Unmr=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']"));
		
		
		String checkbox="Student";
		switch(checkbox)
		{
		case "Family and Friends":
				familyCheckbox.click();
				Thread.sleep(2000);
				System.out.println("Family and friends checkbox is checked");
				break;
			
		case "Senior Citizen":
			seniorCitizen.click();
			Thread.sleep(2000);
			System.out.println("Senior Citizen checkbox is checked");
			break;
			
		case " Indian Armed Forces":
			IndArm.click();
			Thread.sleep(2000);
			System.out.println("Indian Armed Forces checkbox is checked");
			break;
			
		case "Student":
			Student.click();
			Thread.sleep(2000);
			System.out.println("Student checkbox is checked");
			break;
			
		case "Unaccompanied Minor":
			Unmr.click();
			Thread.sleep(2000);
			System.out.println("Unaccompanied Minor");
			break;
		}
		
		//check the checkbox
		/*System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());*/
	
	//count number of check boxes in page
		System.out.println(driver.findElements(By.xpath("//input[contains(@type,'checkbox')]")).size());
		
		driver.close();
	}

}
