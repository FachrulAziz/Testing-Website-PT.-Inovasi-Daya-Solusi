Feature: Bulk Upload
#  Scenario: Input valid username dan password
#    Given User enter url IDS
#    When User enter valid username
#    And User enter valid password
#    And User click button login
#    Then User get text title page dashboard

  Scenario: Menambahkan data Bulk
    When User clik menu SetorKu
    And User clik Collapse Bulk Upload
    And User clik button add manual
    And User input nama penginput
    And User click button tambah
    Then User get text valid data
    And User click ok confir

Scenario: Menambahkan data Bulk tanpa input nama
  When User clik menu SetorKu
  And User clik Collapse Bulk Upload
  And User clik button add manual
  And Nama penginput tidak di isi
  And User click button tambah
  Then User get text invalid data
  And User click ok confir
  And User click close