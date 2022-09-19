package Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {

	//@Test()
	public void AA()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sunil.d.kumar.gupta\\Documents\\Sunil\\Tools\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.youtube.com");
		driver.close();
	}
	@Test()
	public void AB()
	{
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch); 
		
		System.out.println(s);

	}

}
