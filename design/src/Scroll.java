import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
        driver.get("http://localhost/design/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

}
