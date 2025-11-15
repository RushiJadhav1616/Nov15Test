package SDM_DAY_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionDragDrop 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver wb = new ChromeDriver();
		wb.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		wb.manage().window().maximize();
		
		WebElement we =  wb.findElement(By.id("name"));
		we.click();
		Thread.sleep(1000);
		we.sendKeys("Rushikesh Jadhav");
		Thread.sleep(1000);
		
		WebElement we1 =  wb.findElement(By.id("email"));
		we1.click();
		we1.sendKeys("rjadhav1627@gmail.com");
		Thread.sleep(1000);
		System.out.println(we1.getAttribute(null));
		
		WebElement we2 =  wb.findElement(By.id("gender"));
		wb.findElement(By.xpath("//input[@id='name']//following::input[2]")).click();
		Thread.sleep(1000);
		
		WebElement we3 =  wb.findElement(By.id("mobile"));
		we3.click();
		we3.sendKeys("9307465760");
		Thread.sleep(1000);

		WebElement we4 =  wb.findElement(By.id("dob"));
		we4.click();
		we4.sendKeys("16/11/2003");
		Thread.sleep(1000);
		
		WebElement we5 =  wb.findElement(By.id("subjects"));
		we5.click();
		we5.sendKeys("5");
		Thread.sleep(1000);
		
		WebElement we6 =  wb.findElement(By.id("hobbies"));
		wb.findElement(By.xpath("//input[@id='hobbies']//following::input[2]")).click();
		wb.findElement(By.xpath("//input[@id='hobbies']//following::input[1]")).click();
		Thread.sleep(1000);
	
//		WebElement we7 =  wb.findElement(By.id("picture"));
//		we7.click();
//		we7.sendKeys("C:\\Users\\cdac\\Desktop\\SDM_IMAGE.jpg");
//		Thread.sleep(1000);
//		
		WebElement we8 =  wb.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
		we8.click();
		we8.sendKeys("Sadguru nagar,Sadashiv Villa,Nashik");
		Thread.sleep(1000);
		
		WebElement we9 = wb.findElement(By.id("state"));
		we9.click();
		Select sr = new Select(we9);
		sr.selectByIndex(2);
		Thread.sleep(1000);
		sr.selectByVisibleText("Haryana");
		Thread.sleep(1000);
		System.out.println(we9.getText());
		
		WebElement we10 = wb.findElement(By.id("city"));
		we10.click();
		Select sr1 = new Select(we10);
		sr1.selectByIndex(2);
		Thread.sleep(1000);
		sr1.selectByVisibleText("Agra");
		Thread.sleep(1000);
		
		wb.close();

	}

}
