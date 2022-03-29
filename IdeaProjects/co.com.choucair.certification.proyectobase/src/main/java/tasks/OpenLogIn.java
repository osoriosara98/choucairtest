package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestMainPage;

public class OpenLogIn implements Task {
    private UtestMainPage utestMainPage;

    public static OpenLogIn openPage() {
        return Tasks.instrumented(OpenLogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestMainPage));
        actor.attemptsTo(Click.on(UtestMainPage.SIGN_IN_BUTTON));
    }
}
