package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//a[@text='Chennai (MAA)']
		//a[@text='Bengaluru (BLR)']
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		driver.findElement(By.xpath("//div[@id='dropdownGroup1'] //a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		//System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			//i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"4 Adult");
		//System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		
		//System.out.println(driver.findElement(By.className("ui-state-default ui-state-highlight ui-state-active")).click());

	}

}
