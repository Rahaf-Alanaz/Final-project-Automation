package FinalProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.Command;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

 
public class CONEECTCUSTOMER {

	/*@Test
//(priority=1)

	public void applyforjob() throws InterruptedException {
		//public void xPath() throws InterruptedException
	SafariDriver driver =new SafariDriver();
			driver.manage().window().maximize();
				//go to job page to apply
 driver.navigate().to("https://www.talabat.com/ksa/contact-us");
Thread.sleep(10000);
//name
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Rahaf Alanazi");
Thread.sleep(6000);
//email
driver.findElement(By.xpath("//input[@id='mailFrom']")).sendKeys("rahaf@gmail.com");
Thread.sleep(6000);
	//mobile
driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("05999999999");
Thread.sleep(6000);

driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("I CAN NOT FOUND SOME RESTURANT");
Thread.sleep(6000);

//scroll down
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(1,1000)", "");
js.executeScript("window.scrollBy(1,350)", "");
Thread.sleep(8000);

//robot 
driver.findElement(By.xpath("//div[@id='contactus-recaptcha']")).click();
Thread.sleep(2000);

driver.findElement(By.id("id=\"recaptcha-anchor\"")).sendKeys(Keys.ENTER);
Thread.sleep(8000);


driver.findElement(By.cssSelector("//button[contains(text(),'Submit')]")).sendKeys(Keys.ENTER);
Thread.sleep(8000);

//CHEAK IF YOU CAN Live chat
driver.findElement(By.xpath("//a[contains(text(),'Live Chat')]")).click();
	Thread.sleep(6000);
}
*/
	@Test(priority=2)
	
	
public void login() throws InterruptedException {
//public void xPath() throws InterruptedException


	//WebDriver driver =new FirefoxDriver();
	SafariDriver driver =new SafariDriver();
	driver.manage().window().maximize();



     //livechat page
    driver.navigate().to("https://www.talabat.com/ksa/livechat");
	Thread.sleep(10000);
	
	
	driver.manage().window().maximize();
	//name
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("rahaf");
	Thread.sleep(6000);
	//email
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rahaf@gmail.com");
	Thread.sleep(6000);
	//mobile
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("05999999999");
	Thread.sleep(6000);
	//click starting chatting buttom woring
	driver.findElement(By.xpath("//button[contains(text(),'Start Chatting')]")).sendKeys(Keys.ENTER);
	Thread.sleep(6000);

	
	//click end buttom woring
	driver.findElement(By.xpath("")).sendKeys(Keys.ENTER);
	Thread.sleep(6000);
	
}

	
	
}

