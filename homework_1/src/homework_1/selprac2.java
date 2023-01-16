package homework_1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class selprac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		WebElement email,password,login;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("write browser");
		
		String bw = myObj.nextLine();
		System.out.println("browser is:");
		
		Switch(bw)
		{
			case "firefox":
				System.setProperty("webdriver.gcko.driver","");
				driver = new FirefoxDriver();
				break;
			case "chrome":
				System.setProperty("webdriver.chrome.driver","");
				driver = new ChromeDriver();
				break;
				
				}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		WebDriverWait wait  = new WebDriver(driver,10);
		
		email = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.VisibilityOfElementLocated(By.id("email"))).sendKeys("testEmail");
		email.sendKeys("testEmail");
		
		password = driver.findElement(By.id("pass"));
		password.sendKeys("testPassword");
		
		login = driver.findElement(By.name("login"));
		login.click();
		
		Thread.sleep(0);
		
		if(driver.getCurrentUrl().contains("login"))
			System.out.println("pass");
		else
			
	}

}
