package AppiumPractice;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class longpressGesture extends setup{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
AndroidDriver<AndroidElement> ad= capabiltes();
		
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		ad.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		//tapping
		//for tapping purpose we need to usetouch action
	TouchAction t = new TouchAction(ad);
	//here to user tapoptions method need to import import static io.appium.java_client.touch.TapOptions.tapOptions; manually
		t.tap(tapOptions().)
	}

}
