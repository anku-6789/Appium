package AppiumPracticeAndroid;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import APIDEMOS.setup;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;

public class DragAndDropFeature extends setup {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> ad=capabilities("emulator");
			
			ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			ad.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
			
			ad.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		//Android drag and drop
			
			TouchAction t= new TouchAction(ad);
			
			//need to longpress (source)// longpress (destination)and release //move to destination and release
			
			
			WebElement source= ad.findElementsByClassName("android.view.View").get(0);
			
			WebElement destination= ad.findElementsByClassName("android.view.View").get(2);
			
			//t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(2))).moveTo(element(destination)).release().perform();
			
		//	we can use it as 
			
			t.longPress(element(source)).moveTo(element(destination)).release().perform();
	}

}
