package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;





public class TestBase {

	public static WebDriver driver;
	
	
	public WebDriver intialization()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		//driver.get("https://redbus.in");
		return driver;
	}
	
	

}
