package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SignInFormPage;

public class SignInForm implements Task {
    private SignInFormPage signInFormPage;
    private String username;
    private String password;

    public SignInForm(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static SignInForm fillOutSignInForm(String username, String password) {
        return Tasks.instrumented(SignInForm.class, username, password);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(signInFormPage.EMAIL_ADDRESS_TEXT),
                Enter.theValue(password).into(signInFormPage.PASSWORD_TEXT),
                Click.on(signInFormPage.SIGN_IN_BUTTON));
    }
}