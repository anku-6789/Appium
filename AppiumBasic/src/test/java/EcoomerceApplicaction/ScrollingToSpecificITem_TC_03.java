package EcoomerceApplicaction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollingToSpecificITem_TC_03 extends basicSetup {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = capabilities("emulator");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// test case for filling the form
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();

		driver.findElement(By.xpath("//*[@text='Female']")).click();

		System.out.println("here it is selecting country");
		driver.findElement(By.id("android:id/text1")).click();

		System.out.println(driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"));"));
		// alternate method
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='Antarctica']")).click();
		System.out.println("here it is clicking on shop button");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		System.out.println("here product navigateed to homepage and trying to select ");

		// direct to that particular method without scrolling
		// facing the issue of parse
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\"Jordan 6 Rings\".instance(0))"));
		// here go to complete product list then go to specific list of products
		// alternate method is 
		// here going to parent element first and thenon particular that element
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		// now here for all add to cart same id so here we are using for loop it will
		// iterate all the products and then where it will match with product name and
		// thenit will add that specific product to cart
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

		for (int i = 0; i < count; i++)

		{
             //traversing through product array
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

			if (text.equalsIgnoreCase("Jordan 6 Rings"))

			{
                   ///here if we  get that particular product then click on that element
			
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

				break;

			}

		}

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
//validating the product  order name on checkout page
		
		Thread.sleep(1000);
	String lastpageText = driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

		Assert.assertEquals("Jordan 6 Rings", lastpageText);

	}

}
