package MiscellaneousTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class multipleBrokenLinks {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, IOException, URISyntaxException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//<a href="https://rahulshettyacademy.com/brokenlink" xpath="1">Broken Link</a>
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/child::a"));
		SoftAssert a = new SoftAssert();
		for(WebElement link :links)
	
	{
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection)new URI(url).toURL().openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode =conn.getResponseCode();
			System.out.println(responseCode);
			a.assertTrue(responseCode<400,"The link with text"+ link.getText()+ "is broken with code" +responseCode );
			//if(responseCode>400)
			//{
				//System.out.println("The link with text"+ link.getText()+ "is broken with code" +responseCode);
				//Assert.assertTrue(false);
			//}
			
	}
		a.assertAll();

}
}
