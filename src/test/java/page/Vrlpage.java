package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vrlpage {
	WebDriver driver;
	By start=By.xpath("//*[@id=\"FromCity\"]");
	By almatti=By.xpath("//*[@id=\"demo\"]/section[3]/div/div[1]/div");
	By end=By.xpath("//*[@id=\"ToCity\"]");
	By banglr=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div");
	By date=By.xpath("//*[@id=\"txtFromDate\"]");
	By search=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");
	
	public void tripdetails()
	{
		driver.findElement(start).click();
		driver.findElement(almatti).click();
		driver.findElement(end).click();
		driver.findElement(banglr).click();
		driver.findElement(date).click();
	}
	public void searching()
	{
		driver.findElement(search).click();
	}

}
