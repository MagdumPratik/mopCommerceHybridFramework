package TestCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utilities.ReadConfigProperties;
import Utilities.XLUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicClass {

	ReadConfigProperties rd=new ReadConfigProperties();
	XLUtils xl=new XLUtils();
	public  String baseURLBS=rd.baseURLPR();
	public  String emailBS=rd.baseEmailPR();
	public  String passBS=rd.basePAsswordPR();
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		logger=logger.getLogger("eCommerce");
		PropertyConfigurator.configure("log4j.properties");
		
	}
	
	@AfterClass
	public void tearup()
	{
		driver.quit();
	}



	public void captureScreenshot(WebDriver driver, String name) throws IOException
	{
		String fileName=generateFileName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(fileName));
		System.out.println("Screenshot taken SuccessFully");
	}
	  public static String generateFileName(){
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	        LocalDateTime now = LocalDateTime.now();
	        String currentDirectory = System.getProperty("user.dir");
	        String filePath = currentDirectory + "\\Screenshots\\";
	        String fileName = filePath + dtf.format(now) + ".png";
	        return fileName;
	    }


}
