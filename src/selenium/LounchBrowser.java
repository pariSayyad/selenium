package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\future\\Downloads\\chrome//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(4000);
		driver.close();
		
	}

}
