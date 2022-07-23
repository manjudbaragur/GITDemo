package alpha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPOF {
	
	//By email=By.name("txtlogin");
	//By next=By.name("next");
	WebDriver driver;
	
	
	public ForgotPasswordPOF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="next")
	public
	WebElement next;
	
	@FindBy(name="txtlogin")
	public
	WebElement email;
	

}
