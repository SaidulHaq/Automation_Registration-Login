package ittbd.bproperty;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainDriver {
	
	String BpropertyUrl = "https://www.bproperty.com/";
	WebDriver driver;
	
	@BeforeSuite
	 public void open() {
		 String browser = System.getProperty("browser", "firefox");
		 
		 if (browser.contains("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			
		}else if (browser.contains("chrom")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
	}
	
	public String randomName() {
		String autoGenerate = RandomStringUtils.randomAlphabetic(5);
		return autoGenerate;
		
	}
	
	public String randomMail() {
		String autoGenerate = RandomStringUtils.randomAlphanumeric(6);
		String mail = autoGenerate.concat("@gmail.com");
		return mail;
		
	}
	
	
	@AfterSuite
	public void close() {
		driver.quit();
		
	}

}
