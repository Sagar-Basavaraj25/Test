package flipkartE2E;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchBrowserAndApplication {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // Launch Browser (Chrome)
		driver.get("https://www.flipkart.com/"); // URL - Flipkart
		
		String act_Title = driver.getTitle();
		System.out.println(act_Title);
		if (act_Title.contains("Online Shopping Site for")) {
			System.out.println("Title Validated");
		}
		
		driver.quit();
	

	}

}
