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
      | idirero  | Ish@cyest#2004 | FR        | Individual | 1993-12-10 | Mr          | Shade      | Mills         | Yes               | 9312109802330 | 9312109802330 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | Joy       | McGregor     | 6812106177332 | 6812106177332  | Sister        | 1       | 1 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | No              | 60201878       | Kzn Agriculture And Rural Development | Yes                 | Miss        | Hazel      | Smith         | Female       | 0412108261899 | Micheal   | Smith        | Male        | 1911218928403 | Yes            |


  Scenario Outline: Family Funeral Dignity Plan
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
      | idirero  | Ish@cyest#2004 | FR        | Family     | 1990-12-06 | Mr          | Shade      | Mills         | Yes               | 9012109147484 | 9012109147484 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | Joy       | McGregor     | 7812108618530 | 7812108618530  | Sister        | 1        | 1 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | No              | 60201878       | Kzn Agriculture And Rural Development | Yes                 | Miss        | Hazel      | Smith         | Female       | 9412105923864 | Micheal   | Smith        | Male        | 1911218928403 | Yes            |



