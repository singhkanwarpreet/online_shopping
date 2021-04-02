package design;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class update_profile {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("http://localhost/design/my-account/");
    	
    	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		driver.manage().window().maximize();
    	
		driver.findElementById("username").sendKeys("kanwar");
		
		Thread.sleep(1000);
		
		driver.findElementById("password").sendKeys("kanwar");
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"content\"]/div/div/div/div[2]/div/form/p[3]/button").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"content\"]/div/div/div/div[2]/div/nav/ul/li[5]/a").click();
		
		driver.findElementById("account_first_name").sendKeys("kanwarpreet");
		driver.findElementById("account_last_name").sendKeys("singh");
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"content\"]/div/div/div/div[2]/div/div/form/p[5]/button").click();
		
	}

}
