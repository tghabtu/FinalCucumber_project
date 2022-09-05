package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ExamBase;
import pages.TestPage;

public class Exam_StepDefinition extends ExamBase {

	TestPage testpage;

	@Before
	public void beforeachmethod() {
		initDriver();

		testpage = PageFactory.initElements(driver, TestPage.class);
	}

	@Given("^background color change in the provided url page$")
	public void background_color_change_in_the_provided_url_page() {
	}

	@When("^Set skyBlue Background button exists$")
	public void set_skyBlue_Background_button_exists() {

	}
	@When("^I click on the button$")
	public void i_click_on_the_button() {
		testpage.changeBackground();
	}
	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
	}
	@When("^Set sky white Background button exists$")
	public void set_sky_white_Background_button_exists() {
		testpage.changeBackground();
	}
	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {

	}
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
		driver.quit();
}
}

