Feature: Member Cover for All Ages

  Scenario Outline: Family cover for all Age Bands
    Given log into SGUI '<username>', '<password>'
    When Family
    Then Enter DOB '<MainDOB>', '<SpouseDOB>'
    And Cover Amount '<MainMemberID>', '<ConfirmMainMemberID>'
    Then Complete Sales

    #    MainMember Age = 3
    #    MainMember Age = 18
    #    MainMember Age = 30
    #    MainMember Age = 40
    #    MainMember Age = 50
    #    MainMember Age = 60


    Examples:
      | username               | password       | MainDOB    | SpouseDOB  | MainMemberID  | ConfirmMainMemberID |
      | idirero@clientel.co.za | Ish@cyest#2003 | 2020-12-12 | 2003-12-12 | 2012129859230 | 2012129859230       |
      | idirero@clientel.co.za | Ish@cyest#2003 | 2005-12-12 | 2003-12-12 | 0512125547798 | 0512125547798       |
      | idirero@clientel.co.za | Ish@cyest#2003 | 1993-12-12 | 2003-12-12 | 9312125880153 | 9312125880153       |
      | idirero@clientel.co.za | Ish@cyest#2003 | 1983-12-12 | 2003-12-12 | 8312128799997 | 8312128799997       |
      | idirero@clientel.co.za | Ish@cyest#2003 | 1973-12-12 | 2003-12-12 | 7312126384181 | 7312126384181       |
      | idirero@clientel.co.za | Ish@cyest#2003 | 1963-12-12 | 2003-12-12 | 6312127062944 | 20121298596312127062944230       |

