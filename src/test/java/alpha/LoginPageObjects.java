package alpha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


		By username=By.cssSelector("#login1");
		By password=By.cssSelector("#password");
		By signin=By.name("proceed");
		By forgot=By.linkText("Forgot Password?");		

		public WebElement ForgotPasswor()
		{
			return driver.findElement(forgot);
		}
		
	
	public WebElement Username()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}

}
