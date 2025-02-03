Feature: Je rempli le formulaire
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_registre
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When Je clique sur le lien registre
    When Je saisis un data dans le champs firstname "<firstname>"
    When Je saisis un data dans le champs lastname "<lastname>"
    When Je saisis un data dans le champs phone "<phone>"
    When Je saisis un data dans le champs userName "<username>"
    When Je saisis un data dans le champs address1 "<adresse>"
    When Je saisis un data dans le champs city "<city>"
    When Je saisis un data dans le champs state "<state>"
    When Je saisis un data dans le champs postalCode "<codepostal>"
    When Je choisie un data dans le champs country "<country>"
    When Je saisis un data dans le champs email "<email>"
    When Je saisis un data dans le champs password "<password>"
    When Je saisis un data dans le champs confirmPassword "<confirmpassword>"
    When Je clique sur le bouton envoyer
    Then Je me redirigee vers la page de confirmation de mon inscritption et un message de succes s affiche  "<message>"

    Examples: 
      | firstname | lastname   | phone    | username           | adresse | city    | state     | codepostal | country | email              | password | confirmpassword | message                                     |
      | Marwa     | Lakrab     | 26336963 | marwalak@gmail.com | Tunis   | Mourouj | Ben Arous |       2073 | TUNISIA | marwalak@gmail.com | test123  | test123         | Note: Your user name is marwalak@gmail.com. |
      | Refka     | BenHamouda | 25336963 | ref@gmail.com      | France  | Angers  | Paris     |       1033 | FRANCE  | ref@gmail.com      | test369  | test369         | Note: Your user name is ref@gmail.com.      |
