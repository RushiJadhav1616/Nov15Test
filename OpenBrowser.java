package SDM_DAY_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr = new ChromeDriver();
//		WebDriver dr1 = new FirefoxDriver();
//		WebDriver dr2 = new EdgeDriver();
		
		dr.get("https://www.google.com/maps/place/Shree+Samarth+villa/@19.9819384,73.7745866,18z/data=!3m1!4b1!4m6!3m5!1s0x3bddeb68b3a780f3:0xb0e01b877dd11619!8m2!3d19.9819366!4d73.775497!16s%2Fg%2F11flbrml96?entry=ttu&g_ep=EgoyMDI1MTEwNS4wIKXMDSoASAFQAw%3D%3D");
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.manage().window().minimize();
		System.out.println(dr.getTitle());
		dr.close();
		
		
	}

}
