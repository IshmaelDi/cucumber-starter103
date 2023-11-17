Feature: Member Cover for All Ages

  Scenario Outline: Family cover for all Age Bands
    Given log into SGUI '<username>', '<password>'
    When Family
    Then Enter DOB '<MainDOB>', '<SpouseDOB>'
    And Cover Amount '<MainMemberID>', '<ConfirmMainMemberID>', '<PayerID>', '<ConfirmPayerID>', '<Department>'
    Then Complete Sales

    #    MainMember Age = 3
    #    MainMember Age = 18
    #    MainMember Age = 30
    #    MainMember Age = 40
    #    MainMember Age = 50
    #    MainMember Age = 60


    Examples:
      | username | password       | MainDOB    | SpouseDOB  | MainMemberID  | ConfirmMainMemberID | PayerID       | ConfirmPayerID | Department     |
      | idirero  | Ish@cyest#2003 | 1997-12-21 | 1997-12-12 | 1312167442480 | 1312167442480       | 8412158861384 | 8412158861384  | Gauteng Health |
      | idirero  | Ish@cyest#2003 | 2004-12-21 | 2004-12-12 | 0312168448891 | 0312168448891       | 9812168819513 | 9812168819513  | Gauteng Health |
      | idirero  | Ish@cyest#2003 | 1972-12-21 | 1972-12-12 | 9812168819513 | 9812168819513       | 7612159989271 | 7612159989271  | Gauteng Health |
      | idirero  | Ish@cyest#2003 | 1965-12-21 | 1965-12-12 | 0112167187569 | 0112167187569       | 9512158497086 | 9512158497086  | Gauteng Health |
      | idirero  | Ish@cyest#2003 | 1984-12-21 | 1984-12-12 | 8812167952290 | 8812167952290       | 9712157887044 | 9712157887044  | Gauteng Health |


