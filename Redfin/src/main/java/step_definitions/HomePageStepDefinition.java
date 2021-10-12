package step_definitions;

import common.WebAPI;
import home.AetnaHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HomePageStepDefinition extends WebAPI {
AetnaHomePage aetnaHomePage=new AetnaHomePage();
    @Given("i am at the home page of aetna")
    public void i_am_at_the_home_page_of_aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }
    @When("i click on search button")
    public void i_click_on_search_button() {
    aetnaHomePage.validateSearch();
    }
    @Then("i should be able to enter and search")
    public void i_should_be_able_to_enter_and_search() {
     aetnaHomePage.doSearch();
    }
    @Given("i am at the same home page of aetna")
    public void i_am_at_the_same_home_page_of_aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }
    @When("i click on search field")
    public void i_click_on_search_field() {
        aetnaHomePage.validateSearch();
    }
    @Then("i should be able to search {string}")//"(I^"]*)"
    public void i_should_be_able_to_search(String ele) throws InterruptedException {
        aetnaHomePage.doSearchList(ele);
    }
    @Given("user is at home page of aetna")
    public void user_is_at_home_page_of_aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to aetna apps")
    public void user_scrolls_down_to_aetna_apps() throws InterruptedException {
        aetnaHomePage.scrollDownToAetnaApps();
    }

