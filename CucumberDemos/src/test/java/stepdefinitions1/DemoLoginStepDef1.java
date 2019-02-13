package stepdefinitions1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoLoginStepDef1 {
	WebDriver ref;
	@Given("^Opened the browser and passed the application url$")
	public void opened_the_browser_and_passed_the_application_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Sathya\\Drivers\\chromedriver.exe");
		  ref = new ChromeDriver();
		  ref.manage().window().maximize();
		  ref.get("http://newtours.demoaut.com/");
		  Thread.sleep(2000);
	}

	@When("^valid userid and password are entered$")
	public void valid_userid_and_password_are_entered() throws Throwable {
		ref.findElement(By.name("userName")).sendKeys("demo");
		ref.findElement(By.name("password")).sendKeys("demo");
		ref.findElement(By.name("login")).click();

	}

	@Then("^Signout options should be visible in the next page$")
	public void signout_options_should_be_visible_in_the_next_page() throws Throwable {
	
		ref.close();
	}

}
