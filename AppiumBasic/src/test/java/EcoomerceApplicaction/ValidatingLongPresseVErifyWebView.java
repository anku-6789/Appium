package EcoomerceApplicaction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import  static io.appium.java_client.touch.TapOptions.tapOptions;
import  static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static  java.time.Duration.ofSeconds;

public class ValidatingLongPresseVErifyWebView extends basicSetup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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

		int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

		double sum=0;

		for(int i=0;i<count;i++)

		{

			String amount1= driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i).getText();

			double amount=getAmount(amount1);

			sum=sum+amount;//280.97+116.97

		}

		System.out.println(sum+"sum of products");



		String total=driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();



		total= total.substring(1);

		double totalValue=Double.parseDouble(total);

		System.out.println(totalValue+"Total value of products");

		Assert.assertEquals(sum, totalValue);

	
//Mobile Gesture
	
	  
	
	
	WebElement Checkbox=driver.findElement(By.className("android.widget.CheckBox"));
	System.out.println("here it will click on checkbox");
	TouchAction t= new TouchAction(driver);
	t.tap(tapOptions().withElement(element(Checkbox))).perform();
	System.out.println("here it will click on terms and condition");
	WebElement temsconditions= driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));
	t.longPress(longPressOptions().withElement(element(temsconditions)).withDuration(ofSeconds(2))).release().perform();
	
	driver.findElement(By.id("android:id/button1")).click();


	System.out.println("here on click of visit button will navigate to webview");
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	}
	

	public static double getAmount(String value)

	{

		value= value.substring(1);

		double amount2value=Double.parseDouble(value);

		return amount2value;

	}


		
		
		
	}
	
	


