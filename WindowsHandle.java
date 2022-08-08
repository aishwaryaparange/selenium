import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//rohanparange//Documents//Aishwarya_automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//How many window are opened--get id's of opened window
		Set<String> windows=driver.getWindowHandles();	//stores parent window ID and child window ID
		Iterator<String> it=windows.iterator();			//to iterator set of window handles
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String text=driver.findElement(By.cssSelector(".im-para.red")).getText();
		String[] arr=text.split("at");
		String[] arr2=arr[1].trim().split(" ");
		System.out.println(arr2[0]);
		String mailId=arr2[0];
		
		//send this mail id to parent window
		driver.switchTo().window(parentID);
		driver.findElement(By.id("username")).sendKeys(mailId);
		driver.quit();
	}

}

