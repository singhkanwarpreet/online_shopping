import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Login_test {
    public static void main(String[] arg) throws InterruptedException{
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium_drivers\\chromeDriver.exe");
    	
		
    	ChromeDriver driver=new ChromeDriver();
    	
    	driver.get("http://localhost/design/wp-login");
    	
    	String url=driver.getCurrentUrl();
    	
    	System.out.println("Current URL:" +url);
    	
    	String PageTitle= driver.getTitle();
    	
    	if("Amazon - log in or sign up".equals(PageTitle)) {
    		
    	       System.out.println("Test Case Passed");       
    	}
    	
    	else {
    		
    		System.out.println("Test Case Failed");
    	
    	}
    	
    	
    	driver.findElementById("user_login").sendKeys("kanwar");
    	
    	
    	Thread.sleep(1000);
    	
    	driver.findElementById("user_pass").sendKeys("kanwar");
    	
    	Thread.sleep(1000);
    	 	
    	driver.findElementById("wp-submit").click();
    	
    	
    	
	}
}
