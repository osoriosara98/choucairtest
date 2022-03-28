package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYouFormPage extends PageObject {
    public static final Target FIRST_NAME_TEXT = Target
            .the("Text that receives the first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME_TEXT = Target
            .the("Text that receives the last name")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS_TEXT = Target
            .the("Text that receives the email address")
            .located(By.id("email"));

    public static final Target DATE_OF_BIRTH_MONTH_SELECTOR = Target
            .the("Selector that allows to select the DOB month")
            .located(By.id("birthMonth"));

    public static final Target DATE_OF_BIRTH_DAY_SELECTOR = Target
            .the("Selector that allows to select the DOB  day")
            .located(By.id("birthDay"));

    public static final Target DATE_OF_BIRTH_YEAR_SELECTOR = Target
            .the("Selector that allows to select the DOB year")
            .located(By.id("birthYear"));

    public static final Target LANGUAGES_SELECTOR = Target
            .the("Selector that allows to select the spoken language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input\n"));

    public static final Target NEXT_LOCATION_BUTTON = Target
            .the("button that shows us the location's page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
