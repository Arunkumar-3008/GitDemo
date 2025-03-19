package MiscellaneousTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//<a href="https://rahulshettyacademy.com/brokenlink" xpath="1">Broken Link</a>
		String urlstring = driver.findElement(By.xpath("//a[@href='https://rahulshettyacademy.com/brokenlink']")).getDomAttribute("href");
		 URL url = URI.create(urlstring).toURL(); 
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int responseCode =conn.getResponseCode();
		System.out.println(responseCode);
		

	}

}
