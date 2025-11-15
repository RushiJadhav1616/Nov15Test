package SDM_DAY_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr = new ChromeDriver();
		dr.get("https://practicetestautomation.com/practice-test-login/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
//		dr.findElement(By.id("username")).click();
//		dr.findElement(By.id("username")).sendKeys("Welcome");
//		Thread.sleep(2000);
//		dr.findElement(By.id("username")).clear();
//		Thread.sleep(2000);
//		dr.findElement(By.id("username")).click();
//		dr.findElement(By.id("username")).sendKeys("student");
//		Thread.sleep(2000);
//		dr.findElement(By.id("password")).sendKeys("Password123");
		WebElement wb =  dr.findElement(By.id("username"));
		wb.click();
		wb.sendKeys("Welcome");
		Thread.sleep(2000);
		wb.clear();
		Thread.sleep(2000);
		wb.sendKeys("Student");
		Thread.sleep(2000);
		WebElement we =  dr.findElement(By.id("password"));
		we.click();
		we.sendKeys("Rushi");
		Thread.sleep(2000);
		we.clear();
		Thread.sleep(2000);
		we.sendKeys("password123");
		Thread.sleep(2000);
		
		
		String s = wb.getAttribute("value");
		System.out.println(s);
		System.out.println(wb.isDisplayed());
		System.out.println(wb.isSelected());
		System.out.println(wb.getLocation());
		System.out.println(wb.getSize());
		System.out.println(wb.getTagName());
		System.out.println(wb.getText());
		System.out.println("=====================");
		String s1 = we.getAttribute("value");
		System.out.println(s1);
		System.out.println(we.isDisplayed());
		System.out.println(we.isSelected());
		System.out.println(we.getLocation());
		System.out.println(we.getSize());
		System.out.println(we.getTagName());
		System.out.println(we.getText());
		System.out.println("=====================");
		WebElement we1 =  dr.findElement(By.id("submit"));
		we1.click();
		Thread.sleep(2000);
		WebElement message =  dr.findElement(By.id("error"));
		String p = message.getText();
		Thread.sleep(2000);
		System.out.println(p);
		System.out.println("=====================");
		WebElement we2 =  dr.findElement(By.id("submit"));
		we2.click();
		Thread.sleep(2000);
		WebElement message1 =  dr.findElement(By.id("show"));
		String p1 = message1.getText();
		Thread.sleep(2000);
		System.out.println(p1);
		dr.close();
	}

}
