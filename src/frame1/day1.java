package frame1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void bp() throws IOException
	{
		Properties pro= new Properties();
		FileInputStream file= new FileInputStream("Users//mohammadhasan//workspace//framework2//src//frame1//datadriver.properties");
		pro.load(file);
		
		
		System.out.println(pro.getProperty("username"));
		
		
//		System.setProperty("webdriver.chrome.driver", "/Users/mohammadhasan/Downloads/chromedriver 2");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https:www.express.com");
//		driver.findElement(By.xpath("")).sendKeys(username);
	}
	
	@BeforeSuite
	public void speedyway()
	{
		System.out.println("im the number 1");
	}
	@Test
	public void shell()
	{
		System.out.println("golden state strugging this year in NBA");
		throw new SkipException ("skipping this test due to no longer needed");
	}
	@Test(groups={"Smoke"})
	public void next()
	{
		System.out.println("NBA playoff starts this saturday");
	}
}
