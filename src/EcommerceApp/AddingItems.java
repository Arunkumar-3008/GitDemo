package EcommerceApp;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItems {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] itemNeeded = {"Cucumber","Beetroot","Carrot"};
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		Cart(driver,itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		
		
		
		

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
