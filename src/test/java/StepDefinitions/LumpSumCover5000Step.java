package StepDefinitions;

import PageObjects.FamilyCover.LumpSumCover5000;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class LumpSumCover5000Step extends PageObject {

    @Steps
    LumpSumCover5000 lumpSumCover5000;


    @Given("log into SGUI {string}, {string}")
    public void log_into_sgui(String string, String string2) throws InterruptedException {


        lumpSumCover5000.OpenWebsite();
        lumpSumCover5000.clickOnArrowButton();
        lumpSumCover5000.loginIn("idirero", "Ish@cyest#2003");
        lumpSumCover5000.ClienteleLogo();
        lumpSumCover5000.CaptureSale();
        lumpSumCover5000.LeadBasket();
        lumpSumCover5000.selectNew();
        lumpSumCover5000.LeadCheckBox();
        lumpSumCover5000.ActionSaleButton();

    }
    @When("Family")
    public void family() throws InterruptedException {
        lumpSumCover5000.HelpIconButton();
        lumpSumCover5000.SelectPlanTextDropdown("YF");
        lumpSumCover5000.SelectPlanOkBtn();

    }
    @Then("Enter DOB {string}, {string}")
    public void enter_dob(String DOB, String string2) throws InterruptedException {


        lumpSumCover5000.GetRatesBtn();
        lumpSumCover5000.SelectPlanOption();
        lumpSumCover5000.SelectDoB(DOB);

    }
    @Then("Cover Amount {string}, {string}, {string}, {string}, {string}")
    public void cover_amount(String IDNumber, String IDNumber2, String PayerID, String ConfirmPayerID, String GautengHealth) throws InterruptedException {

        lumpSumCover5000.selectCoverAmountR5000();
        lumpSumCover5000.ViewRates();
        lumpSumCover5000.StartSale();
        lumpSumCover5000.handleModelPopUp();

        //Main Member details

        lumpSumCover5000.selectTittleDropdown("Mr");
        lumpSumCover5000.EnterName("Shade");
        lumpSumCover5000.EnterSurname("Mills");
        lumpSumCover5000.selectSACitizen("Yes");
        lumpSumCover5000.clickTextBox();
        lumpSumCover5000.enterID(IDNumber);
        lumpSumCover5000.confirmID(IDNumber2);
        lumpSumCover5000.clickOKButton();
        lumpSumCover5000.EnterDoB("2022-06-03");
        lumpSumCover5000.selectMonthlyIncome("Up to 3,000");
        lumpSumCover5000.selectOccupation("Sales and services");
        lumpSumCover5000.selectEduction("Matric");
        lumpSumCover5000.enterCellNum("0601234231");
        lumpSumCover5000.enterPostalAddress("Plot 30 ward 55 ");
        lumpSumCover5000.enterPostalCode("1234");
        lumpSumCover5000.clickCopyPhysical();
        lumpSumCover5000.clickValidateBtn();
        lumpSumCover5000.clickSaveMMBtn();

        //Payer Details

        lumpSumCover5000.navigatePayer();
        lumpSumCover5000.selectTittle("Miss");
        lumpSumCover5000.enterName("Joy");
        lumpSumCover5000.enterSurname("McGregor");
        lumpSumCover5000.fieldTextID();
        lumpSumCover5000.mainIDPopUp(PayerID);
        lumpSumCover5000.confirmationID(ConfirmPayerID);
        lumpSumCover5000.clickOK();
        lumpSumCover5000.PayerRelation("Sister");
        lumpSumCover5000.selectDebit("1");
        lumpSumCover5000.selectDebiDate("01 Dec 2023");
        lumpSumCover5000.selectBank("CAPITEC BANK LTD");
        lumpSumCover5000.selectBranch("470010");
        lumpSumCover5000.selectAccType("Savings Account");
        lumpSumCover5000.enterAccNum();
        lumpSumCover5000.enterMainAcc("1234");
        lumpSumCover5000.confirmAccount("1234");
        lumpSumCover5000.OKButton();
        lumpSumCover5000.enterMobiNum("0601234230");
        lumpSumCover5000.isEmployee("Yes");
        lumpSumCover5000.EmployeeNumber("28977556");
        lumpSumCover5000.Department(GautengHealth);
        lumpSumCover5000.DeductionAuthorised("Yes");
        lumpSumCover5000.confCheckBoxes();
        lumpSumCover5000.clickSaveBtn();

        // Spouse Details
        lumpSumCover5000.SpouseNavigation();

        lumpSumCover5000.SpouseTitle("Mr");

        lumpSumCover5000.SpouseName("Kabelo");
        lumpSumCover5000.SpouseSurname("Direro");
        lumpSumCover5000.SelectSpouseGender("Female");
        lumpSumCover5000.SpouseIDNumber("8705076328083");
        lumpSumCover5000.SaveSpouse();
        lumpSumCover5000.AddChild();
        lumpSumCover5000.EnterChildName("Lobby");
        lumpSumCover5000.selectBranch("Seekers");
        lumpSumCover5000.childGenderXpath("Female");
        lumpSumCover5000.ChildIDNumber("8705076328083");
        lumpSumCover5000.ChildIsStudent("Yes");
        lumpSumCover5000.SAVEChild();

    }
    @Then("Complete Sales")
    public void complete_sales() throws InterruptedException {

        lumpSumCover5000.navigateBeneficiary();
        lumpSumCover5000.addBeneficiary();
        lumpSumCover5000.selectRelation("Member Estate");
        lumpSumCover5000.saveBeneficiary();
        lumpSumCover5000.navigateFICA();
        lumpSumCover5000.navigatePremium();
        lumpSumCover5000.navigateRewards();
        lumpSumCover5000.navigateSummary();
        lumpSumCover5000.debiCheck();
        lumpSumCover5000.summaryTable();
    }
}