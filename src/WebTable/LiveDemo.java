package WebTable;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
 class LiveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		//click on the column 
		//Capture all webelemnts in A
		//capture text of all webelements into new list 
		//sort the new list 
		//compare  list & soretd list 
		driver.findElement(By.xpath("//th[@aria-label='Veg/fruit name: activate to sort column ascending']")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> orginalList= elementList.stream().map(e->e.getText()).collect(Collectors.toList());
		List<String> sortedNewList = orginalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(orginalList.equals(sortedNewList));
		List<String>price;

		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price=rows.stream().filter(p->p.getText().contains("Rice"))
		.map(p->getPriceofVeggie(p)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			
		}
		}while(price.size()<1);
		
	}

	private static String getPriceofVeggie(WebElement p) {
		// TODO Auto-generated method stub
		String priceValue= p.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
		
	}

	

}
