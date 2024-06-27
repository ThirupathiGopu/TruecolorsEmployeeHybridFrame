package com.Testscripts.pages;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;

public class Loginpage 
{
	AndroidDriver<MobileElement> driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	Actions action;
	Select select;
	AndroidTouchAction touch;
	
	@BeforeTest
	  public void beforeTest() throws MalformedURLException 
	{
		htmlReporter = new ExtentSparkReporter("loginpage.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		  
		cap.setCapability("Devicename", "Galaxy M12");
		cap.setCapability("UDID", "RZ8R918FGWH");
		cap.setCapability("Platformname", "Android");
		cap.setCapability("Platformversion", "13");
		
		cap.setCapability("apppackage", "com.truecolors.employee");
		cap.setCapability("appactivity", "com.truecolors.employee.MainActivity -Truecolors-Employee");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		System.out.println("Android driver started successfully");
		
	}
	 @AfterTest
	  public void afterTest() 
	 {
		  extent.flush();
//		 driver.closeApp();
	  }
	 @Test
	 public void loginwithvalidaData() throws InterruptedException
	 {
		 //By clickontruecolorsapp=By.id("com.sec.android.app.launcher:id/home_icon");
		 By clickontruecolorsapp=By.xpath("//android.widget.TextView[@text='Truecolors -Employee']");
		 
		 WebElement clickontruecolorsappl=driver.findElement(clickontruecolorsapp);
		 clickontruecolorsappl.click();
		 Thread.sleep(4000);
		 By pleaselogintocontinue=By.xpath("//android.widget.TextView[@text='Please Login to continue']");
		 WebElement pleaselogintocontinuel=driver.findElement(pleaselogintocontinue);
		 pleaselogintocontinuel.isDisplayed();
		 Thread.sleep(2000);
		 if(pleaselogintocontinuel.isDisplayed())
		 {
		 By usernametexbox=By.id("com.truecolors.employee:id/mobileEdit");
		 WebElement usernametxtbxl=driver.findElement(usernametexbox);
		 usernametxtbxl.sendKeys("6300867226");
		 Thread.sleep(2000);
		 By clickoncheckbox=By.id("com.truecolors.employee:id/StatusCheck1");
		 WebElement clickoncheckboxl=driver.findElement(clickoncheckbox);
		 clickoncheckboxl.click();
		 Thread.sleep(2000);
		 By clickonnextbutton=By.id("com.truecolors.employee:id/buttonNext");
		 WebElement clickonnextbuttonl=driver.findElement(clickonnextbutton);
		 clickonnextbuttonl.click();
		 Thread.sleep(10000);
		 By clickOnloginbtn=By.xpath("//android.widget.Button[@text='Login']");
		 WebElement clickOnloginbtnl=driver.findElement(clickOnloginbtn);
		 clickOnloginbtnl.click();
		 Thread.sleep(2000);
		 By isdisplayTextmsg=By.xpath("//android.widget.TextView[@text='Hey,TestUser!']");
		 WebElement isdiplaytxtmsgl=driver.findElement(isdisplayTextmsg);
		 isdiplaytxtmsgl .isDisplayed();
		 String Data=isdiplaytxtmsgl.getText();
		 System.out.println(Data);
		 String expdata="Hey,TestUser!";
		 Assert.assertEquals(Data, expdata,"test case pass");
		 Thread.sleep(2000);
		 By clickonprofile=By.id("com.truecolors.employee:id/profile");
		 WebElement profilel=driver.findElement(clickonprofile);
		 profilel.click();
		 Thread.sleep(2000);
		 By clickonHistory=By.xpath("//android.widget.TextView[@text='Order history']");
		 WebElement histortyl=driver.findElement(clickonHistory);
		histortyl.isDisplayed();
		 histortyl.click();
		 Thread.sleep(2000);
		 By clickonbackbtn=By.id("com.truecolors.employee:id/backImg");
		 WebElement backbtnl=driver.findElement(clickonbackbtn);
		 backbtnl.click();
		 Thread.sleep(2000);
		 By clickonlogoutbtn=By.xpath("//android.widget.TextView[@text='Log out']");
		 WebElement clickonlogoutbtnl=driver.findElement(clickonlogoutbtn);
		 clickonlogoutbtnl.click();
		 Thread.sleep(3000);
		 By textmsg=By.xpath("//android.widget.TextView[@text='Are you sure You want to logout ?']");
		 WebElement textmsgl=driver.findElement(textmsg);
		 String dataaa=textmsgl.getText();
		 System.out.println(dataaa);
         String exptextmsg="Are you sure You want to logout ?";
         Assert.assertEquals(false, exptextmsg,"test case pass");
         Thread.sleep(3000);
         By clickonlogoutbt=By.xpath("//android.widget.Button[@text='Logout']");
         WebElement logoutbtnl=driver.findElement(clickonlogoutbt);
         logoutbtnl.click();
		 }
else
{
		 By isdisplayTextmsg=By.xpath("//android.widget.TextView[@text='Hey,TestUser!']");
		 WebElement isdiplaytxtmsgl=driver.findElement(isdisplayTextmsg);
		 isdiplaytxtmsgl .isDisplayed();
		 String Data=isdiplaytxtmsgl.getText();
		 System.out.println(Data);
		 String expdata="Hey,TestUser!";
		 Assert.assertEquals(Data, expdata,"test case pass");
		 Thread.sleep(2000);
		 By clickonprofile=By.id("com.truecolors.employee:id/profile");
		 WebElement profilel=driver.findElement(clickonprofile);
		 profilel.click();
		 Thread.sleep(2000);
		 By clickonHistory=By.xpath("//android.widget.TextView[@text='Order history']");
		 WebElement histortyl=driver.findElement(clickonHistory);
		histortyl.isDisplayed();
		 histortyl.click();
		 Thread.sleep(2000);
		 By clickonbackbtn=By.id("com.truecolors.employee:id/backImg");
		 WebElement backbtnl=driver.findElement(clickonbackbtn);
		 backbtnl.click();
		 Thread.sleep(2000);
		 By clickonlogoutbtn=By.xpath("//android.widget.TextView[@text='Log out']");
		 WebElement clickonlogoutbtnl=driver.findElement(clickonlogoutbtn);
		 clickonlogoutbtnl.click();
         Thread.sleep(3000);
         By clickonlogoutbt=By.id("com.truecolors.employee:id/logout");
         WebElement logoutbtnl=driver.findElement(clickonlogoutbt);
         logoutbtnl.isDisplayed();
         logoutbtnl.getText();
         logoutbtnl.click();
         }
		 
	 }

}
