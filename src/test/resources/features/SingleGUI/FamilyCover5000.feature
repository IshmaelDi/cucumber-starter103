Feature: H.E.L.P Family Cover

  # Test contains 4 runs with different ages for confirming rates

  Background:
    Given user log in SGUI  Website


  Scenario Outline: User capture Family sale for lump sum cover of R5000 for age 12
    When user log in with valid credentials by entering, "<Username>", "<Password>"
    Then user select plan cover on dropdown text list, "<CoverPlan>"
    When user Select the plan option:Member and family by selecting, "<PlanOption>"
    Then User Select the Date of birth of the main life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen
    Then user add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add payer details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>", "<EmployeeNumber>", "<Department>", "<DeductionAuthorized>"
    Then user add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When user add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then User proceed with the Cover and conclude sale


    Examples:
      | Username | Password       | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress   | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber | Department                            | DeductionAuthorized | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      | ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | idirero  | Ish@cyest#2003 | YF        | Family     | 2013-12-21 | Mr          | Shade      | Mills         | Yes               | 8311210513290 | 8311210513290 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | Joy       | McGregor     | 0111210450479 | 0111210450479  | Sister        | 1        | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | No             | 60201878       | Kzn Agriculture And Rural Development | Yes                 | Miss        | Hazel      | Smith         | Female       | 1711211090775 | Micheal   | Smith        | Male        | 1406030809188 | Yes            |


  Scenario Outline: User capture Family sale for lump sum cover of R5000 for age 20

    When user log in with valid credentials by entering, "<Username>", "<Password>"
    Then user select plan cover on dropdown text list, "<CoverPlan>"
    When user Select the plan option:Member and family by selecting, "<PlanOption>"
    Then User Select the Date of birth of the main life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen
    Then user add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When user add payer details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>", "<EmployeeNumber>", "<Department>", "<DeductionAuthorized>"
    Then user add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When user add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then User proceed with the Cover and conclude sale


    Examples:
      | Username | Password       | CoverPlan | PlanOption | MemberDOB    | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress   | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber | Department                   | DeductionAuthorized | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      | ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | idirero  | Ish@cyest#2003 | YF        | Family     | 2014-11-21 | Mr          | Shade      | Mills         | Yes               | 1411211254493 | 1411211254493 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | Joy       | McGregor     | 7811212963303 | 7811212963303  | Sister        | 1        | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | No             | 60201878       | South African Police Service | Yes                 | Miss        | Hazel      | Smith         | Female       | 1711211090775 | Micheal   | Smith        | Male        | 1406030809188 | Yes            |












