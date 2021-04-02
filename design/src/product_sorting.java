import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class product_sorting {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/design/view-products/");

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"content\"]/div/div/div[2]/div[2]/form/select").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"content\"]/div/div/div[2]/div[2]/form/select/option[2]").click();
	}

}

