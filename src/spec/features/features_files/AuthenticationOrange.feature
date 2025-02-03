Feature: Connexion et deconnexion de l application OrangeHRm
  En tant que utilisateur je veux me connecter puis me deconnecter de l application OrangeHRM

  Background:
    Given Je me connecte a l application OrangeHRM
    When Je saisis le nom d utilisateur "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur le bouton Login
    
  @login
  Scenario: Connexion a l application OrangeHRM
    Then Je me redirige vers la page Dashbaord
   

  @logout
  Scenario: Deconnexion de l application OrangeHRM
    And Je clique sur l icone du proprietaire du compte
    And Je clique sur le bouton Logout
    Then Je me regirige vers la page de connexion
