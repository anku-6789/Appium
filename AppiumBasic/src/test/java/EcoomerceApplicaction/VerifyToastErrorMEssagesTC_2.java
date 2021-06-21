package EcoomerceApplicaction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class VerifyToastErrorMEssagesTC_2  extends  basicSetup{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		
		AndroidDriver<AndroidElement> driver= capabilities("emulator");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		System.out.println("here it is selecting country");
		  driver.findElement(By.id("android:id/text1")).click();
		
		System.out.println(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"));"));
		
	//  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));   
		driver.findElement(By.xpath("//*[@text='Antarctica']")).click();
		System.out.println("here it is clicking on shop button");
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toastmessage =driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
		//here by default android developer while developing toast  message //name attribute for toast message will have content 
		System.out.println(toastmessage);
		
		//if we want to fail that test case use assertion
		Assert.assertEquals("please enter your name", toastmessage );//actual validation
		//here forcefully failed the testcase
	}
	
	

}
