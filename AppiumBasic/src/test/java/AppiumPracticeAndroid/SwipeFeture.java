package AppiumPracticeAndroid;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import APIDEMOS.setup;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static  java.time.Duration.ofSeconds;
public class SwipeFeture extends setup {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> ad=capabilities("emulator");
		
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		ad.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		ad.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		//ad.findElementByAndroidUIAutomator("text(\" 2.Inline\")").click();
		ad.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		//here it will not use classname with tagname because of special character
		System.out.println("here it will click on 9 in the clock with xpath");
		 ad.findElement(By.xpath("//*[@content-desc='9']")).click();//so using *  it find all the tagname with name 9
		 
		//now it will reset to 15 and then now we want to click on 45
		//swipe left
		 //long press for 1 sec on element then move to another element and then we release it
		 
		
		 TouchAction t= new  TouchAction(ad);
		WebElement first= ad.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement second= ad.findElement(By.xpath("//*[@content-desc='45']"));
		System.out.println("now here the left swipe action is going to execute");
		 t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	}
	

}
