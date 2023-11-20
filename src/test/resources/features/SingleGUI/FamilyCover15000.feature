Feature:Clientele accident plus health event life plan Functionality

  Background:
    Given user Log in SGUI  website.

  Scenario Outline: User capture Family sale for lump sum cover of R15000 for different age
    When User log in with valid Credentials by entering, "<Username>", "<Password>"
    Then User select Plan cover on dropdown text list, "<CoverPlan>"
    When User Select the Plan option:Member and family by selecting, "<PlanOption>"
    Then User Select the Date of birth of the main Life assured, "<MemberDOB>"
    When User on the slider select the cover amounts that are applicable to the plan chosen..
    Then User add member details by Capturing, "<MemberTitle>", "<MemberName>", "<MemberSurname>", "<MemberCitizenShip>", "<MemberID>", "<ConfirmID>", "<MonthlyIncome>", "<Occupation>", "<Education>", "<CellNumber>", "<PostalAddress>", "<PostalCode>"
    When User add payer details by Capturing, "<PayerTitle>", "<PayerName>", "<PayerSurname>", "<PayerID>", "<ConfirmPayerID>", "<PayerRelation>", "<DebitDay>", "<DebitDate>", "<BankName>", "<BranchCode>", "<AccountType>", "<AccountNumber>", "<ConfirmAccount>", "<MobileNumber>", "<IsPayerEmployee>","<EmployeeNumber>","<Department>","<Authorised>"
    Then User add spouse details by Capturing, "<SpouseTitle>", "<SpouseName>", "<SpouseSurname>", "<SpouseGender>", "<SpouseID>"
    When User add child details by Capturing, "<ChildName>", "<ChildSurname>", "<ChildGender>", "<ChildID>", "<IsChildStudent>"
    Then user proceed with the Cover and conclude sale..


    Examples:
      | Username   | Password    | CoverPlan | PlanOption | MemberDOB  | MemberTitle | MemberName | MemberSurname | MemberCitizenShip | MemberID      | ConfirmID     | MonthlyIncome | Occupation         | Education | CellNumber | PostalAddress   | PostalCode | PayerTitle | PayerName | PayerSurname | PayerID       | ConfirmPayerID | PayerRelation | DebitDay | DebitDate   | BankName         | BranchCode | AccountType     | AccountNumber | ConfirmAccount | MobileNumber | IsPayerEmployee | EmployeeNumber | Department           | Authorised | SpouseTitle | SpouseName | SpouseSurname | SpouseGender | SpouseID      | ChildName | ChildSurname | ChildGender | ChildID       | IsChildStudent |
      | Spadayachy | Marvel_2023 | YG        | Family     | 2016-11-19 | Mr          | Shade      | Mills         | Yes               | 0211196458593 | 0211196458593 | Up to 3,000   | Sales and services | Matric    | 0601234231 | Plot 30 ward 55 | 1234       | Miss       | M P       | Khumalo      | 8412315615087 | 8412315615087  | Sister        | 1        | 01 Dec 2023 | CAPITEC BANK LTD | 470010     | Savings Account | 1234          | 1234           | 0601234230   | Yes             | 84752807       | Mpumalanga Education | Yes        | Miss        | Hazel      | Smith         | Female       | 0211196366630 | Micheal   | Smith        | Male        | 1406030809188 | Yes            |