import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_cart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/design/");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"wp-block-themeisle-blocks-advanced-column-630e65ce\"]/div[1]/div[2]/a").click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"wp-block-themeisle-blocks-advanced-column-8e84f112\"]/div[2]/ul/li[1]/div[2]/a")).click();
		
		
		

	}

}
