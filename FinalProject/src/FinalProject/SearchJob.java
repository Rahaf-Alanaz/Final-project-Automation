package FinalProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.safari.SafariDriver;


public class SearchJob{
	@Test(priority = 0)

	public void login() throws InterruptedException {
	//public void xPath() throws InterruptedException


		//WebDriver driver =new FirefoxDriver();
		SafariDriver driver =new SafariDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.talabat.com/ksa");
		 Thread.sleep(2000);

	
		//scollr downto shopping
		 
		 JavascriptExecutor je = (JavascriptExecutor) driver;
		  je.executeScript("window.scrollBy(1,1000)", "");
		  //je.executeScript("window.scrollBy(1,350)", "");
		  Thread.sleep(8000);
		 
		  //go to another page job
		  driver.findElement(By.cssSelector("body.marshmallow-theme.loggedOff.hideSmb:nth-child(2) "
		  		+ "div.ng-scope:nth-child(6) ui-view.ng-scope section.work-with-us.ng-scope div.container.container-extended div.flex."
		  		+ "flex-wrap-centered div.col-md-8.col-lg-6.col-sm-12.work-col div.img-card div."
		  		+ "details-section > a.btn.tlb-btn-primary.work-card-btn")).click();
				  Thread.sleep(10000); 
				
				  
		
				//scollr downto 
					 
					 JavascriptExecutor js = (JavascriptExecutor) driver;
					  js.executeScript("window.scrollBy(1,1000)", "");
					  js.executeScript("window.scrollBy(1,350)", "");
					  Thread.sleep(8000);
				 
					  
					  
					  // GO TO PAGE FOR JOB WITHH APPLY BUTTON
					  driver.navigate().to("https://deliveryhero.wd3.myworkdayjobs.com/talabat");
						 Thread.sleep(2000);
					  
					  
					  //go to job page to apply
					  driver.navigate().to("https://deliveryhero.wd3.myworkdayjobs.com/en-US/talabat/details/Sr-Software-Engineer---Backend_JR0024329");
						 Thread.sleep(8000);
					  
					  
						//scollr down job page
						 
						 JavascriptExecutor ja = (JavascriptExecutor) driver;
						  ja.executeScript("window.scrollBy(1,1000)", "");
						  //ja.executeScript("window.scrollBy(1,350)", "");
						  Thread.sleep(7000);
						 
				  //click for job #not work
				 driver.findElement(By.xpath("//a[contains(text(),'Apply')]"))
				 .sendKeys(Keys.ENTER);
					Thread.sleep(9000); 
				  
				
		 driver.quit();
		driver.close();


		
	}
	}