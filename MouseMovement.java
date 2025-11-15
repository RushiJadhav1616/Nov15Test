package SDM_DAY_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement 
{

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver dr = new ChromeDriver();
		
		dr.get("https://accounts.saucelabs.com/am/XUI/#login/");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement we = dr.findElement(By.id("idToken1"));
		Actions a = new Actions(dr);
		a.moveToElement(we).contextClick().build().perform();
		Thread.sleep(1000);
		we.sendKeys("Rushikesh");
		Thread.sleep(1000);
		a.doubleClick(we).build().perform();
		Thread.sleep(1000);
		
		dr.close();

	}

}
