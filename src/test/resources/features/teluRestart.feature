Feature: The User needs restart Telular from de company

 @coco
  Scenario Outline: the client restart Telular
    Given the user is in the Telular page <ip>
    When the  user login in the web site using user and password
    And  the user search restart button and click them
    Then the user verify the process of restart its ok

    Examples:
    |ip                                       |
    |http://admin:Rosales191*@192.168.200.248/|
