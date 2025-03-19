package ActionsFrames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> It = windows.iterator();
		String parentId = It.next();
		String childId = It.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("p.im-para.red")).getText());
		String emailId= driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
