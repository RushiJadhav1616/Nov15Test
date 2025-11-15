package SDM_DAY_1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Backward {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com/");//taking url
		dr.manage().window().maximize();//it will maximize the browser
		Thread.sleep(3000);//
		dr.get("https://mail.google.com/mail/u/0/?ogbl");
		Thread.sleep(3000);
		dr.navigate().back();//going back to previous tab
		Thread.sleep(3000);
		System.out.println(dr.manage().window().getSize());//printing size of tab
		
		Dimension d = new Dimension(500, 850);// setting the size of window 
		dr.manage().window().setSize(d);
		Thread.sleep(3000);
		System.out.println(dr.manage().window().getSize());
		dr.close();
		

	}

}
