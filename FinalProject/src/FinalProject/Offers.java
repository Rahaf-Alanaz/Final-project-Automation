package FinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

 
public class Offers {

@Test

	public void applyforjob() throws InterruptedException {
		//public void xPath() throws InterruptedException


	
			SafariDriver driver =new SafariDriver();
			driver.manage().window().maximize();
				//go to job page to apply
 driver.navigate().to("https://www.talabat.com/ksa");
Thread.sleep(10000);

//go for Offer page for resturant
driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[4]/li[1]/a[1]")).click();
	Thread.sleep(6000);

	//click in meta baled
	driver.findElement(By.cssSelector("div.globalstyles__GlobalContainer-sc-fulyk5-0.beagJX div.layoutstyles__LayoutContainer-sc-180yh52-0.kBOQAn.px-4 div.offersstyles__OffersContainer-sc-10pb4iq-0.fLagGC div.tab-contentstyles__TabContentContainer-sc-gxd0mm-0.RpPld div.row div.col-lg-3.col-md-3.col-sm-4.offer-item.mb-4:nth-child(1) div.b-a.item div.logo.b-b.text-center.pa-3 div.lazyImagestyles__LazyContainer-sc-cl9o9m-2.kNbier div.lazyImagestyles__FadeContainer-sc-cl9o9m-1.hIekte.d-flex.justify-content-center.align-items-center.w-100 div:nth-child(1) > img:nth-child(1)")).click();
	Thread.sleep(6000);
	
	

//click for All resturant button
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/div[1]/div[1]/div[4]/ul[1]/li[2]/a[1]")).click();
	Thread.sleep(6000);

	
	//driver.findElement(By.xpath("")).click();
	//Thread.sleep(6000);
	
	
	
	driver.findElement(By.xpath("//body/div[@id='__next']/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/div[30]/a[1]/div[1]")).sendKeys(Keys.ENTER);
		Thread.sleep(6000);
	
 driver.close();
		
}
}