//    @And("user clicks on it")
//    public void user_clicks_on_it() {
//        aetnaHomePage.clickOnFindMedCoverage();
//    }

    @Then("user should be redirected to aetna apps page")
    public void user_should_be_redirected_to_aetna_apps_page() throws InterruptedException {
        aetnaHomePage.validateAetnaAppsTitle();
    }
    @Given("user is at home page of Aetna")
    public void user_is_at_home_page_of_Aetna() throws IOException {
     aetnaHomePage.openBrowerToAetna();
    }
    @When("user scrolls down to Faqs")
    public void user_scrolls_down_to_faqs() throws InterruptedException {
       aetnaHomePage.scrollDownToFaqs();
    }
    @Then("user should be redirected to Faqs page")
    public void user_should_be_redirected_to_Faqs_page() throws InterruptedException {
      aetnaHomePage.validateFaqsTitle();
    }
    @Given("user is at home Page of Aetna")
    public void user_is_at_home_Page_of_Aetna() throws IOException {
       aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to glossary")
    public void user_scrolls_down_to_glossary() throws InterruptedException {
     aetnaHomePage.scrollDownToGlossary();
    }

    @Then("user should be redirected to glossary page")
    public void user_should_be_redirected_to_glossary_page() throws InterruptedException {
        aetnaHomePage.validateGlossaryTitle();
    }
    @Given("user is at Home Page of Aetna")
    public void user_is_at_Home_Page_of_Aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to accessibility serrvice")
    public void user_scrolls_down_to_accessibility_serrvice() throws InterruptedException {
       aetnaHomePage.scrollDowntoAccessibilityservice();
    }

    @Then("user should be redirected to accessibility service  page")
    public void user_should_be_redirected_to_accessibility_service_page() throws InterruptedException {
       aetnaHomePage.validateAccessibilityServiceTitle();
    }
    @Given("user is At Home Page of Aetna")
    public void user_is_At_Home_Page_of_Aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to plan disclosure")
    public void user_scrolls_down_to_plan_disclosure() {
    aetnaHomePage.scrollDownToPlanDisclosure();
    }

    @Then("user should be redirected to plan disclosure  page")
    public void user_should_be_redirected_to_plan_disclosure_page() throws InterruptedException {
        aetnaHomePage.validatePlanDisclosureTitle();
    }
    @Given("user is AT Home Page of Aetna")
    public void user_is_AT_Home_Page_of_Aetna() throws IOException {
   aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to program provision")
    public void user_scrolls_down_to_program_provision() throws InterruptedException {
        aetnaHomePage.scrollDownToProgramProvision();
    }

    @Then("user should be redirected to program provision  page")
    public void user_should_be_redirected_to_program_provision_page() throws InterruptedException {
       aetnaHomePage.validateProgramProvisionTitle();
    }
    @Given("user is AT Home Page Of Aetna")
    public void user_is_AT_Home_Page_Of_Aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to state directory")
    public void user_scrolls_down_to_state_directory() throws InterruptedException {
       aetnaHomePage.scrollDownToStateDirectory();
    }

    @Then("user should be redirected to state directory  page")
    public void user_should_be_redirected_to_state_directory_page() throws InterruptedException {
       aetnaHomePage.validateStateDirectoryTitle();
    }
    @Given("user is AT Home Page OF Aetna")
    public void user_is_AT_Home_Page_OF_Aetna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }
    @When("user scrolls down to grieve Forms")
    public void user_scrolls_down_to_grieve_Forms() throws InterruptedException {
     aetnaHomePage.scrollDownToGrieveForms();
    }
    @Then("user should be redirected to grieve Forms  page")
    public void user_should_be_redirected_to_grieve_Forms_page() throws InterruptedException {
      aetnaHomePage.validateGrieveFormsTitle();
    }
    @Given("user is AT Home Page OF AEtna")
    public void user_is_AT_Home_Page_OF_AEtna() throws IOException {
       aetnaHomePage.openBrowerToAetna();
    }
    @When("user scrolls down to Health Care Reform")
    public void user_scrolls_down_to_Health_Care_Reform() throws InterruptedException {
        aetnaHomePage.scrollDownToHealthReform();
    }
    @Then("user should be redirected to Health Care Reform  page")
    public void user_should_be_redirected_to_Health_Care_Reform_page() throws InterruptedException {
        aetnaHomePage.validateHealthCareReformTitle();
    }
    @Given("user is AT Home Page OF AETna")
    public void user_is_AT_Home_Page_OF_AETna() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to News And Analysis")
    public void user_scrolls_down_to_News_And_Analysis() throws InterruptedException {
        aetnaHomePage.scrollDownToNewsAndAnalysis();
    }

    @Then("user should be redirected to News And Analysis  page")
    public void user_should_be_redirected_to_News_And_Analysis_page() throws InterruptedException {
        aetnaHomePage.validateNewsAndAnalysisTitle();
    }
    @Given("user is AT Home Page OF AETNa")
    public void user_is_AT_Home_Page_OF_AETNa() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to investor Info")
    public void user_scrolls_down_to_investor_Info() throws InterruptedException {
     aetnaHomePage.scrollDownToInvestorInfo();
    }

    @Then("user should be redirected to investor Info  page")
    public void user_should_be_redirected_to_investor_Info_page() {
       aetnaHomePage.validateInvestorInfoTitle();
    }
    @Given("user is AT Home Page OF AETNA")
    public void user_is_AT_Home_Page_OF_AETNA() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to site map")
    public void user_scrolls_down_to_site_map() throws InterruptedException {
        aetnaHomePage.scrollDowntoSiteMap();
    }

    @Then("user should be redirected to site map  page")
    public void user_should_be_redirected_to_site_map_page() {
       aetnaHomePage.validateSiteMapTitle();
    }
    @Given("user Is AT Home Page OF AETNA")
    public void user_Is_AT_Home_Page_OF_AETNA() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to terms of use")
    public void user_scrolls_down_to_terms_of_use() throws InterruptedException {
        aetnaHomePage.scrollDOwnToTermsOfUse();
    }

    @Then("user should be redirected to terms of use  page")
    public void user_should_be_redirected_to_terms_of_use_page() {
        aetnaHomePage.validateTermsOfUseTitle();
    }
    @Given("user IS AT Home Page OF AETNA")
    public void user_IS_AT_Home_Page_OF_AETNA() throws IOException {
        aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to legal notices")
    public void user_scrolls_down_to_legal_notices() throws InterruptedException {
      aetnaHomePage.scrollDownToLegalNotices();
    }

    @Then("user should be redirected to legal notices  page")
    public void user_should_be_redirected_to_legal_notices_page() {
        aetnaHomePage.validateLegalNoticesTitle();
    }
    @Given("user IS AT Home PAge OF AETNA")
    public void user_IS_AT_Home_PAge_OF_AETNA() throws IOException {
       aetnaHomePage.openBrowerToAetna();
    }

    @When("user scrolls down to privacy center")
    public void user_scrolls_down_to_privacy_center() throws InterruptedException {
        aetnaHomePage.scrollDownToPrivacyCenter();
    }

    @Then("user should be redirected to privacy center  page")
    public void user_should_be_redirected_to_privacy_center_page() {
        aetnaHomePage.validatePrivacyCenterTitle();
    }





}
