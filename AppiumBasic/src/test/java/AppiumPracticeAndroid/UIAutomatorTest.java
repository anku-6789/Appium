package AppiumPracticeAndroid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import APIDEMOS.setup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest extends setup{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> ad=capabilities("emulator");
		
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//here ("("")") eclipse does not allowed  double commas inside double commas so here we need to use special character as backward slash before inner bracket
		 ad.findElementByAndroidUIAutomator("text(\"Views\")").click();
		 
		// ad.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		 //validate clickable  feature for all options
		 //how to identify attributes
		 //here we need to use it as UiSelector().property();//android internal logic all properties in that so we need to concate that only//clickable is property
		System.out.println(ad.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		 //it all those items are notclickable
	}

}