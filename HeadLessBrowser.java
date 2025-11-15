package SDM_DAY_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessBrowser 
{
	public static void main(String[] args) 
	{
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("headless");
		co.addArguments("incognito");
		
		WebDriver dr = new ChromeDriver(co);
		dr.get("https://www.instagram.com/accounts/login/?hl=en");
		
		
//		FirefoxOptions fx = new FirefoxOptions();
//		fx.addArguments("--headless");
//		WebDriver dx = new FirefoxDriver(fx);
//		dx.get("https://chatgpt.com/auth/login");
		
		System.out.println(dr.getTitle());
//		System.out.println(dx.getTitle());
	}
}
