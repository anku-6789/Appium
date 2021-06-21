package AppiumPracticeAndroid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import APIDEMOS.setup;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;//for tapping action
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;//to remove the error on line no 38
import static io.appium.java_client.touch.offset.ElementOption.element;//these to remove element red line
import static  java.time.Duration.ofSeconds;//for long press duration



public class longpressGesture extends setup{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> ad=capabilities("emulator");
		
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		ad.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		//tapping
		//for tapping purpose we need to use touch action
		
	TouchAction t = new TouchAction(ad);
	WebElement expandlist= ad.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
	//here to user tapoptions method need to import import static io.appium.java_client.touch.TapOptions.tapOptions; manually
	System.out.println("It will tap on expand list by tocuch action");
System.out.println(t.tap(tapOptions().withElement(element(expandlist))).perform());//so here it will click on expand list

 ad.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
 WebElement pn= ad.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
 System.out.println("Here it will perform the long press option");
 t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();//it will long press and release and at the end for touch actions perform it will necessary
	
 
 //Thread.sleep(2000);
 System.out.println(ad.findElementById("android:id/title").isDisplayed());
	}
	

}
