package SDM_DAY_2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class TabOpen 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr = new ChromeDriver();
		
		String gpw = dr.getWindowHandle();
		dr.get("https://mail.google.com/mail/u/0/");
		dr.manage().window().maximize();
		Thread.sleep(2000);
		
		dr.switchTo().newWindow(WindowType.TAB);
		String pw = dr.getWindowHandle();
		dr.get("https://chatgpt.com/auth/login");
		Thread.sleep(2000);
		
		dr.switchTo().newWindow(WindowType.TAB);
		String cw = dr.getWindowHandle();
		dr.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(2000);
		
		dr.switchTo().window(pw);
		Thread.sleep(2000);
		
		dr.switchTo().window(gpw);
		Thread.sleep(2000);
		
		dr.switchTo().window(cw);
		Thread.sleep(2000);
		
		dr.close();
		dr.quit();
	}

}
