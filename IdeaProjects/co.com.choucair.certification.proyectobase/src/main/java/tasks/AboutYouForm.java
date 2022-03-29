package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.AboutYouFormPage;

public class AboutYouForm implements Task {
    private AboutYouFormPage aboutYouFormPage;
    private String firstName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String language;


    public AboutYouForm(String firstName, String lastName, String email, String birthMonth, String birthDay,
                        String birthYear, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.language = language;
    }


    public static AboutYouForm fillOutAboutYouForm(String firstName, String lastName, String email, String birthMonth,
                                                   String birthDay, String birthYear, String language) {
        return Tasks.instrumented(AboutYouForm.class, firstName, lastName, email, birthMonth, birthDay, birthYear, language);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firstName).into(aboutYouFormPage.FIRST_NAME_TEXT),
                Enter.theValue(lastName).into(aboutYouFormPage.LAST_NAME_TEXT),
                Enter.theValue(email).into(aboutYouFormPage.EMAIL_ADDRESS_TEXT),
                SelectFromOptions.byVisibleText(birthMonth).from(aboutYouFormPage.DATE_OF_BIRTH_MONTH_SELECTOR),
                SelectFromOptions.byVisibleText(birthDay).from(aboutYouFormPage.DATE_OF_BIRTH_DAY_SELECTOR),
                SelectFromOptions.byVisibleText(birthYear).from(aboutYouFormPage.DATE_OF_BIRTH_YEAR_SELECTOR),
                Enter.theValue(language).into(aboutYouFormPage.LANGUAGES_SELECTOR),
                Hit.the(Keys.ENTER).keyIn(aboutYouFormPage.LANGUAGES_SELECTOR),
                Click.on(aboutYouFormPage.NEXT_LOCATION_BUTTON));
    }
}
