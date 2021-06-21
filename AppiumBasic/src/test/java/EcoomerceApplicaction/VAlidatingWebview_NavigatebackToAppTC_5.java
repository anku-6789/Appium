package EcoomerceApplicaction;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class VAlidatingWebview_NavigatebackToAppTC_5 extends basicSetup{

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub

		
AndroidDriver<AndroidElement> driver= capabilities("emulator");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

		driver.hideKeyboard();

		driver.findElement(By.xpath("//*[@text='Female']")).click();

		driver.findElement(By.id("android:id/text1")).click();



		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

		//   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

		driver.findElement(By.xpath("//*[@text='Argentina']")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();



		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		Thread.sleep(4000);

	
//Mobile Gesture
	
	  WebElement Checkbox=driver.findElement(By.className("android.widget.CheckBox"));
	System.out.println("here it will click on checkbox");
	TouchAction t= new TouchAction(driver);
	t.tap(tapOptions().withElement(element(Checkbox))).perform();

System.out.println("here on click of visit button will navigate to webview");
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	
	//here we need to use hybrid need to use contextview
	
	//uses set java collection as return type
	Thread.sleep(7000);
	Set<String> context=driver.getContextHandles();

	for(String ContextName:context)//enhanced for loop
	{
		System.out.println(ContextName);
		System.out.println("webview is  printing");
		
	}
	//so as output we got two view one native and other webview
	driver.context("WEBVIEW_com.androidsample.generalstore");
	System.out.println("here i am navigated to web-browser");
	driver.findElement(By.name("q")).sendKeys("Appium Automation");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	//to comevack navigated to Nativeapp
	//key event class object of appium java client to comeback we dont have on ios
	System.out.println("here navigated to native app");
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	
	}
	

	
	
	}


