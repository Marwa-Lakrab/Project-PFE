package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	
    private RegisterPage registerpage;
     
    public RegisterStepDefinition() {
    	this.registerpage = new RegisterPage();
    }

	@When("Je clique sur le lien registre")
	public void jeCliqueSurLeLienRegistre() {
		registerpage.clickRegistre();
	}
	@When("Je saisis le firstName {string}")
	public void jeSaisisLeFirstName(String firstname) {
		registerpage.fillFirstName(firstname);
	}
	@When("Je saisis un data dans le champs firstname {string}")
	public void jeSaisisUnDataDansLeChampsFirstname(String firstname) {
		registerpage.fillFirstName(firstname);
	}
	@When("Je saisis le lastName {string}")
	public void jeSaisisLeLastName(String lastname) {
		registerpage.fillLastName(lastname);
	}
	@When("Je saisis un data dans le champs lastname {string}")
	public void jeSaisisUnDataDansLeChampsLastname(String lastname) {
		registerpage.fillLastName(lastname);
	}
	@When("Je saisis le phone {string}")
	public void jeSaisisLePhone(String phone) {
		registerpage.fillPhone(phone);
	}
	@When("Je saisis un data dans le champs phone {string}")
	public void jeSaisisUnDataDansLeChampsPhone(String phone) {
		registerpage.fillPhone(phone);
	}
	@When("Je saisis le userName {string}")
	public void jeSaisisLeUserName(String uname) {
		registerpage.fillUserName(uname);
	}
	@When("Je saisis un data dans le champs userName {string}")
	public void jeSaisisUnDataDansLeChampsUserName(String uname) {
		registerpage.fillUserName(uname);
	}
	@When("Je saisis l address1 {string}")
	public void jeSaisisLAddress1(String adresse) {
		registerpage.fillAdresse(adresse);  
	}
	@When("Je saisis un data dans le champs address1 {string}")
	public void jeSaisisUnDataDansLeChampsAddress1(String adresse) {
		registerpage.fillAdresse(adresse);
	}
	@When("Je saisis le city {string}")
	public void jeSaisisLeCity(String city) {
		 registerpage.fillCity(city);
	}
	@When("Je saisis un data dans le champs city {string}")
	public void jeSaisisUnDataDansLeChampsCity(String city) {
		registerpage.fillCity(city);
	}
	@When("Je saisis le state {string}")
	public void jeSaisisLeState(String state) {
		registerpage.fillState(state);
	}
	@When("Je saisis un data dans le champs state {string}")
	public void jeSaisisUnDataDansLeChampsState(String state) {
		registerpage.fillState(state);
	}
	@When("Je saisis la postalCode {string}")
	public void jeSaisisLaPostalCode(String codepostal) {
		registerpage.fillCodePostal(codepostal);
	}
	@When("Je saisis un data dans le champs postalCode {string}")
	public void jeSaisisUnDataDansLeChampsPostalCode(String codepostal) {
		registerpage.fillCodePostal(codepostal);
	}
	@When("Je choisie le country {string}")
	public void jechoisieLeCountry(String country) {
		registerpage.choisieCountry(country);
	}
	@When("Je choisie un data dans le champs country {string}")
	public void jeChoisieUnDataDansLeChampsCountry(String country) {
		registerpage.choisieCountry(country);
	}
	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
		registerpage.fillEmail(email);
	}
	@When("Je saisis un data dans le champs email {string}")
	public void jeSaisisUnDataDansLeChampsEmail(String email) {
		registerpage.fillEmail(email);
	}
	@When("Je saisis le Password {string}")
	public void jeSaisisLePassword(String password) {
		registerpage.fillPassword(password);
	}
	@When("Je saisis un data dans le champs password {string}")
	public void jeSaisisUnDataDansLeChampsPassword(String password) {
		registerpage.fillPassword(password);
	}
	@When("Je saisis le confirmPassword {string}")
	public void jeSaisisLeConfirmPassword(String cpassword) {
		registerpage.fillConfirmPassword(cpassword);
	}
	@When("Je saisis un data dans le champs confirmPassword {string}")
	public void jeSaisisUnDataDansLeChampsConfirmPassword(String cpassword) {
		registerpage.fillConfirmPassword(cpassword);
	}
	@When("Je clique sur le bouton envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		registerpage.ClickSubmitButton();
	}
	@Then("Je me redirigee vers la page de confirmation de mon inscritption et un message de succes s affiche  {string}")
	public void jeMeRedirigeeVersLaPageDeConfirmationDeMonInscritptionEtUnMessageDeSuccesSAffiche(String text) {
	   
		String message = registerpage.successMessage.getText();
		Assert.assertEquals(message, text);
	}

}
