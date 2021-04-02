import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class typingInTextBox {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("https://amz.run/45Wq");
    	
    	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElementById("woocommerce-product-search-field-0").sendKeys("summer");

		

		driver.findElement(By.xpath("//*[@id=\"woocommerce_product_search-2\"]/form/button")).click();


	}

}
