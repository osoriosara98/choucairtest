package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;


public class StepDefinition {
    @Managed
    WebDriver driver;
    Actor sara = Actor.named("Sara");
    String aleatoryEmail;

    @Given("^than Sara wants to sign in on Utest.com page.$")
    public void thanSaraWantsToSigninOnUtestComPage() {
        sara.can(BrowseTheWeb.with(driver));
        sara.wasAbleTo(OpenUp.thePage());
    }

    @When("Sara fills out about you from fields (.*), (.*), (.*), (.*), (.*), (.*),(.*).$")
    public void saraFillsOutAboutYouFormFields(String firstName, String lastName, String email, String birthMonth,
                                               String birthDay, String birthYear, String language) {
        aleatoryEmail = util.Util.createAleatoryEmail(email);
        sara.attemptsTo(AboutYouForm.fillOutAboutYouForm(firstName, lastName, aleatoryEmail, birthMonth,
                birthDay, birthYear, language));
    }

    @When("Sara fills out location form fields (.*), (.*), (.*).$")
    public void saraFillsOutLocationFormFields(String city, String zipCode, String country) {
        sara.attemptsTo(LocationForm.fillOutLocationForm(city, zipCode, country));
    }

    @When("Sara fills out devices form fields (.*), (.*), (.*), (.*), (.*), (.*).$")
    public void saraFillsOutDevicesFormFields(String yourComputers, String version, String languages,
                                              String mobileDevices, String model, String operatingSystem) {
        sara.attemptsTo(DevicesForm.fillOutDevicesForm(yourComputers, version, languages, mobileDevices,
                model, operatingSystem));
    }

    @When("Sara fills out last step form fields (.*), (.*).$")
    public void saraFillsOutLastStepFields(String password, String confirmPassword) {
        sara.attemptsTo(LastStepForm.fillOutLastStepForm(password, confirmPassword));
    }

    @When("Sara sign in the uTest page (.*).$")
    public void saraSignInTheUTestPage(String password) {
        sara.wasAbleTo(OpenLogIn.openPage());
        sara.wasAbleTo(SignInForm.fillOutSignInForm(aleatoryEmail, password));
    }


    @Then("^Sara had sign in successfully.$")
    public void SaraHadSignInSuccessfully() {
        sara.should(seeThat("The desplay", Confirmation.confirmationText(), containsString("First things first... ")));

    }

}