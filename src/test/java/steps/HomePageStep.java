package steps;

import org.openqa.selenium.WebDriver;

import Base.TestBase;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {
	
	private HomePage homepage = new HomePage();
	
	@Given("Open the URL")
	public void open_the_url() {
	   // System.out.println("Opening the URL");
		homepage.openURL();
	}

	@When("User is on Homepage")
	public void user_is_on_homepage() {
		// System.out.println("User landed on the Homepage");
		homepage.verifyHomePageloaded();
	}

	@Then("Get the Title of Page")
	public void get_the_title_of_page() {
		 //System.out.println("Title of the Page");
		homepage.getPageTitle();
	}
	
	@Then("Verify the Bus ticket link is visible.")
	public void verify_the_bus_ticket_link_is_visible() {
	   homepage.isBusLinkVisible();
	}




}
