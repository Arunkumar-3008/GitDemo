package intro;

import java.time.Duration;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Arun";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello" +" "+ name +",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passwordText =driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		String[] PasswordArray1 = passwordArray[1].split("'");
		String Password = PasswordArray1[0];
		System.out.println(Password);
		return Password;
	}

}
