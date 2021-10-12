package step_definitions;

import common.WebAPI;
import home.AetnaHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;


public class LoginStepDefinition extends WebAPI {

AetnaHomePage aetnaHomePage= new AetnaHomePage();

    @Given("i am at the Aetna home page")
    public void i_am_at_the_Aetna_home_page() throws IOException {
       aetnaHomePage.openBrowerToAetna();
    }
    @When("i click on login button")
    public void i_click_on_login_button() throws IOException {
      aetnaHomePage.clickOnLoginButton();
    }

    @Then("i should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() throws IOException, InterruptedException {
        aetnaHomePage.validateTitle();
    }



}
