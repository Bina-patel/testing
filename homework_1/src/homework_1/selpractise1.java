package homework_1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class selpractise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		WebElement email,password,login;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter browser");
		
		String browser = myObj.nextLine();
		System.out.println(browser);
		
		
		
		switch(browser) {
		case "firefox":
		System.setProperty("WebDriver.gecko.driver","");
		driver = new FirefoxDriver();
		break;
		
		case "chrome":
		System.setProperty("WebDriver.firefox.driver","");
		driver = new ChromeDriver();
		break;
	}
			//browser properties
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

}
