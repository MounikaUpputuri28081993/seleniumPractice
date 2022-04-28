package seleniumintroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().deleteAllCookies();
		driver.switchTo().alert().dismiss();
		int dates=driver.findElements(By.className(".day")).size();
	    for (int i=0;i<dates;i++)
		{
	    	String text=driver.findElements(By.className(".day")).get(i).getText();
	    	if(text.equalsIgnoreCase("23")) 
	    	{
	    		driver.findElements(By.className(".day")).get(i).click();
	    	}
		}
		

	}

}
