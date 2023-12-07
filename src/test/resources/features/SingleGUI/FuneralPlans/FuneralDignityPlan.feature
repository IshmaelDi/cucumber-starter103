Feature: Funeral Dignity Plan

  Scenario Outline: Individual Funeral Dignity Plan
    Given User Log in SGUI  website.
    When User Logs in with valid credentials by entering, "<Username>", "<Password>"
    Then User Select cover plan from the drop list, "<CoverPlan>"
    When User Select the plan option: Funeral Dignity Plan and Ultimate Dignity plan by selecting, "<PlanOption>"
    Then User select the Date of birth of the main life assured, "<MemberDOB>"
    When User On the slider select the cover amounts that are applicable to the plan chosen
    Then user Add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add payer details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>", "<EmployeeNumber>", "<Department>", "<DeductionAuthorized>"
    Then User Add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When User Add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then User Proceed with the Cover and conclude sale
    Examples:
      | Username | Password       | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress   | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber | Department                            | DeductionAuthorized | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      | ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | idirero  | Ish@cyest#2004 | FR        | Individual | 1978-12-06 | Mr          | Shade      | Mills         | Yes               | 7812067883141 | 7812067883141 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | Joy       | McGregor     | 6812069104224 | 6812069104224  | Sister        | 1        | 15 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | No              | 60201878       | Kzn Agriculture And Rural Development | Yes                 | Miss        | Hazel      | Smith         | Female       | 9812068679579 | Micheal   | Smith        | Male        | 1911218928403 | Yes            |



  Scenario Outline: Family Funeral Dignity Plan -
    Given User Log in SGUI  website.
    When User Logs in with valid credentials by entering, "<Username>", "<Password>"
    Then User Select cover plan from the drop list, "<CoverPlan>"
    When User Select the plan option: Funeral Dignity Plan and Ultimate Dignity plan by selecting, "<PlanOption>"
    Then User select the Date of birth of the main life assured, "<MemberDOB>"
    When User On the slider select the cover amounts that are applicable to the plan chosen
    Then user Add member details by capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add payer details by capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>", "<EmployeeNumber>", "<Department>", "<DeductionAuthorized>"
    Then User Add spouse details by capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When User Add child details by capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then User Proceed with the Cover and conclude sale
    Examples:
      | Username | Password       | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress   | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber | Department                            | DeductionAuthorized | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      | ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | idirero  | Ish@cyest#2004 | FR        | Family | 1980-12-06 | Mr          | Shade      | Mills         | Yes               | 7412069559888 | 7412069559888 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | Joy       | McGregor     | 0312065101015 | 0312065101015  | Sister        | 1        | 15 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | No              | 60201878       | Kzn Agriculture And Rural Development | Yes                 | Miss        | Hazel      | Smith         | Female       | 0112068672511 | Micheal   | Smith        | Male        | 1911218928403 | Yes            |



