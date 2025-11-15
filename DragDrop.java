package SDM_DAY_2;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.google.common.io.Files;
public class DragDrop 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 WebDriver dr = new ChromeDriver();
		 Actions a1 = new Actions(dr);
		 Actions a2 = new Actions(dr);
		 Actions a3 = new Actions(dr);
		 
		 dr.get("https://demo.automationtesting.in/Static.html");
		 dr.manage().window().maximize();
		 Thread.sleep(1000);	
			
		 WebElement we = dr.findElement(By.id("angular"));
		 WebElement we1 = dr.findElement(By.id("droparea"));
		 a1.dragAndDrop(we, we1).build().perform();
		 Thread.sleep(1000);
		 
		 we = dr.findElement(By.id("mongo"));
		 we1 = dr.findElement(By.id("droparea"));
		 a2.dragAndDrop(we, we1).build().perform();
		 Thread.sleep(1000);
		 
		 we = dr.findElement(By.id("node"));
		 we1 = dr.findElement(By.id("droparea"));
		 a3.dragAndDrop(we, we1).perform();
		 Thread.sleep(1000);

		 File screenshot=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		 Files.copy(screenshot, new File("C:\\Users\\cdac\\Desktop\\SDM_SCREENSHOT"));
		 dr.close();
		 
	}

}
