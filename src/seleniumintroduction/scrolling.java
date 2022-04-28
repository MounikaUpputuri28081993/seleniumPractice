package seleniumintroduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium practice/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> count = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < count.size(); i++) 
		{
			sum = sum + Integer.parseInt(get(i).getText());
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split("")[1].trim());
		Assert.assertEquals(sum, total);
	}

	private static WebElement get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	}


