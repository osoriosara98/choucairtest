package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesFormPage extends PageObject {

    public static final Target YOUR_COMPUTER_SELECTOR= Target
            .the("Selector that allows to select the OS")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target YOUR_COMPUTER_INPUT= Target
            .the("Input that allows to enter the OS")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target VERSION_SELECTOR = Target
            .the("Selector that allows to select the OS's version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target VERSION_INPUT = Target
            .the("Selector that allows to select the OS's version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target LANGUAGES_SELECTOR = Target
            .the("Selector that allows to select the OS language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target LANGUAGES_INPUT = Target
            .the("Selector that allows to select the OS language")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target MOBILE_DEVICES_SELECTOR = Target
            .the("Selector that allows to select the device's brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target MOBILE_DEVICES_INPUT = Target
            .the("Selector that allows to select the device's brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target MODEL_SELECTOR = Target
            .the("Selector that allows to select the device's model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));

    public static final Target MODEL_INPUT = Target
            .the("Selector that allows to select the device's model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target OPERATING_SYSTEM_SELECTOR = Target
            .the("Selector that allows to select the OS")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target OPERATING_SYSTEM_INPUT = Target
            .the("Selector that allows to select the OS")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target NEXT_LAST_STEP_BUTTON = Target
            .the("button that shows us the next step's page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
