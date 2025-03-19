package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));//limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		WebElement tableColumn1 = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(tableColumn1.findElements(By.tagName("a")).size()); 
		
		for(int i = 1; i<tableColumn1.findElements(By.tagName("a")).size(); i++)
		{
			String clickBtn = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			
			
			tableColumn1.findElements(By.tagName("a")).get(i).sendKeys(clickBtn);
			
			Thread.sleep(5000);
		
		}
			
			Thread.sleep(5000);
			
			
			Set<String> a = driver.getWindowHandles();
			Iterator<String> it =a.iterator();
			
		
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
			
			
		}

	}


