package SDM_DAY_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {

	public static void main(String[] args)
	{
		WebDriver ch = new ChromeDriver();
		WebDriver ff = new FirefoxDriver();
		
		ch.get("https://www.google.com/");
		ff.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F"
				+ "0%2F&dsh=S-1709766761%3A1762857669530441&emr=1&flowEntry=ServiceLogin&flowName=GlifWebSignIn&follo"
				+ "wup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=ARESoU1kp3obDxEXMoUMhcyZFzgaXvpVOWhUyMCgm"
				+ "Q9Ljl0tQl1lDJV2gAMnbydT3cRlRE2cGxwDeQ&osid=1&service=mail");
		
		ch.manage().window().maximize();
		ff.manage().window().minimize();
		System.out.println(ch.getTitle());
		System.out.println(ff.getCurrentUrl());
		ff.close();
		
	}

}
