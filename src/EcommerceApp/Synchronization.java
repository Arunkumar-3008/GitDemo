package EcommerceApp;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Continued from the same adding items 
String[] itemNeeded = {"Cucumber","Beetroot","Carrot"};
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait explicit = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		
		Thread.sleep(3000);
		Cart(driver,itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		explicit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
		
		
		
		


	public static void Cart(WebDriver driver,String[] itemNeeded)
	{
		int j =0;
		List<WebElement>products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i = 0;i<products.size();i++)
		{
			String[] Name = products.get(i).getText().split("-");
			String formattedName = Name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemNeeded);
			
			
			
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemNeeded.length)
				{
					break;
					
				}
				
				
			}
		}
	}



	}

	


