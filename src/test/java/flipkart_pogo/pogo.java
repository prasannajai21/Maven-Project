package flipkart_pogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pogo {
	
	public pogo() {
	}
		@FindBy(xpath="//a[text()='Login']")
		 private WebElement loginbtn;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
		private WebElement email;

		public WebElement getLoginbtn() {
			return loginbtn;
		}

		public WebElement getEmail() {
			return email;
		}
	

}
