package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public  WebDriver driver;
	public DesiredCapabilities cap;
	//-----------------------------------------
	
	public DesiredCapabilities capabilities() {
		cap= DesiredCapabilities.firefox();
	return cap;
	}

	public WebDriver initilizeDriver() throws IOException {
		String browserName=	defineProperty().getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\Testing Tools and Jars\\Work\\WebDriver\\chromedriverLatest.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver","D:\\Testing Tools and Jars\\Work\\WebDriver\\geckodriver.exe");
			driver = new FirefoxDriver(capabilities());	
		}
		else {
			System.setProperty("webdriver.ie.driver","D:\\Testing Tools and Jars\\Work\\WebDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

	}
	
	public Properties defineProperty() throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Rahul Mendiratta\\projectE2E\\src\\main\\java\\resources\\GlobalParameters.properties");
		prop.load(file);
		return prop;
	}
	
	public WebDriverWait explicitWait() {
		WebDriverWait exp = new WebDriverWait(driver,10); 
		return exp;
	}

	//-----------------------------------
}



