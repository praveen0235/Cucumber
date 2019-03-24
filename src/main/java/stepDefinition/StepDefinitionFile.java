package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;


public class StepDefinitionFile {
	
	public static WebDriver driver = null;
	public Properties property = null;
	
	@cucumber.api.java.en.Given("^navigate to the url$")
	public void navigate_to_the_url() throws IOException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PRajendra\\Downloads\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		property = new Properties();
		
		FileInputStream File = new FileInputStream("D:\\WorkSpace\\cucumber\\src\\main\\java\\feature\\test.properties");
		
		property.load(File);
		
		driver.navigate().to(property.getProperty("url"));
	  
	}
	
	

	
	@cucumber.api.java.en.When("^enter the company username password$")
	public void enter_the_company_username_as_password_as() throws InterruptedException{
		
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		String Mainwindow = driver.getWindowHandle();
		
		Set<String> allwindow = driver.getWindowHandles();
		
		Iterator<String> lt = allwindow.iterator();
		
		while(lt.hasNext())
		{
			String childwindow = lt.next();
			
			if(!Mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(Mainwindow);
		
				
				driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]")).click();
		String Mainwindow1 = driver.getWindowHandle();
		
		Set<String> allwindow1 = driver.getWindowHandles();
		
		Iterator<String> lt1 = allwindow1.iterator();
		
		while(lt1.hasNext())
		{
			String childwindow1 = lt1.next();
			
			if(!Mainwindow1.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(Mainwindow1);
	}

}
