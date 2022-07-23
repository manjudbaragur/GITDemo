package MvnPro.MvnJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import alpha.ForgotPasswordPOF;
import alpha.LoginPageObjects;

public class RediffLoginAppTest {
	
@Test
public void login() throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe")	;
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--Incognito");
WebDriver driver=new ChromeDriver(opt);
LoginPageObjects obj=new LoginPageObjects(driver);
ForgotPasswordPOF pof=new ForgotPasswordPOF(driver);

driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

obj.Username().sendKeys("asdf");
obj.Password().sendKeys("asf");
obj.SignIn().click();
obj.ForgotPasswor().click();
Thread.sleep(2000);
pof.email.sendKeys("asdf");
pof.next.click();


}

}
