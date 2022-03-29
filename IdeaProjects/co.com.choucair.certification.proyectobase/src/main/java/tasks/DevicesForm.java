package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.DevicesFormPage;

public class DevicesForm implements Task {
    private DevicesFormPage devicesFormPage;
    private String yourComputers;
    private String version;
    private String languages;
    private String mobileDevices;
    private String model;
    private String operatingSystem;

    public DevicesForm(String yourComputers, String version, String languages,
                       String mobileDevices, String model, String operatingSystem) {
        this.yourComputers = yourComputers;
        this.version = version;
        this.languages = languages;
        this.mobileDevices = mobileDevices;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public static DevicesForm fillOutDevicesForm(String yourComputers, String version, String languages,
                                                 String mobileDevices, String model, String operatingSystem) {
        return Tasks.instrumented(DevicesForm.class, yourComputers, version, languages, mobileDevices, model,
                operatingSystem);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(devicesFormPage.YOUR_COMPUTER_SELECTOR),
                Enter.theValue(yourComputers).into(devicesFormPage.YOUR_COMPUTER_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.YOUR_COMPUTER_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.VERSION_SELECTOR),
                Click.on(devicesFormPage.VERSION_SELECTOR),
                Enter.theValue(version).into(devicesFormPage.VERSION_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.VERSION_INPUT),
                Click.on(devicesFormPage.LANGUAGES_SELECTOR),
                Enter.theValue(languages).into(devicesFormPage.LANGUAGES_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.LANGUAGES_INPUT),
                Click.on(devicesFormPage.MOBILE_DEVICES_SELECTOR),
                Enter.theValue(mobileDevices).into(devicesFormPage.MOBILE_DEVICES_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.MOBILE_DEVICES_INPUT),
                Click.on(devicesFormPage.MODEL_SELECTOR),
                Enter.theValue(model).into(devicesFormPage.MODEL_INPUT),
                Hit.the(Keys.ARROW_DOWN).keyIn(devicesFormPage.MODEL_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.MODEL_INPUT),
                Click.on(devicesFormPage.OPERATING_SYSTEM_SELECTOR),
                Enter.theValue(operatingSystem).into(devicesFormPage.OPERATING_SYSTEM_INPUT),
                Hit.the(Keys.ENTER).keyIn(devicesFormPage.OPERATING_SYSTEM_INPUT),
                Click.on(devicesFormPage.NEXT_LAST_STEP_BUTTON));


    }
}