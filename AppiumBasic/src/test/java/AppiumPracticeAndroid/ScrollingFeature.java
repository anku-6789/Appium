package AppiumPracticeAndroid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import APIDEMOS.setup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingFeature extends setup {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> ad=capabilities("emulator");
			
			ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			ad.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		//Android scrolling
			
			System.out.println("It will start scrolling now");
			//if we need to access any properties
			//ad.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
			ad.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));");
			//here we are using ANdroid API code 
			
			System.out.println(ad.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Radio Group\"));"));
			
	}

}
