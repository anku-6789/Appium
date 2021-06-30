package POMGeneralStore;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {

	AndroidDriver <AndroidElement>driver;//here giving life from our 
	
	
	public Utilities(AndroidDriver<AndroidElement> driver)
	{
		this.driver= driver;//driver from testcase assign to local driver which we created above
	}
	
	
	public void ScrollTotext(String text)
	{
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))"));
	}
	
	
}
