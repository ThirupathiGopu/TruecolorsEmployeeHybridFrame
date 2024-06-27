package com.Testscripts.pages;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class OrderHistoryAndStatus 
{
	AndroidDriver<MobileElement> driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	Actions action;
	Select select;
	AndroidTouchAction touch;
	@BeforeTest
	public void setup() throws Exception
	{
		htmlReporter = new ExtentSparkReporter("loginpage.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		  
		cap.setCapability("Devicename", "Galaxy M12");
		cap.setCapability("UDID", "RZ8T404LY3P");
		cap.setCapability("Platformname", "Android");
		cap.setCapability("Platformversion", "13");
		
		cap.setCapability("apppackage", "com.truecolors.employee");
		cap.setCapability("appactivity", "com.truecolors.employee.MainActivity -Truecolors-Employee");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		System.out.println("Android driver started successfully");
	}
	@AfterTest
   public void close()
   {
	   extent.flush();
   }
	@Test
	public void verifyOrderStatusAndHistory() throws Exception
	{
		By clickontruecoloremployee=By.xpath("");
		WebElement clickontruecolorempl=driver.findElement(clickontruecoloremployee);
		clickontruecolorempl.click();
		Thread.sleep(2000);
		By clickonprofile=By.xpath("");
		WebElement clickonprofilel=driver.findElement(clickonprofile);
		clickonprofilel.click();
		Thread.sleep(3000);
		By clickonHistory=By.xpath("");
		WebElement clickonHistoryl=driver.findElement(clickonHistory);
		clickonHistoryl.click();
		
	}
   
}
