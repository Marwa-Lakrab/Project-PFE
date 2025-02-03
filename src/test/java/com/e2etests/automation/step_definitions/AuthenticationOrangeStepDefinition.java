package com.e2etests.automation.step_definitions;

//import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationOrangePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationOrangeStepDefinition {

	private ConfigFileReader configfilereader;
	private AuthenticationOrangePage authenticationOrangePage;

	public AuthenticationOrangeStepDefinition() {
		this.configfilereader = new ConfigFileReader();
		this.authenticationOrangePage = new AuthenticationOrangePage();
	}

	@Given("Je me connecte a l application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		Setup.getDriver().get(configfilereader.getProperties("orangehrm.url"));
	}

	@When("Je saisis le nom d utilisateur {string}")
	public void jeSaisisLeNomDUtilisateur(String uname) {
		authenticationOrangePage.fillName(uname);
	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String pwd) {
		authenticationOrangePage.fillPassword(pwd);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationOrangePage.clickBtnLogin();

	}

	@Then("Je me redirige vers la page Dashbaord")
	public void jeMeRedirigeVersLaPageDashbaord() {
		authenticationOrangePage.checkURLChanged();
	}

	@When("Je clique sur l icone du proprietaire du compte")
	public void jeCliqueSurLIconeDuProprietaireDuCompte() {
		authenticationOrangePage.clickIconeCompte();
	}

	@When("Je clique sur le bouton Logout")
	public void jeCliqueSurLeBoutonLogout() {
		authenticationOrangePage.clickOnLogout();
	}

	@Then("Je me regirige vers la page de connexion")
	public void jeMeRegirigeVersLaPageDeConnexion() {

	}

}
