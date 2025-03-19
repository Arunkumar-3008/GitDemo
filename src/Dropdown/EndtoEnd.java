package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='dropdownGroup1'] //a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'friendsandfamily')]")).click();
		//driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active")).click();
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		//int i = 1;
		//while(i<=3)
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
		}
		//int j =1;
		//while(j<=2)
		for(int j=1;j<=2;j++)
		{
			driver.findElement(By.id("hrefIncChd")).click();
			//j++;
		}
		//driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		driver.findElement(By.xpath("//input[contains(@id,'FindFlights')]")).click();

	}

}
