package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ApplyforJob {

@Test

	public void applyforjob() throws InterruptedException {
		//public void xPath() throws InterruptedException


	
			SafariDriver driver =new SafariDriver();
			driver.manage().window().maximize();
				//go to job page to apply
			
			driver.navigate().to("https://www.talabat.com/ksa/signin");
			 Thread.sleep(2000);

			
				
				//Emial
			driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Rahaf-Alanaz@gmail.com");
			 Thread.sleep(3000); 

			 //Password
			 driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("@Asdfg12345");
			 Thread.sleep(3000); 

			
				
			 //click login
			 driver.findElement(By.xpath("//button[contains(text(),'Login')]")).sendKeys(Keys.ENTER);
				Thread.sleep(4000);
			
				
 driver.navigate().to("https://deliveryhero.wd3.myworkdayjobs.com/en-US/talabat/details/Sr-Software-Engineer---Backend_JR0024329");
Thread.sleep(10000);
//checkbos for location				
//((JavascriptExecutor)driver).executeScript("document.getElementById('e8ceac9423040136e46bf15a105dbb78')).click()");
//Thread.sleep(8000);


//click for job #not work
driver.findElement(By.xpath("//a[contains(text(),'Apply')]")).click();
	Thread.sleep(6000);
	
	
	driver.findElement(By.xpath("//button[@id='awli-button-member-1662217304883']")).sendKeys(Keys.ENTER);
	Thread.sleep(6000);
	          driver.switchTo().frame("applyWithLinkedIn");

	
			
			 //driver.switchTo().parentFrame();
				Thread.sleep(6000);
			
			
}
}