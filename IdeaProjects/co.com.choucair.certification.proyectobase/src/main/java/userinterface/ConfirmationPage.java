package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {

    public static final Target CONFIRMATION_TEXT = Target
            .the("Text tha show us the confirmation text")
            .located(By.xpath("//*[@id=\"kc-header-wrapper\"]/div/section/div[1]"));
}
