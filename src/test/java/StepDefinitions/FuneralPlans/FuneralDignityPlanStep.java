package StepDefinitions.FuneralPlans;


import PageObject.FuneralPlans.FuneralDignityPlan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class FuneralDignityPlanStep extends PageObject {

    @Steps
    FuneralDignityPlan funeralDignityPlan;


    @Given("User Log in SGUI  website.og in SGUI  Website")
    public void user_log_in_sgui_website_og_in_sgui_website() throws InterruptedException {
        funeralDignityPlan.OpenWebsiteS();
    }

    @When("User Logs in with valid credentials by entering, {string}, {string}")
    public void user_logs_in_with_valid_credentials_by_entering(String Username, String Password) throws InterruptedException {
        funeralDignityPlan.clickArrowButton();
        funeralDignityPlan.PopUpLogin(Username, Password);
        funeralDignityPlan.LoginButton();
        funeralDignityPlan.ClienteleLogo();
        funeralDignityPlan.CaptureSale();
        funeralDignityPlan.LeadBasket();
        funeralDignityPlan.selectNew();
        funeralDignityPlan.LeadCheckBox();
        funeralDignityPlan.ActionSaleButton();

    }

    @Then("User Select cover plan from the drop list, {string}")
    public void user_select_cover_plan_from_the_drop_list(String string) throws InterruptedException {
        Thread.sleep(1000);
        funeralDignityPlan.FuneralIconButton();
        funeralDignityPlan.SelectPlanTextDropdown(string);
        funeralDignityPlan.SelectPlanOkBtn();
    }

    @When("User Select the plan option: Funeral Dignity Plan and Ultimate Dignity plan by selecting, {string}")
    public void user_select_the_plan_option_funeral_dignity_plan_and_ultimate_dignity_plan_by_selecting(String string) throws InterruptedException {
        funeralDignityPlan.GetRatesBtn();
        funeralDignityPlan.SelectPlanOption(string);
    }

    @Then("User select the Date of birth of the main life assured, {string}")
    public void user_select_the_date_of_birth_of_the_main_life_assured(String string) throws InterruptedException {
        funeralDignityPlan.SelectDoB(string);
    }

    @When("User On the slider select the cover amounts that are applicable to the plan chosen")
    public void user_on_the_slider_select_the_cover_amounts_that_are_applicable_to_the_plan_chosen() throws InterruptedException {
        funeralDignityPlan.GetRatesBtn();
        funeralDignityPlan.StartSale();
        funeralDignityPlan.handleModelPopUp();
    }

    @Then("user Add member details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_member_details_by_capturing(String Tittle, String Name, String Surname, String SouthAfricaCitizen, String IDNumber, String string6, String MontlyIncome, String Occupation, String Education, String CellNumber, String PostalAddress, String PostalCode) throws InterruptedException {
        funeralDignityPlan.selectTittleDropdown(Tittle);
        funeralDignityPlan.EnterName(Name );
        funeralDignityPlan.EnterSurname(Surname);
        funeralDignityPlan.selectSACitizen(SouthAfricaCitizen);
        funeralDignityPlan.clickTextBox();
        funeralDignityPlan.enterID(IDNumber);
        funeralDignityPlan.confirmID(string6);
        funeralDignityPlan.clickOKButton();
        funeralDignityPlan.selectMonthlyIncome(MontlyIncome);
        funeralDignityPlan.selectOccupation(Occupation);
        funeralDignityPlan.selectEduction(Education);
        funeralDignityPlan.enterCellNum(CellNumber);
        funeralDignityPlan.enterPostalAddress(PostalAddress);
        funeralDignityPlan.enterPostalCode(PostalCode);
        funeralDignityPlan.clickCopyPhysical();
        funeralDignityPlan.clickValidateBtn();
        funeralDignityPlan.clickSaveMMBtn();


    }

    @When("User add payer details by capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) throws InterruptedException {
        funeralDignityPlan.navigatePayer();
        funeralDignityPlan.selectTittle(string);
        funeralDignityPlan.enterName(string2);
        funeralDignityPlan.enterSurname(string3);
        funeralDignityPlan.fieldTextID();
        funeralDignityPlan.mainIDPopUp(string4);
        funeralDignityPlan.confirmationID(string5);
        funeralDignityPlan.clickOK();
        funeralDignityPlan.PayerRelation(string6);
        funeralDignityPlan.selectDebit(string7);
        funeralDignityPlan.selectDebiDate(string8);
        funeralDignityPlan.selectBank(string9);
        funeralDignityPlan.selectBranch(string10);
        funeralDignityPlan.selectAccType(string11);
        funeralDignityPlan.enterAccNum();
        funeralDignityPlan.enterMainAcc(string12);
        funeralDignityPlan.confirmAccount(string13);
        funeralDignityPlan.OKButton();
        funeralDignityPlan.enterMobiNum(string14);
        funeralDignityPlan.isEmployee(string15);
//        funeralDignityPlan.EmployeeNumber(Employee);
//        funeralDignityPlan.SelectDepartment(Department);
//        funeralDignityPlan.DeductionAuthorised(Deduction);
        funeralDignityPlan.confCheckBoxes();
        funeralDignityPlan.clickSaveBtn();

    }

    @Then("User Add spouse details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        funeralDignityPlan.navigateSpouse();
        funeralDignityPlan.spouseTitle(string);
        funeralDignityPlan.spouseName(string2);
        funeralDignityPlan.spouseSurName(string3);
        funeralDignityPlan.spouseGender(string4);
        funeralDignityPlan.spouseID(string5);
    }

    @When("User Add child details by capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        funeralDignityPlan.navigateChild();
        funeralDignityPlan.clickTab();
        funeralDignityPlan.enterChildName(string);
        funeralDignityPlan.enterChildSurname(string2);
        funeralDignityPlan.selectGender(string3);
        funeralDignityPlan.enterChildID(string4);
        funeralDignityPlan.ChildIsStudent(string5);
    }

    @Then("User Proceed with the Cover and conclude sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        funeralDignityPlan.navigateBeneficiary();
        funeralDignityPlan.addBeneficiary();
        funeralDignityPlan.selectRelation("Member Estate");
        funeralDignityPlan.saveBeneficiary();
        funeralDignityPlan.navigateFICA();
        funeralDignityPlan.navigatePremium();
        funeralDignityPlan.navigateRewards();
        funeralDignityPlan.navigateSummary();
        funeralDignityPlan.debiCheck();
        funeralDignityPlan.summaryTable();
    }
}

