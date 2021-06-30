package AppiumFramework.AppiumFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import POMGeneralStore.Checkout;
import POMGeneralStore.FormPage;
import POMGeneralStore.Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class GenrealstorewithPOMTC extends basicSetup  {

	
	
	
	
	
	@Test()
	public void totalvalidation() throws IOException, InterruptedException 
	{
	
		
		service=startserver();
		System.out.println("appium server is starting here");
	//Test CAse for adding two items in cart and verify its price on checkout page
//here suppose we have different  app versions avilable then in this situation  we need to create a global proerty
	//here sending genral store app key value we are sending to appname
	AndroidDriver<AndroidElement> driver = capabilities("GenrealStoreApp");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	FormPage  form= new FormPage (driver);
	
	form.getNameField().sendKeys("mayuri");
	driver.hideKeyboard();
	form.getfeamleoption().click();
	
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	Utilities you= new Utilities(driver);
	
	
	you.ScrollTotext("Argentina");
	driver.findElement(By.xpath("//*[@text='Argentina']")).click();
	
	
	// driver.findElement(By.xpath("//*[@text='Afghanistan']")).click();
     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
     
     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
     driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	Thread.sleep(4000);
	int count=driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();
	double sum=0;
	Checkout checkOutPage=new Checkout(driver);
	
	for(int i=0;i<count;i++)
	{
	String amount1=	checkOutPage.productlist.get(i).getText();
	double amount=getamount(amount1);
	sum=sum+amount;//280.97+116.97.
	}
System.out.println(sum+"sum of products");

String total=checkOutPage.total.getText();

  total= total.substring(1);
  double totalValue=Double.parseDouble(total);
   System.out.println(totalValue+"Total value of products");
   Assert.assertEquals(sum, totalValue);

service.stop();
System.out.println("here stopping the appium server");

	}
public static double getamount(String value) {
	
	value=value.substring(1);
	double  amount2Value=Double.parseDouble(value);
	return amount2Value ;
	
	
	
}
	
	
}
