package EcoomerceApplicaction;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class validatingSumOncheheckoutPage_TC_4 extends  basicSetup {

	
	
	
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Test CAse for adding two items in cart and verify its price on checkout page

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

		System.out.println("Here user is on add to cart screen");

		//	will get error :index out of bound after adding first element it will error the array will starts  from second because first element is added to cart
		//interview question if we are writing get(1)it will fail because 	 after first execution the second item will be first
		//driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		//here after execution
		//	driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		//     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		System.out.println("User is on checkout page");
		Thread.sleep(2000);


		
		//here validating the sums of two produts
		String amount1= driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(0).getText();
		double amountvalue1=getamount(amount1);//here we have created static method so no need to create  object
		
		//Now here created one finction and calling that function
		//here we will get $120.o we need to reomve $ sign
		//amount1 = amount1.substring(1);
		//when we have decimal its like a symbol//need to convert double data types
		//Double amountvalue1= Double.parseDouble(amount1);

		System.out.println(amount1+" ::here the value of first product");
		String amount2= driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(1).getText();
		double amountvalue2=getamount(amount2);
		//amount2 = amount2.substring(1);
		//Double amountvalue2= Double.parseDouble(amount2);
		System.out.println(amount2+"::here the value of  of second  product");

		Double   SumofProduct  = amountvalue1+amountvalue2;
		System.out.println(SumofProduct+"::SumofProduct");

		String total=   driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();

		total= total.substring(1)	 ;
		Double totalvalue=Double.parseDouble(total);
		System.out.println(totalvalue+"::Total value of produts on checkout page");
		Assert.assertEquals( SumofProduct, total) ;
	}
    public static double getamount(String value) {
    	
    	value=value.substring(1);
    	double  amount2Value=Double.parseDouble(value);
    	return amount2Value ;
    	
    	
    	
    }
	
	
	
	
	
	
}
