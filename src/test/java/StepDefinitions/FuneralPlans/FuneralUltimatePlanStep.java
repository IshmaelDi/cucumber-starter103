package StepDefinitions.FuneralPlans;


import PageObject.FuneralPlans.FuneralDignityPlan;
import PageObject.FuneralPlans.FuneralUltimatePlan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;


public class FuneralUltimatePlanStep extends PageObject{


    @Steps
    FuneralUltimatePlan funeralUltimatePlan;


    @Given("user Log in SGUI  Website.")
    public void user_log_in_sgui_website() throws InterruptedException {
        funeralUltimatePlan.OpenWebsiteS();

    }
    @When("User Logs in with valid credentials by Entering, {string}, {string}")
    public void user_logs_in_with_valid_credentials_by_entering(String Username, String Password) throws InterruptedException {
        funeralUltimatePlan.clickArrowButton();
        funeralUltimatePlan.PopUpLogin(Username, Password);
        funeralUltimatePlan.LoginButton();
        funeralUltimatePlan.ClienteleLogo();
        funeralUltimatePlan.CaptureSale();
        funeralUltimatePlan.LeadBasket();
        funeralUltimatePlan.selectNew();
        funeralUltimatePlan.LeadCheckBox();
        funeralUltimatePlan.ActionSaleButton();

    }
    @Then("User Select cover plan from the drop List, {string}")
    public void user_select_cover_plan_from_the_drop_list(String string) throws InterruptedException {
        Thread.sleep(5000);
        funeralUltimatePlan.FuneralIconButton();
        funeralUltimatePlan.SelectPlanTextDropdown(string);
        funeralUltimatePlan.SelectPlanOkBtn();
    }
    @When("User Select the plan option: Funeral Dignity Plan and Ultimate Dignity plan by Selecting, {string}")
    public void user_select_the_plan_option_funeral_dignity_plan_and_ultimate_dignity_plan_by_selecting(String string) throws InterruptedException {
        funeralUltimatePlan.GetRatesBtn();
        funeralUltimatePlan.SelectPlanOption(string);
    }
    @Then("User select the Date of birth of the main life Assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        funeralUltimatePlan.SelectDoB(string);
    }
    @When("User On the slider select the cover amounts that are applicable to the plan Chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        funeralUltimatePlan.GetRatesBtn();
        funeralUltimatePlan.StartSale();
        funeralUltimatePlan.handleModelPopUp();
    }
    @Then("user Add member details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User add payer details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User Add spouse details by Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User Add child details by Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User Proceed with the Cover and conclude Sale")
    public void user_proceed_with_the_cover_and_conclude_sale() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
