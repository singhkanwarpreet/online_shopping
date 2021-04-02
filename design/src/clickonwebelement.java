import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class clickonwebelement {

	public static void main(String[] args) throws InterruptedException{
		
		
        System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/design/view-products");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"wp-block-themeisle-blocks-advanced-column-630e65ce\"]/div[1]/div[1]/a").click();
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"woocommerce_product_categories-2\"]/ul/li[1]/a").click();
		

	}

}
