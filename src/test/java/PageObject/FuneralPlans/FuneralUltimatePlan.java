package PageObject.FuneralPlans;

// Imports

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class FuneralUltimatePlan extends PageObject {


    // Web Elements for Funeral Dignity Plan

    String Url = "http://shambawebtest.clientele.local/shambaweb/";


    String ArrowButtonXpath = "//i[@class='bi bi-box-arrow-right profile-icon profile-icon-default']";

    String UserName = "//input[@placeholder='Username']";

    String PassWord = "//input[@placeholder='Password']";

    String LoginXpath = "//button[@type='submit']";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    String LeadBasketFilterXpath = "(//input[@id='LeasdsBasketFilter'])[2]";

    String leadCheckBox = "(//input[@id='undefined'])[1]";

    String ActionSaleBtn = "(//i[@class='bi bi-cash-coin'])[1]";


    // Navigation to New Page

    // Elements for Funeral Logo

    String FuneralPlanLogoXpath = "//img[@src='assets/Funeral.png']";

    String PlanTypeDropdown = "//*[@id=\"mat-dialog-3\"]/app-product-plan/div/div[1]/div/form/div/div/div/div/div/select";

    String PlanTypeXpath = "//select[@formcontrolname=\"plan\" ]";

    String SelectPlanOkBtn = "//button[@class=\"btn btn-success\"]";

    String GetRatesBtn = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";
    String GetRatesButtonXpath = "//span[@class='title']";

    String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";


    String MainLifeDoB = "//input[@type='text']";

    // Elements for Slider

    String SliderBarXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/quote-create/div/div[3]/div/div/div[1]/ngx-slider/span[3]";




    String ViewRates = "//span[@class='title']";

    String StartSale = "//*[@id=\"bootstrap-table\"]/tbody/tr/td[9]/button[1]/span/i";

    String FAISXpath = "//button[normalize-space()='Continue']";

    // Main Elements

    String TittleXpath = "//select[@id='Title']";

    String NameXpath = "//input[@id='FirstNames']";

    String SurnameXpath = "//input[@id='Surname']";

    String SACitizenXpath = "//select[@id='IsSouthAfricanCitizen']";

    String IDNumberXpath = "//input[@id='IdentityNumber']";

    String MainInputID ="//input[@id='mainInput']";

    String ConfirmID = "//input[@id='confirmationInput']";

    String OKButton = "//span[normalize-space()='Ok']";

    String DoBXpath = "//input[@id='DateOfBirth']";

    String MonthlyIncomeXpath = "//select[@id='MonthlyIncomeRange']";

    String OccupationXpath = "//select[@id='Occupation']";

    String EducationXpath = "//select[@id='EducationLevel']";

    String CellNumberXpath = "//input[@id='MobileTelephoneNumber']";

    String PostalAddressXpath = "//*[@id=\"PostalAddressLine1\"]";

    String PostalCodeXpath = "//input[@id='PostalAddressCode']";

    String CopyPhysicalXpath = "//*[@id=\"ngb-nav-0-panel\"]/div[1]/div/div/button";

    String ValidateBtnXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";

    String SaveMainMemberXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";

    String PayerXpath ="/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[2]/div[2]";

    String PayerTittleXpath = "//select[@id='Title']";

    String PayerNameXpath = "//input[@id='FirstNames']";

    String PayerSurnameXpath = "//input[@id='Surname']";

    String PayerIDXpath = "//input[@id='IdentityNumber']";

    String MainIDXpath = "//input[@id='mainInput']";

    String ConfirmIDXpath = "//input[@id='confirmationInput']";

    String OKPopUpXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String PayerRelationXpath = "//select[@id='RelationToMember']";

    String PayerDebitXpath = "//select[@id='DebitDay']";

    String FirstDebitXpath = "//select[@id='FirstDebitDate']";

    String BankNameXpath = "//select[@id='BankName']";

    String BranchCodeXpath = "//select[@id='BankBranchCode']";

    String AcctTypeXpath = "//select[@id='BankAccountType']";

    String BankAccNumXpath = "//input[@id='BankAccountNumber']";

    String AccountXpath = "//input[@id='mainInput']";

    String ConfAccXpath = "//input[@id='confirmationInput']";

    String OKButtonXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String MobileNumXpath = "//input[@id='MobileTelephoneNumber']";

    String EmpStatusXpath = "//select[@id='IsEmployee']";
    String EmployeeNumberXpath = "//input[@id='EmployeeNumber']";
    String DepartmentXpath = "//select[@id='Department']";
    String DeductionAuthosedXpath = "//select[@id='Authorised']";


    String ConfirmCheckBoxXpath = "(//input[@type='checkbox'])[1]";

    String CheckBox1Xpath = "(//input[@type='checkbox'])[2]";

    String SavePayerXpath = "//button[@class='btn btn-success']";

    String SpouseXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[3]/div[2]";

    String ChildXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[4]/div[2]";

    String BeneficiaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";
    String BeneXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/div[1]";

    String AddBenXpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String RelationXpath = "//select[@id='Relation']";

    String SaveBenXpath = "//span[normalize-space()='Save Beneficiary']";

    String FICAXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/div[2]";
    String Fica1Xpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[7]/div[1]";

    String PremiumXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[7]/div[2]";
    String PremXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[1]";


    String RewardsXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[2]";

    String SummaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[9]/div[2]";

    String ConfirmDebiCheckXpath = "//input[@type='checkbox'][1]";

    String SummaryTableXpath = "//table[@id='bootstrap-table']";


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    // Logic for FuneralPan

    @Step("Open shamba website")
    public void OpenWebsiteS() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(1000);

    }
    @Step("Clicks on Arrow-Button to log in")
    public void clickArrowButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ArrowButtonXpath)));
        element.click();
    }
    @Step("Login in using valid Credentials")
    public void PopUpLogin(String Username, String Password) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserName))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PassWord))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PassWord))).sendKeys(Password);
    }
    @Step("Clicks on Login")
    public void LoginButton() throws  InterruptedException{
        $(By.xpath(LoginXpath)).click();
    }
    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(ClienteleLogoXpath)).click();
    }
    @Step("Clicks on CaptureSale")
    public void CaptureSale() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(CaptureSaleXpath)).click();
    }
    @Step("Clicks on LeadBasket")
    public void LeadBasket() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(LeadBasketXpath)).click();

    }

    @Step("Select New on lead basket filter ")
    public void selectNew()throws InterruptedException{
        Thread.sleep(1000);

        $(By.xpath(LeadBasketFilterXpath)).click();
    }

    @Step("Select a lead to action a sale")
    public void LeadCheckBox() throws InterruptedException {
        Thread.sleep(1000);

        WebElement checkbox = $(By.xpath(leadCheckBox));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }


    }

    @Step("Click on Action sale Button")
    public void ActionSaleButton() throws InterruptedException {
        Thread.sleep(1000);

        WebElement startSale = $(By.xpath(ActionSaleBtn));

        if (!startSale.isSelected()) {
            startSale.click();
        }

    }

    @Step("Click on Funral Icon Button")
    public void FuneralIconButton() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(FuneralPlanLogoXpath)).click();
    }

    @Step("Click on Select Plan Text Dropdown and select Life Plan")
    public void SelectPlanTextDropdown(String SelectPlan) throws InterruptedException {
        Thread.sleep(5000);

        WebElement dropdown = $(By.xpath(PlanTypeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(SelectPlan);

    }

    @Step("Click on Ok Button to proceed")
    public void SelectPlanOkBtn() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(SelectPlanOkBtn)).click();

    }

    @Step("Click on Get Rates Button")
    public void GetRatesBtn() throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(GetRatesBtn)).click();
    }


    @Step("Click on Plan Option and select Cover")
    public void SelectPlanOption(String selectPlan) {

        WebElement dropdown = $(By.xpath(PlanOptionXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByVisibleText(selectPlan);


    }

    @Step("Click on Main life DoB text field and select dates")
    public void SelectDoB(String DateOfBirth)throws InterruptedException{
        Thread.sleep(5000);

        WebElement DoB =  $(By.xpath(MainLifeDoB) );

        DoB.click();

        DoB.sendKeys(DateOfBirth + Keys.ENTER);


    }


    // Slider Bar Logic

    @Step("Select cover amount of R30000 on the slider bar")
    public void selectCoverAmount()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(SliderBarXpath)).click();

        WebElement sliderPointer = $(By.xpath("(//span[@aria-label='ngx-slider'])[1]"));
        sliderPointer.click();

    }

    @Step("Click on view button to proceed with quotes")
    public void ViewRates()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(ViewRates)).click();
    }

    @Step("Click on Start Sale Button")
    public void StartSale()throws InterruptedException {
        Thread.sleep(5000);

        $(By.xpath(StartSale)).click();

    }

    @Step("Click continue or cancel button on FAIS Disclosure PopUp Link")
    public void handleModelPopUp(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FAISXpath)));

        element.click();


    }


    @Step("Select Tittle type from dropdown")
    public void selectTittleDropdown(String Tittle)throws InterruptedException{
        Thread.sleep(3000);

        WebElement dropdown = $(By.xpath(TittleXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Tittle);
    }

    @Step("Enter Name(s) on input field text")
    public void EnterName(String Name){

        WebElement fieldText = $(By.xpath(NameXpath));
        fieldText.click();
        fieldText.sendKeys(Name);

    }

    @Step("Enter Surname on input field text")
    public void EnterSurname(String Surname){
        WebElement fieldText = $(By.xpath(SurnameXpath));
        fieldText.click();
        fieldText.sendKeys(Surname);
    }

    @Step("Select South African Citizen dropdown field")
    public void selectSACitizen(String SouthAfricanCitizen){
        WebElement dropdown = $(By.xpath(SACitizenXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(SouthAfricanCitizen);
    }

    @Step("Click on ID text box")
    public void clickTextBox(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        WebElement fieldText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(IDNumberXpath)));
        fieldText.click();



    }

    @Step("Click on ID Number MainInput PopUp ")
    public void enterID(String IDNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement  mainIDPopUP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainInputID)));
        mainIDPopUP.click();
        mainIDPopUP.sendKeys(IDNumber);

    }

    @Step("Click on confirm ID Number PopUp")
    public void confirmID(String IDNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement confirmInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmID)));
        confirmInput.click();
        confirmInput.sendKeys(IDNumber);

    }

    @Step("Click on OKButton")
    public void clickOKButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement OKBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OKButton)));
        OKBtn.click();

    }

    // @Step("Enter Date of Birth on input field text")
    //public void EnterDoB(String DateOfBirth){
    // WebElement fieldText = $(By.xpath(DoBXpath));
    // fieldText.click();
    //fieldText.sendKeys(DateOfBirth);

    //  }

    @Step("Select monthly income from dropdown")
    public void selectMonthlyIncome(String MonthlyIncome){
        WebElement dropdown = $(By.xpath(MonthlyIncomeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(MonthlyIncome);

    }

    @Step("Select Occupation from dropdown")
    public void selectOccupation(String Occupation){
        WebElement dropdown = $(By.xpath(OccupationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Occupation);

    }



    @Step("Select Education from dropdown")
    public void selectEduction(String Education){
        WebElement dropdown = $(By.xpath(EducationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Education);
    }

    @Step("Enter Cell Number on field text ")
    public void enterCellNum(String CellNumber){

        WebElement MobileNum = $(By.xpath(CellNumberXpath));

        MobileNum.click();
        MobileNum.sendKeys(CellNumber);


    }

    @Step("Enter Postal Address on field text")
    public void enterPostalAddress(String PostalAddress){

        WebElement element = $(By.xpath(PostalAddressXpath));

        element.click();
        element.sendKeys(PostalAddress);
    }

    @Step("Enter Postal Code on field text")
    public void enterPostalCode( String PostalCode){

        WebElement element = $(By.xpath(PostalCodeXpath));

        element.click();
        element.sendKeys(PostalCode);

    }

    @Step("Click on Copy to Physical")
    public void clickCopyPhysical(){

        WebElement element = $(By.xpath(CopyPhysicalXpath));

        element.click();
    }

    @Step("Click on Validate button")
    public void clickValidateBtn()throws InterruptedException{
        Thread.sleep(3000);

        WebElement element = $(By.xpath(ValidateBtnXpath));

        element.click();

    }

    @Step("Click on Save Main Member button")
    public void clickSaveMMBtn(){

        WebElement button = $(By.xpath(SaveMainMemberXpath));

        button.click();
    }
}
