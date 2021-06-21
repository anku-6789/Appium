package EcoomerceApplicaction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FillingTheFormTC_1  extends basicSetup{

	public static void main(String[] args)throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
          
		AndroidDriver<AndroidElement> driver= capabilities("emulator");
			
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//test case for filling the form 
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
  driver.hideKeyboard();
		
	driver.findElement(By.xpath("//*[@text='Female']")).click();
		
	System.out.println("here it is selecting country");
	  driver.findElement(By.id("android:id/text1")).click();
	
	System.out.println(driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"));"));
	
//  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));   
	driver.findElement(By.xpath("//*[@text='Antarctica']")).click();
	System.out.println("here it is clicking on shop button");
	 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	
	
	}
	



}
