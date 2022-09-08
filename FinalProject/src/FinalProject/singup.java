package FinalProject;
import org.testng.annotations.Test;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.*;




 public class singup {

	 
	 /*@Test(priority=1)

	public void singup() throws InterruptedException {
	//public void xPath() throws InterruptedException


		SafariDriver driver =new SafariDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.talabat.com/ksa");
		 Thread.sleep(2000);

		//button register
		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[4]/li[8]/a[1]")).click();	
		 Thread.sleep(3000); 

		 
		 
		 //NEW ACCOUNT
		 driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
			Thread.sleep(2000);
			
			
			//FIRST name
		driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("rahaf");
		 Thread.sleep(3000); 

		
		  //Last Name
		 driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("Alanazi");
		 Thread.sleep(3000); 
		 
		//Email
		 driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("rahaf1@gmail.com");
		 Thread.sleep(3000); 
		 
		 
		 //Password
		 driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/input[1]")).sendKeys("@ASDasd123456799");
		 Thread.sleep(3000); 
		 //Confirm Password
		 driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]")).sendKeys("@ASDasd123456799");
		 Thread.sleep(3000); 
		 //Gender
		 driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			Thread.sleep(2000);
		 
		 
		 
		 WebElement dateBox = driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/div[1]/div[1]/input[1]"));

	        //Fill date as mm/dd/yyyy as 09/25/2013
	        //Press tab to shift focus to time field

	        dateBox.sendKeys("09/05/1999");
	        dateBox.click();
	        Thread.sleep(3000); 

	        
	        driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[8]/div[1]/label[1]/span[1]")).click();
			Thread.sleep(2000);
		 
					//robort 
			
			driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/form[1]/div[10]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("div.globalstyles__GlobalContainer-sc-fulyk5-0.beagJX div.layoutstyles__LayoutContainer-sc-180yh52-0.kBOQAn.px-4 div.registerstyles__RegisterContainer-sc-1jsjfe7-0.fvLiyr form:nth-child(4) > div.d-flex.justify-content-center.mt-4:nth-child(11)")).sendKeys(Keys.ENTER);
			Thread.sleep(8000);

		//class="recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-checked"
			
			
			//craetaccount
			
			driver.findElement(By.xpath("//button[contains(text(),'Create your account')]")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
	}*/
			
			@Test
			(priority=2)
				

			public void login() throws InterruptedException {
			//public void xPath() throws InterruptedException


				//WebDriver driver =new FirefoxDriver();
				SafariDriver driver =new SafariDriver();
				driver.manage().window().maximize();

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
					


					//click for job #not work
					driver.findElement(By.xpath("//a[contains(text(),'Apply')]")).click();
						Thread.sleep(6000);
						
						
						//driver.findElement(By.xpath("//button[@id='awli-button-member-1662217304883']")).sendKeys(Keys.ENTER);
						//Thread.sleep(6000);
						          //driver.switchTo().frame("applyWithLinkedIn");

						
					//driver.findElement(By.xpath("//button[contains(text(),'Create your account')]")).sendKeys(Keys.ENTER);
					//Thread.sleep(5000);
					
				
			
			
			driver.close();
		 
            }

         }



