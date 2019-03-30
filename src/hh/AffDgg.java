package hh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AffDgg {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\doc\\code\\hh\\driver\\chromedriver.exe");
	
	
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
}
}
