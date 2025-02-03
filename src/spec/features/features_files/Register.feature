Feature: Je remplie le formulaire d inscription
  En tant que utilistateur je veux remplir le fomulaire d inscription de site Mercury

  @registre
  Scenario: Je remplie le formulaire d inscription
    Given Je me connecte sur l application Mercury
    When Je clique sur le lien registre
    And Je saisis le firstName "Marwa"
    And Je saisis le lastName "Lakrab"
    And Je saisis le phone "26336963"
    And Je saisis le userName "marwalak@gmail.com"
    And Je saisis l address1 "21 rue mourouj "
    And Je saisis le city "mourouj"
    And Je saisis le state "ben arous"
    And Je saisis la postalCode "2074"
    And Je choisie le country "TUNISIA"
    And Je saisis l email "marwalak@gmail.com"
    And Je saisis le password "test123"
    And Je saisis le confirmPassword "test123"
    And Je clique sur le bouton envoyer
    Then Je me redirigee vers la page de confirmation de mon inscritption et un message de succes s affiche  "Note: Your user name is marwalak@gmail.com."
