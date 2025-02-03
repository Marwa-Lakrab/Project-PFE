package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthentictationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentictationStepDefinition {

	private AuthentictationPage authentictationpage;

	public AuthentictationStepDefinition() {
		this.authentictationpage = new AuthentictationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authentictationpage.goToURL();
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String name) {
		authentictationpage.fillUserName(name);
	}

	@When("Je saisis le password {string}")
	public void jeSaisisLePassword(String passWord) {
		authentictationpage.fillPassword(passWord);
	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authentictationpage.clickSubmitButton();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {

		String message = authentictationpage.WelcomeMessage.getText();
		Assert.assertEquals(message, text);
	}

}
