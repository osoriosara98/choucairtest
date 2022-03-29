package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignInFormPage extends PageObject {

    public static final Target EMAIL_ADDRESS_TEXT = Target
            .the("Label to enter the email")
            .located(By.id("username"));

    public static final Target PASSWORD_TEXT = Target
            .the("Label to enter the pass")
            .located(By.id("password"));

    public static final Target SIGN_IN_BUTTON = Target
            .the("Button to sign in")
            .located(By.id("kc-login"));
}
