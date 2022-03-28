package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationFormPage extends PageObject {


    public static final Target CITY_TEXT = Target
            .the("Selector that allows to select the city")
            .located(By.id("city"));

    public static final Target ZIP_CODE_TEXT = Target
            .the("Text that receives the zip code")
            .located(By.id("zip"));

    public static final Target COUNTRY_SELECTOR = Target
            .the("Selector that allows to select the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target NEXT_DEVICES_BUTTON = Target
            .the("button that shows us the devices' page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
}
