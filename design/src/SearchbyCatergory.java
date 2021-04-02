import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchbyCatergory {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://localhost/design/");

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"menu-item-558\"]/a/span").click();
		
		Thread.sleep(1000);
		
		driver.findElementById("menu-item-567").click();
		

	}

}
