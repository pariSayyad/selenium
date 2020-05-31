package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\future\\Downloads\\chrome\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http//www.google.com");
	}

}

