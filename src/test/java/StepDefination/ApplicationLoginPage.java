package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@SuppressWarnings("unused")
public class ApplicationLoginPage {

	/*
	 * public void BrowserInt() { System.setProperty("webdriver.chrome.driver",
	 * "C:\\chromedriver_win32\\chromedriver.exe"); }
	 * 
	 * 
	 * //ChromeOptions opt =new ChromeOptions(); //opt.addArguments("--Incognito");
	 * WebDriver driver=new ChromeDriver();
	 */

	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {

		// driver.get("https://novoresume.com/");
		System.out.println("Given");

	}

	@When("^User provides valid credentials (.+) & (.+) and click on login$")
	public void user_provides_valid_credentials_and_click_on_login(String un, String pw) throws Throwable {

		System.out.println(un);
		System.out.println(pw);

	}

	@Then("^Hope page is opened$")
	public void hope_page_is_opened() throws Throwable {
		System.out.println("Then");
	}

	@And("^All the expected details are displayed$")
	public void all_the_expected_details_are_displayed() throws Throwable {
		System.out.println("And");
	}

}
