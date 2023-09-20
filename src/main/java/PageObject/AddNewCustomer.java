package PageObject;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {
	
	WebDriver ldriver;
	
	public AddNewCustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="(//a[@class='nav-link'])[21]")
	WebElement clickOnCustomer;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List']")
	WebElement clickONCustomer2;
	
	@FindBy(xpath="//a[normalize-space()='Add new']")
	WebElement addNewCustomer;
	
	@FindBy(name="Email")
	WebElement Email2;
	
	@FindBy(name="Password")
	WebElement password2;

	@FindBy(name="FirstName")
	WebElement firstName;
	
	@FindBy(name="LastName")
	WebElement lastName;
	
	@FindBy(id="Gender_Male")
	WebElement maleGender;
	
	@FindBy(xpath="//input[@id='DateOfBirth']")
	WebElement DOB;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement companyName;
	
	@FindBy(xpath="//input[@id='IsTaxExempt']")
	WebElement checkBox;
	
	@FindBy(xpath="//div[@class='input-group-append']//div[@role='listbox']")
	WebElement selctClass;
	
	@FindBy(xpath="(//div[@role='listbox'])[2]")
	WebElement selectClass2;
	
	@FindBy(xpath="//select[@id='VendorId']")
	WebElement selectClass3;
	
	@FindBy(xpath="//input[@id='Active']")
	WebElement checkBox2;
	
	@FindBy(name="//textarea[@id='AdminComment']")
	WebElement addComment;
	
	public void clickONCustomer()
	{
		clickOnCustomer.click();
	}
	
	public void clickonCustomeR2()
	{
		clickONCustomer2.click();
	}
	
	public void addCustomer()
	{
		addNewCustomer.click();
	}
	
	public void addEmail(String email)
	{
		Email2.sendKeys(email);
	}
	
	public void Password(String pass)
	{
		password2.sendKeys(pass);
	}
	
	public void FirstName(String FN)
	{
		firstName.sendKeys(FN);
	}
	
	public void LastName(String LN)
	{
		lastName.sendKeys(LN);
	}
	
	public void setDate(String dob)
	{
		DOB.sendKeys(dob);
	}
	
	public void companyName(String compayname)
	{
		companyName.sendKeys(compayname);
	}
	
	public void checkBoxSelect()
	{
		checkBox.click();
	}
	public void selectClass(int sc)
	{
		Select select=new Select(selctClass);
		select.selectByIndex(sc);
		
	}
	
	public void selectClass2(int sc2)
	{
		Select select=new Select(selectClass2);
		select.selectByIndex(sc2);
	}
	
	public void selectClass3(int sc3)
	{
		Select select=new Select(selectClass3);
		select.selectByIndex(sc3);
	}
	
	public void checkBoxSelect1()
	{
		checkBox2.click();
	}
	
	public void addComment(String addCom)
	{
		addComment.sendKeys(addCom);
	}
}
