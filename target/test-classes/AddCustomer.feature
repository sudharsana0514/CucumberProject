#Author: your.email@your.domain.com

Feature:  to test add customer functionality
  

    Scenario:  To test customer id is generated for valid customer
    Given     The user is in add customer page.
    When      The user fills in the valid customer details
          | fname         |  sudharsana            |
          | lname         |  sona                  |
          | email         |  sudharsana@gmail.com  |
          | addr          |  india                 |
          | telephoneno   |  987654321             |]
    
    When      The user clicks the submit button.  
    Then      The user shouid see the customer ID generated.
    

 