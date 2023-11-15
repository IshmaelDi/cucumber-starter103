package PageObjects.FamilyCover;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LumpSumCover5000 extends PageObject {
    String Url = "https://shambawebtest.clientele.co.za/shambaweb/login";

    String ClienteleLogoXpath = "//img[@class=\"logo-menu\"]";

    String CaptureSaleXpath = "//*[@id=\"navbarSupportedContent\"]/div/ul/li/div[2]/div[1]/div/a/span";

    String LeadBasketXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/sale-ribbon/div/div/div/div/div/nav/div[1]/a/div/i";

    String LeadBasketFilterXpath = "(//input[@id='LeasdsBasketFilter'])[2]";

    String leadCheckBox = "(//input[@id='undefined'])[1]";

    String ActionSaleBtn = "(//i[@class='bi bi-cash-coin'])[1]";




    String HELPProductXpath = "//img[@src='assets/Help.png']";

    String PlanTypeDropdown = "//select[@formcontrolname=\"plan\" ]";

    String SelectPlanOkBtn = "//button[@class=\"btn btn-success\"]";





    String GetRatesBtn = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String PlanOptionXpath = "//select[@formcontrolname=\"planOption\"]";




    String MainLifeDoB = "//input[@type='text']";

    String SpouseDOBXpath = "(//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary'])[2]";
    String SpouseInputDOBXpath = "(//input[@class='input-control ng-pristine ng-valid ng-touched'])[1]";





    String SliderBarXpath = "//span[@class='ngx-slider-span ngx-slider-bar-wrapper ngx-slider-full-bar']";

    String ViewRates = "//span[@class='title']";

    String StartSale = "//*[@id=\"bootstrap-table\"]/tbody/tr/td[9]/button[1]/span/i";

    String FAISXpath = "//button[normalize-space()='Continue']";

    String MainMemberTittleXpath = "//select[@id='Title']";

    String MainMemberNameXpath = "//input[@id='FirstNames']";

    String MainMemberSurnameXpath = "//input[@id='Surname']";

    String MainMemberSACitizenXpath = "//select[@id='IsSouthAfricanCitizen']";

    String MainMemberIDNumberXpath = "//input[@id='IdentityNumber']";

    String MainMemberMainInputID ="//input[@id='mainInput']";

    String MainMemberConfirmID = "//input[@id='confirmationInput']";

    String MainMemberOKButton = "//span[normalize-space()='Ok']";


    // Spouse Element

    String DoBXpath = "//input[@id='DateOfBirth']";

    String MainMemberMonthlyIncomeXpath = "//select[@id='MonthlyIncomeRange']";

    String MainMemberOccupationXpath = "//select[@id='Occupation']";

    String MainMemberEducationXpath = "//select[@id='EducationLevel']";

    String MainMemberCellNumberXpath = "//input[@id='MobileTelephoneNumber']";

    String MainMemberPostalAddressXpath = "//*[@id=\"PostalAddressLine1\"]";

    String MainMemberPostalCodeXpath = "//input[@id='PostalAddressCode']";

    String MainMemberCopyPhysicalXpath = "//*[@id=\"ngb-nav-0-panel\"]/div[1]/div/div/button";

    String MainMemberValidateBtnXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[1]/div/form/div/div[2]/div[5]/div/shamba-address/div/div[2]/div[3]/div/button/span";

    String SaveMainMemberXpath = "//*[@id=\"pills-tabContent\"]/member/div/div[2]/div/div[2]/button";




    // Payer Details Elements

    String PayerXpath ="/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[2]/div[2]";

    String PayerTittleXpath = "//select[@id='Title']";

    String PayerNameXpath = "//input[@id='FirstNames']";

    String PayerSurnameXpath = "//input[@id='Surname']";

    String PayerIDXpath = "//input[@id='IdentityNumber']";

    String PayerDetailsMainIDXpath = "//input[@id='mainInput']";

    String PayerDetailsConfirmIDXpath = "//input[@id='confirmationInput']";

    String PayerDetailsOKPopUpXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";

    String PayerRelationXpath = "//select[@id='RelationToMember']";

    String PayerDebitXpath = "//select[@id='DebitDay']";

    String PayerDetailsFirstDebitXpath = "//select[@id='FirstDebitDate']";

    String PayerDetailsBankNameXpath = "//select[@id='BankName']";

    String PayerDetailsBranchCodeXpath = "//select[@id='BankBranchCode']";

    String PayerDetailsAcctTypeXpath = "//select[@id='BankAccountType']";

    String PayerDetailsBankAccNumXpath = "//input[@id='BankAccountNumber']";

    String PayerDetailsAccountXpath = "//input[@id='mainInput']";

    String PayerDetailsConfAccXpath = "//input[@id='confirmationInput']";

    String PayerDetailsOKButtonXpath = "//div[@class='cdk-global-overlay-wrapper']//div[2]//button[1]";


    String PayerDetailsMobileNumXpath = "//input[@id='MobileTelephoneNumber']";

    String ConfirmCheckBoxXpath = "(//input[@type='checkbox'])[1]";

    String CheckBox1Xpath = "(//input[@type='checkbox'])[2]";

    String SavePayerXpath = "//button[@class='btn btn-success']";



    // Government Details

    String EmpStatusXpath = "//select[@id='IsEmployee']";
    String EmployeeNumberXpath = "(//input[@id='EmployeeNumber'])[1]";
    String DepartmentXpath = "(//select[@id='Department'])[1]";
    String DeductionAuthorisedXpath = "(//select[@id='Authorised'])[1]";




    String AddChildXpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";
    String ChildXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[4]/div[2]";

    String BeneficiaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[5]/div[2]";

    String AddBenXpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base mat-primary']";

    String RelationXpath = "//select[@id='Relation']";

    String SaveBenXpath = "//span[normalize-space()='Save Beneficiary']";

    String FICAXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[6]/div[2]";

    String PremiumXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[7]/div[2]";

    String RewardsXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[8]/div[2]";

    String SummaryXpath = "/html/body/shamba-root/shamba-layout/div/div[2]/sale/div/div[2]/div/app-sale-capture/div/div/div/div/div[2]/sale-capture-control/div/div[1]/div/ul/li[9]/div[2]";

    String ConfirmDebiCheckXpath = "//input[@type='checkbox'][1]";

    String SummaryTableXpath = "//table[@id='bootstrap-table']";


    // Spouse Logic

    String SpouseTitleXpath  = "//*[@id=\"Title\"]";

    String SpouseNamesXpath  = "//*[@id=\"FirstNames\"]";

    String SpouseSurnamesXpath  = "//*[@id=\"Surname\"]";

    String SpouseGenderXpath  = "//*[@id=\"Gender\"]";

    String SpouseIDNumbersXpath = "//*[@id=\"IdentityNumber\"]";

    String SaveSpouseXpath = "//button[@class='btn btn-success']";


    String MobileNumXpath = "//input[@id='MobileTelephoneNumber']";



    // Child Logic and elements

    String AddChildBtnXpath = "//span[@class='title']";

    String childNameXpath = "//input[@id=\"FirstNames\"]";

    String childSurNameXpath = "//input[@id=\"Surname\"]";

    String childGenderXpath = "//select[@id=\"Gender\"]";

    String childIDnumberXpath = "//*[@id=\"IdentityNumber\"]";

    String ChildisStudentXpath = "//select[@id=\"IsStudent\"]";

    String saveChildBtnXpath = "//button[@type='button']";



    // Elements for New Login

    String UserNameXpath = "//input[@placeholder='Username']";
    String PasswordXpath = "//input[@placeholder='Password']";
    String LogButtonXpath = "//button[@type='submit']//span[contains(text(),'Login')]";
    String NavigationButtonXpath = "/html/body/shamba-root/shamba-layout/div/div[1]/shamba-header/div/div/div[2]/shamba-auth/div/nav";






    @Step("Open shamba website")
    public void OpenWebsite() throws InterruptedException {
        getDriver().get(Url);
        getDriver().manage().window().maximize();
        Thread.sleep(3000);
    }
    @Step("Click on Navigation Arrow Button")
    public void clickOnArrowButton(){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(13));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(NavigationButtonXpath))).click();
    }
    @Step("Login in using valid Credentials")
    public void loginIn(String Username, String password) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(13));


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(UserNameXpath))).sendKeys(Username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PasswordXpath))).sendKeys(password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LogButtonXpath))).click();
    }
    @Step("Clicks on ClienteleLogo")
    public void ClienteleLogo() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(ClienteleLogoXpath)).click();
    }
    @Step("Clicks on CaptureSale")
    public void CaptureSale() throws InterruptedException {
        Thread.sleep(5000);
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
        Thread.sleep(5000);
        WebElement startSale = $(By.xpath(ActionSaleBtn));
        if (!startSale.isSelected()) {
            startSale.click();
        }
    }
    @Step("Click on Help Icon Button")
    public void HelpIconButton() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(HELPProductXpath)).click();
    }
    @Step("Click on Select Plan Text Dropdown and select Life Plan")
    public void SelectPlanTextDropdown(String SelectPlan) throws InterruptedException {
        Thread.sleep(5000);
        WebElement dropdown = $(By.xpath(PlanTypeDropdown));
        Select selectObject = new Select(dropdown);
        selectObject.selectByValue(SelectPlan);
    }
    @Step("Click on Ok Button to proceed")
    public void SelectPlanOkBtn() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(SelectPlanOkBtn)).click();
    }
    @Step("Click on Get Rates Button")
    public void GetRatesBtn() throws InterruptedException {
        Thread.sleep(1000);
        $(By.xpath(GetRatesBtn)).click();
    }
    @Step("Click on Plan Option and select Cover")
    public void SelectPlanOption() {
        WebElement dropdown = $(By.xpath(PlanOptionXpath));
        Select selectObject = new Select(dropdown);
        selectObject.selectByVisibleText("Individual");
    }
    @Step("Click on Main life DoB text field and select dates")
    public void SelectDoB(String DOB)throws InterruptedException{
        Thread.sleep(1000);
        WebElement DoB =  $(By.xpath(MainLifeDoB) );
        DoB.click();
        DoB.sendKeys(DOB + Keys.ENTER);
    }

    @Step("Select cover amount of R5000 on the slider bar")
    public void selectCoverAmountR5000()throws InterruptedException{
        Thread.sleep(1000);

        $(By.xpath(SliderBarXpath)).click();

        WebElement sliderPointer = $(By.xpath("//span[@aria-label='ngx-slider'])[1]"));
        sliderPointer.click();
    }

    @Step("Select cover amount of R10000 on the slider bar")
    public void selectCoverAmountR10000()throws InterruptedException{
        Thread.sleep(1000);

        $(By.xpath(SliderBarXpath)).click();

        WebElement sliderPointer = $(By.xpath("//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[2]"));
        sliderPointer.click();
    }
    @Step("Select cover amount of R10000 on the slider bar")
    public void selectCoverAmountR10000()throws InterruptedException{
        Thread.sleep(1000);

        $(By.xpath(SliderBarXpath)).click();

        WebElement sliderPointer = $(By.xpath("//div[@class='ngx-slider-inner-tooltip ng-star-inserted'])[2]"));
        sliderPointer.click();
    }




    @Step("Click on view button to proceed with quotes")
    public void ViewRates()throws InterruptedException {
        Thread.sleep(1000);

        $(By.xpath(ViewRates)).click();
    }

    @Step("Click on Start Sale Button")
    public void StartSale()throws InterruptedException {
        Thread.sleep(1000);

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
        Thread.sleep(1000);

        WebElement dropdown = $(By.xpath(PayerTittleXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Tittle);
    }

    @Step("Enter Name(s) on input field text")
    public void EnterName(String Name){

        WebElement fieldText = $(By.xpath(PayerNameXpath));
        fieldText.click();
        fieldText.sendKeys(Name);

    }

    @Step("Enter Surname on input field text")
    public void EnterSurname(String Surname){
        WebElement fieldText = $(By.xpath(PayerSurnameXpath));
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

    @Step("Enter Date of Birth on input field text")
    public void EnterDoB(String DateOfBirth){
        WebElement fieldText = $(By.xpath(DoBXpath));
        fieldText.click();
        fieldText.sendKeys(DateOfBirth);

    }

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


    // Payer Details Logic

    @Step("Navigate Payer page")
    public void navigatePayer()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(PayerXpath)).click();
    }

    @Step("Select Tittle from dropdown")
    public void selectTittle(String PayerTittle){
        WebElement tittleDropdown = $(By.xpath(PayerTittleXpath));
        Select selectObject = new Select(tittleDropdown);

        selectObject.selectByValue(PayerTittle);

    }

    @Step("Enter Name on field text")
    public void enterName(String PayerName){
        WebElement fieldText = $(By.xpath(PayerNameXpath));
        fieldText.click();
        fieldText.sendKeys(PayerName);

    }

    @Step("Enter Surname on field text")
    public void enterSurname(String PayerSurname){
        WebElement fieldText = $(By.xpath(PayerSurnameXpath));
        fieldText.click();
        fieldText.sendKeys(PayerSurname);

    }

    @Step("Click on Payer ID text field")
    public void fieldTextID(){
        WebElement fieldText = $(By.xpath(PayerIDXpath));
        fieldText.click();
    }

    @Step("Enter ID on MainInput PopUp")
    public void mainIDPopUp(String PayerID){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

        WebElement mainID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MainIDXpath)));
        mainID.click();
        mainID.sendKeys(PayerID);

    }

    @Step("Enter Confirmation of ID on PopUp field text")
    public void confirmationID(String PayerID){
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

        WebElement confirmID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfirmIDXpath)));
        confirmID.click();
        confirmID.sendKeys(PayerID);
    }

    @Step("Click  OK button to capture ID")
    public void clickOK()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(OKPopUpXpath)).click();
    }

    @Step("Select the Relationship from dropdown list")
    public void PayerRelation(String Relationship){
        WebElement dropdown = $(By.xpath(PayerRelationXpath));
        Select selectObject = new  Select(dropdown);

        selectObject.selectByValue(Relationship);
    }

    @Step("Select Debit day from dropdown list")
    public void selectDebit(String DebitDay){
        WebElement dropdown = $(By.xpath(PayerDebitXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(DebitDay);
    }

    @Step("Select Debit date from dropdown list")
    public void selectDebiDate(String DebitDate){
        WebElement dropdown = $(By.xpath(FirstDebitXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(DebitDate);
    }

    @Step("Select Bank Name from dropdown list")
    public void selectBank(String BankName){
        WebElement dropdown = $(By.xpath(BankNameXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BankName);
    }

    @Step("Select Branch Code from dropdown ")
    public void selectBranch(String BranchCode){
        WebElement dropdown = $(By.xpath(BranchCodeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(BranchCode);

    }

    @Step("Select Account Type from dropdown")
    public void selectAccType(String AccountType){
        WebElement dropdown = $(By.xpath(AcctTypeXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(AccountType);

    }

    @Step("Click Account Number on the text field")
    public void enterAccNum(){
        WebElement element = $(By.xpath(BankAccNumXpath));
        element.click();


    }

    @Step("Enter Account Number on Main text field")
    public void enterMainAcc(String AccountNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AccountXpath)));
        mainAcc.click();
        mainAcc.sendKeys(AccountNumber);

    }

    @Step("Enter Confirmation of Account number on the text field")
    public void confirmAccount(String AccountNumber){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        WebElement mainAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ConfAccXpath)));
        mainAcc.click();
        mainAcc.sendKeys(AccountNumber);

    }

    @Step("Click OK button for Account number to be captured on the text field")
    public void OKButton(){
        $(By.xpath(OKButtonXpath)).click();
    }

    @Step("Enter Mobile Number on the text field")
    public void enterMobiNum(String MobileNumber){
        WebElement element = $(By.xpath(MobileNumXpath));
        element.click();
        element.sendKeys(MobileNumber);

    }

    @Step("Select if Payer is employee from dropdown")
    public  void isEmployee(String PayerIsEmployee){
        WebElement dropdown = $(By.xpath(EmpStatusXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(PayerIsEmployee);
    }

    @Step("Enter Employee Number")
    public void EmployeeNumber(){
        $(By.xpath(EmployeeNumberXpath)).sendKeys("84752807");
    }
    @Step("Select Department from DropList")
    public void Department(String GAUTENGHEALTH){
        WebElement D = $(By.xpath(DepartmentXpath));
        Select selectObject = new Select(D);

        selectObject.selectByValue(GAUTENGHEALTH);
    }

    @Step("Select Deduction Authorised from Drop List")
    public void DeductionAuthorised(String Deduction){
        WebElement De = $(By.xpath(DeductionAuthorisedXpath));
        Select selectObject = new Select(De);

        selectObject.selectByValue(Deduction);

    }
    @Step("Select All checkboxes for confirmations of a Payer ")
    public void confCheckBoxes(){
        WebElement checkbox = $(By.xpath(ConfirmCheckBoxXpath));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement checkbox1 = $(By.xpath(CheckBox1Xpath));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

    }

    @Step("Click on Save Payer Button")
    public void clickSaveBtn()throws InterruptedException{
        WebElement button = $(By.xpath(SavePayerXpath));
        button.click();

    }


    @Step("Select the spouse title")
    public void SpouseTitle(String SpouseTitle){
        WebElement St =$(By.xpath(SpouseTitleXpath ));
        selectFromDropdown(St,SpouseTitle);

    }
    @Step("Enter spouse name")
    public void SpouseName(String SpouseName){
        $(By.xpath(NamesXpath)).sendKeys(SpouseName);
    }

    @Step("enter spouse surname")
    public void spouseSurname(String SpouseSurname){
        $(By.xpath(SurnameXpath )).sendKeys(SpouseSurname);
    }



    @Step("select spouse gender")
    public void SelectSpouseGender(String SpouseGender){
        Select product = new Select(getDriver().findElement(By.xpath(GenderXpath )));
        product.selectByValue(SpouseGender);


    }
    @Step("Enter ID number")
    public void SpouseIDNumber(String EnterIDNumber){
        $(By.xpath(IDNumberXpath)).sendKeys(EnterIDNumber);
    }


    @Step("Save Spouse ")
    public  void SaveSpouse() throws InterruptedException {
        Thread.sleep(3000);
        $(By.xpath(SaveSpouse)).click();
    }


    @Step("Enter child name")
    public void EnterChildName(String ChildName) {
        $(By.xpath(childName)).sendKeys(ChildName);


    }

    @Step("Add a child ")
    public void addChild(){
        $(By.xpath(AddChildBtn)).click();
    }

    @Step("Enter a child surname")
    public void childSurname(String childSurName ){
        $(By.xpath(childSurNameXpath)).sendKeys(childSurName);
    }


    @Step("Select gender for a child")
    public void childGen(String ChildGender){
        WebElement Cg = $(By.xpath(childGender));
        selectFromDropdown(Cg,ChildGender);


    }


    @Step( "Enter child ID Number")
    public void ChildIDNumber(String ChildIDNumber){
        $(By.xpath(childIDnumber)).sendKeys(ChildIDNumber);
    }


    @Step("select whether child is a student or not")
    public void ChildIsStudent(String  ChildStudent){
        WebElement Cs = $(By.xpath(ChildisStudent));
        selectFromDropdown(Cs,ChildStudent);


    }

    @Step("Save child details")
    public void SAVEChild() throws InterruptedException {
        Thread.sleep(5000);
        $(By.xpath(saveChildBtn)).click();
    }




    @Step("Navigate to Beneficiary Page")
    public void navigateBeneficiary()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(BeneficiaryXpath)).click();

    }

    @Step("Click on Add Beneficiary button")
    public void addBeneficiary(){

        $(By.xpath(AddBenXpath)).click();

    }

    @Step("Select Member Estate from Relationship dropdown")
    public void selectRelation(String Relationship){
        WebElement dropdown = $(By.xpath(RelationXpath));
        Select selectObject = new Select(dropdown);

        selectObject.selectByValue(Relationship);
    }

    @Step("Click Save Beneficiary Button")
    public void saveBeneficiary()throws InterruptedException {

        $(By.xpath(SaveBenXpath)).click();
        Thread.sleep(5000);

        WebElement PopUp = $(By.xpath("//button[@type='button']"));
        PopUp.click();

    }

    @Step("Navigate to FICA Page")
    public void navigateFICA()throws  InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(FICAXpath)).click();

        WebElement isProminentPublicOfficial = $(By.xpath("//select[@id='IsProminentPublicOfficial']"));
        Select selectObject = new Select(isProminentPublicOfficial);
        selectObject.selectByValue("No");

        WebElement isProminentInternationalPublicOfficial = $(By.xpath("//select[@id='IsProminentInternationalPublicOfficial']"));
        Select selectObject1 = new Select(isProminentInternationalPublicOfficial);
        selectObject1.selectByValue("No");

        $(By.xpath("//span[@class='title']")).click();

    }

    @Step("Navigate to Premium Page")
    public void navigatePremium()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(PremiumXpath)).click();
        WebElement dropdown = $(By.xpath("//select[@id='productConversion']"));
        Select selectObject = new Select(dropdown);
        selectObject.getAllSelectedOptions();

        String targetPointXpath = "//span[@aria-label='ngx-slider']";
        WebElement targetPoint = $(By.xpath(targetPointXpath));
        targetPoint.click();

        WebElement savePremium = $(By.xpath("//span[@class='title']"));
        savePremium.click();

    }

    @Step("Navigate to Rewards Page")
    public void navigateRewards()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(RewardsXpath)).click();

        WebElement checkbox = $(By.xpath("(//input[@type='checkbox'])[1]"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement savePremium = $(By.xpath("//span[@class='title']"));
        savePremium.click();

    }

    @Step("Navigate to Summary Page")
    public void navigateSummary()throws InterruptedException{
        Thread.sleep(5000);

        $(By.xpath(SummaryXpath)).click();


        WebElement checkbox = $(By.xpath("(//input[@type='checkbox'])[1]"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        WebElement checkbox1 = $(By.xpath("(//input[@type='checkbox'])[2]"));

        if (!checkbox1.isSelected()) {
            checkbox1.click();
        }

        WebElement checkbox2 = $(By.xpath("(//input[@type='checkbox'])[3]"));

        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        WebElement checkbox3 = $(By.xpath("(//input[@type='checkbox'])[4]"));

        if (!checkbox3.isSelected()) {
            checkbox3.click();
        }

        WebElement checkbox4 = $(By.xpath("(//input[@type='checkbox'])[5]"));

        if (!checkbox4.isSelected()) {
            checkbox4.click();
        }

        WebElement checkbox5 = $(By.xpath("(//input[@type='checkbox'])[6]"));

        if (!checkbox5.isSelected()) {
            checkbox5.click();
        }

        WebElement concludeSale = $(By.xpath("//button[@type='button']"));
        concludeSale.click();



        WebElement concludePopUp = $(By.xpath("//button[contains(text(),'Conclude Sale')]"));
        concludePopUp.click();



    }

    @Step("Debi-check page")
    public void debiCheck()throws InterruptedException{
        Thread.sleep(4000);


        $(By.xpath(ConfirmDebiCheckXpath)).click();
        Thread.sleep(2000);


        $(By.xpath("//span[@class='title'][1]")).click();





    }

    @Step("View summary table page")
    public void summaryTable()throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));

       WebElement bootstrap = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(SummaryTableXpath)));
        bootstrap.click();

       getDriver().wait(60000);

    }
}
