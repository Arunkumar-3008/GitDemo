package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).click();
		//System.out.println(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(2000);
		//int i = 1;
		//while(i<=3)
		//int i = 1;
				//while(i<=3)
				for(int i=1;i<=3;i++)
				{
					driver.findElement(By.id("hrefIncAdt")).click();
					//i++;
				}
				//int j =1;
				//while(j<=2)
				//for(int j=1;j<=2;j++)
				//{
					//driver.findElement(By.id("hrefIncChd")).click();
					//j++;
				//}
				//driver.findElement(By.id("hrefIncChd")).click();
				
				driver.findElement(By.id("btnclosepaxoption")).click();
				Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"4 Adult");
				System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
			}
		}




	

