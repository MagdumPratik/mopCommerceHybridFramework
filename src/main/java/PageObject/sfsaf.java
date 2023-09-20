package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sfsaf{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		System.out.println("Default page title is :"+driver.getTitle());   //Your store. Login
		WebElement email=driver.findElement(By.name("Email"));
		email.clear();
		email.sendKeys("admin@yourstore.com");
		
		WebElement pass=driver.findElement(By.name("Password"));
		pass.clear();
		pass.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(5000);
		System.out.println("Home Page title is :"+driver.getTitle());  //Dashboard / nopCommerce administration
		
		driver.close();
	}

}
