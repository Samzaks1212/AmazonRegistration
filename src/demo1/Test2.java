package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		//start the chrome server
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samia\\Desktop\\MyLiveProjct\\chromedriverserver\\chromedriver.exe" );

		//start browser
		WebDriver driver = new ChromeDriver();
		
		//start web aaplication
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26hvadid%3D77996626205006%26hvbmt%3Dbb%26hvdev%3Dc%26hvqmt%3Dp%26ref%3Dpd_sl_33o5jsc0zp_b%26tag%3Dmh0b-20%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		
		driver.manage().window().maximize();
		
		//WebElement createAccount = driver.findElement(By.xpath("//a [@id = 'createAccountSubmit']"));
		//Thread.sleep(3000);
		//createAccount.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input [@placeholder = 'First and last name']"));
		Thread.sleep(3000);
		firstName.sendKeys("samia zaki");
		
		WebElement email = driver.findElement(By.xpath("//input [@id = 'ap_email']"));
		Thread.sleep(3000);
		email.sendKeys("samia999999999999@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input [@placeholder = 'At least 6 characters']"));
		Thread.sleep(3000);
		password.sendKeys("12345678");
		
		WebElement rePassword = driver.findElement(By.xpath("//input [@name = 'passwordCheck']"));
		Thread.sleep(3000);
		rePassword.sendKeys("12345678");
		
		
		WebElement continuebutton = driver.findElement(By.xpath("//input [@id = 'continue']"));
		Thread.sleep(3000);
		continuebutton.click();
		
		
		
		
		
		
		
		
		
	}

}
