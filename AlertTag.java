package SDM_DAY_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTag {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://demo.automationtesting.in/Alerts.html");
		dr.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement we = dr.findElement(By.xpath("//button[@onclick='alertbox()']"));
		we.click();
		Thread.sleep(1000);
		Alert al = dr.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(1000);
		
		we = dr.findElement(By.xpath("//a[@href='#CancelTab']"));
		we.click();
		Thread.sleep(1000);
		we =  dr.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		we.click();
		Thread.sleep(1000);
		Alert al2 = dr.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(al2.getText());
		al2.accept();
		Thread.sleep(1000);
		
		dr.close();
		
		
		
		
	}

}
