package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\QA2022\\Selenium_Workspace\\CucumberPOMProject\\src\\main\\java\\configuration\\config.properties");
			prop.load(fis);
		} catch(IOException e) {
			e.getMessage();
		}
	}
	
	
	
	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox")) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\QA2022\\SeleniumJars\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
	
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.PAGE_TIME_OUT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.IMPLICI_WAIT));
		
		
		driver.get(prop.getProperty("url"));

}
}
