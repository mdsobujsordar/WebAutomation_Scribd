package test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Base.getDriver();
		
		driver.get("https://www.scribd.com/");
		
		WebElement find_text = driver.findElement(By.className("_2d6Ewv"));
		
		String text = find_text.getText();
		
		
		if(text.equals("Endless entertainment and knowledge")) {
			System.out.println("The test is passed");
			
		}else {
			System.out.println("The test is failed!");
		}
	}

}
