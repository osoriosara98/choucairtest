package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.TextContent;
import userinterface.ConfirmationPage;

public class Confirmation implements Task {
    private static ConfirmationPage confirmationPage;

    public static Confirmation ConfirmationTest() {
        return Tasks.instrumented(Confirmation.class);
    }

    public static Question<String> confirmationText() {
        return actor -> TextContent.of(confirmationPage.CONFIRMATION_TEXT).viewedBy(actor).asString();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}