package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Arun");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		//driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		//driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Arun");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(2)")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("1234567890@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("1234567890@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Arun");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();

	}

}
