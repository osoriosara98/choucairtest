package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastStepFormPage extends PageObject {

    public static final Target PASSWORD_TEXT = Target
            .the("Text that receives the password")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD_TEXT = Target
            .the("Text that receives the password's confirmation")
            .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED_SELECTOR = Target
            .the("Selector that allows to select stay informed option")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target ACCEPTANCE_SELECTOR = Target
            .the("Selector that allows to select acceptance option")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY_SELECTOR = Target
            .the("Selector that allows to accept the privacy policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON = Target
            .the("button that allows us to submit the information")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));

}
