package StepDefinitions.FuneralPlans;


import PageObject.FuneralPlans.FuneralDignityPlan;
import PageObject.FuneralPlans.FuneralUltimatePlan;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;


public class FuneralUltimatePlanStep extends PageObject {


    @Steps
    FuneralUltimatePlan funeralUltimatePlan;

    @Given("user Log in SGUI  Website.")
    public void user_log_in_sgui_website() throws InterruptedException {
        funeralUltimatePlan.OpenWebsite();
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
    public void user_select_the_plan_option_funeral_dignity_plan_and_ultimate_dignity_plan_by_selecting(String PlanOption) throws InterruptedException {
        funeralUltimatePlan.GetRatesBtn();
        funeralUltimatePlan.SelectPlanOption(PlanOption);
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
    public void user_add_member_details_by_capturing(String Tittle, String Name, String Surname, String SouthAfricaCitizen, String IDNumber, String string6, String MontlyIncome, String Occupation, String Education, String CellNumber, String PostalAddress, String PostalCode) throws InterruptedException {
        funeralUltimatePlan.selectTittleDropdown(Tittle);
        funeralUltimatePlan.EnterName(Name );
        funeralUltimatePlan.EnterSurname(Surname);
        funeralUltimatePlan.selectSACitizen(SouthAfricaCitizen);
        funeralUltimatePlan.clickTextBox();
        funeralUltimatePlan.enterID(IDNumber);
        funeralUltimatePlan.confirmID(string6);
        funeralUltimatePlan.clickOKButton();
        funeralUltimatePlan.selectMonthlyIncome(MontlyIncome);
        funeralUltimatePlan.selectOccupation(Occupation);
        funeralUltimatePlan.selectEduction(Education);
        funeralUltimatePlan.enterCellNum(CellNumber);
        funeralUltimatePlan.enterPostalAddress(PostalAddress);
        funeralUltimatePlan.enterPostalCode(PostalCode);
        funeralUltimatePlan.clickCopyPhysical();

        funeralUltimatePlan.clickValidateBtn();
        funeralUltimatePlan.clickSaveMMBtn();

    }

    @When("User add payer details by Capturing, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_add_payer_details_by_capturing(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17, String string18) throws InterruptedException {
        funeralUltimatePlan.navigatePayer();
        funeralUltimatePlan.selectTittle(string);
        funeralUltimatePlan.enterName(string2);
        funeralUltimatePlan.enterSurname(string3);
        funeralUltimatePlan.fieldTextID();
        funeralUltimatePlan.mainIDPopUp(string4);
        funeralUltimatePlan.confirmationID(string5);
        funeralUltimatePlan.clickOK();
        funeralUltimatePlan.PayerRelation(string6);
        funeralUltimatePlan.selectDebit(string7);
        funeralUltimatePlan.selectDebiDate(string8);
        funeralUltimatePlan.selectBank(string9);
        funeralUltimatePlan.selectBranch(string10);
        funeralUltimatePlan.selectAccType(string11);
        funeralUltimatePlan.enterAccNum();
        funeralUltimatePlan.enterMainAcc(string12);
        funeralUltimatePlan.confirmAccount(string13);
        funeralUltimatePlan.OKButton();
        funeralUltimatePlan.enterMobiNum(string14);
        funeralUltimatePlan.isEmployee(string15);
//        funeralUltimatePlan.EmployeeNumber(Employee);
//        funeralUltimatePlan.SelectDepartment(Department);
//        funeralUltimatePlan.DeductionAuthorised(Deduction);
        funeralUltimatePlan.confCheckBoxes();
        funeralUltimatePlan.clickSaveBtn();
    }

    @Then("User Add spouse details by Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_spouse_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        funeralUltimatePlan.navigateSpouse();
        funeralUltimatePlan.spouseTitle(string);
        funeralUltimatePlan.spouseName(string2);
        funeralUltimatePlan.spouseSurName(string3);
        funeralUltimatePlan.spouseGender(string4);
        funeralUltimatePlan.spouseID(string5);
    }

    @When("User Add child details by Capturing, {string}, {string}, {string}, {string}, {string}")
    public void user_add_child_details_by_capturing(String string, String string2, String string3, String string4, String string5) throws InterruptedException {
        funeralUltimatePlan.navigateChild();
        funeralUltimatePlan.clickTab();
        funeralUltimatePlan.enterChildName(string);
        funeralUltimatePlan.enterChildSurname(string2);
        funeralUltimatePlan.selectGender(string3);
        funeralUltimatePlan.enterChildID(string4);
        funeralUltimatePlan.ChildIsStudent(string5);
    }

    @Then("User Proceed with the Cover and conclude Sale")
    public void user_proceed_with_the_cover_and_conclude_sale() throws InterruptedException {
        funeralUltimatePlan.navigateBeneficiary();
        funeralUltimatePlan.addBeneficiary();
        funeralUltimatePlan.selectRelation("Member Estate");
        funeralUltimatePlan.saveBeneficiary();
        funeralUltimatePlan.navigateFICA();
        funeralUltimatePlan.navigatePremium();
        funeralUltimatePlan.navigateRewards();
        funeralUltimatePlan.navigateSummary();
        funeralUltimatePlan.debiCheck();
        funeralUltimatePlan.summaryTable();
    }


}
