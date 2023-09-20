package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigProperties {
	Properties pr;
	public ReadConfigProperties()
	{
	String filePath=System.getProperty("user.dir")+"\\Configuration\\config.properties";
	File src=new File(filePath);
	try
	{
		FileInputStream fis=new FileInputStream(src);
		pr=new Properties();
		pr.load(fis);
	}
	catch(Exception e)
	{
	System.out.println("Exception Occured :"+e.getMessage());
	
	}
	}
	public String baseURLPR()
	{
		String url=pr.getProperty("baseURL");
		return url;
	}
	public String baseEmailPR()
	{
		String Email=pr.getProperty("Email");
		return Email;
	}
	public String basePAsswordPR()
	{
		String pass=pr.getProperty("Password");
		return pass;
	}
}
