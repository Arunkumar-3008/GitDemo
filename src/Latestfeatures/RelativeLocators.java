package Latestfeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox= driver.findElement(By.cssSelector("[name='name']"));
		
		String boxName =driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
		System.out.println(boxName);
		WebElement dob = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		WebElement loveIcecreams = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(loveIcecreams)).click();
		WebElement rdb= driver.findElement(By.id("inlineRadio1"));
		String rdbName=driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText();
		System.out.println(rdbName);

	}

}
