package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.LastStepFormPage;
import userinterface.UtestMainPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LastStepForm implements Task {
    private LastStepFormPage lastStepFormPage;
    private String password;
    private String confirmPassword;


    public LastStepForm(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public static LastStepForm fillOutLastStepForm(String password, String confirmPassword) {
        return Tasks.instrumented(LastStepForm.class, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(lastStepFormPage.PASSWORD_TEXT),
                Enter.theValue(confirmPassword).into(lastStepFormPage.CONFIRM_PASSWORD_TEXT),
                Click.on(LastStepFormPage.STAY_INFORMED_SELECTOR),
                Click.on(LastStepFormPage.PRIVACY_SELECTOR),
                Click.on(LastStepFormPage.ACCEPTANCE_SELECTOR),
                Click.on(LastStepFormPage.COMPLETE_SETUP_BUTTON),
                WaitUntil.the(UtestMainPage.SIGN_IN_BUTTON, isVisible())
        );
    }
}