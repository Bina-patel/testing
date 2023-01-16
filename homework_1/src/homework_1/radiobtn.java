package homework_1;

import java.util.concurrent.TimeUnit;

public class radiobtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binap\\eclipse-workspace\\Selenium\\Project_Data\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("www.ebay.com");
        
        List<WebElement> rbtn = driver.findElements(By.name("group1"));
        
        for(WebElement eb:rbtn) 
        {
        	if(eb.isSelected()) {
        		System.out.println(eb.getAttribute("value"));
        	}
        }
	}

}
