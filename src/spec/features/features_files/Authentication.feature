Feature: Je verifier la page d authentification
  En tant que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verifier la page d authentification
    Given Je me connecte sur l application Mercury
    When Je saisis le username "test"
    And Je saisis le password "test"
    And Je clique sur le bouton submit
    Then Je me redirige vers la page home "Login Successfully"