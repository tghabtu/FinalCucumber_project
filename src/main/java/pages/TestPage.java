package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPage {
	
	WebDriver driver;
	
	public TestPage(WebDriver drive) {
		this.driver= drive; 
		
	}
		@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionSky()']")WebElement SKY_BLUE_ELEMENT;
		@FindBy(how = How.XPATH, using = "//button[@onclick='myFunctionWhite()']") WebElement White_Background_ELEMENT;
		
		public  void changeBackground() {
			SKY_BLUE_ELEMENT.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				  e.printStackTrace();
				  }
			White_Background_ELEMENT.click();
		 
				
			}
		}
	


