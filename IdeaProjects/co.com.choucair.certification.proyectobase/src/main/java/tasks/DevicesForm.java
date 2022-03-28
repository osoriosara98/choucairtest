package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
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
        return Tasks.instrumented(DevicesForm.class, yourComputers,version,languages,mobileDevices,model,
                operatingSystem);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
//                Click.on(devicesFormPage.YOUR_COMPUTER_SELECTOR),
//               // Hit.the(Keys.ARROW_DOWN).keyIn(devicesFormPage.YOUR_COMPUTER_SELECTOR),
//                Hit.the(Keys.ENTER).keyIn(devicesFormPage.YOUR_COMPUTER_SELECTOR),
//                Click.on(devicesFormPage.VERSION_SELECTOR),
//                Hit.the(Keys.ARROW_DOWN).keyIn(devicesFormPage.VERSION_SELECTOR),
//                Hit.the(Keys.ENTER).keyIn(devicesFormPage.VERSION_SELECTOR),
// //               Enter.theValue(yourComputers).into(devicesFormPage.YOUR_COMPUTER_SELECTOR),
//                Enter.theValue(version).into(devicesFormPage.VERSION_SELECTOR),
//                Enter.theValue(languages).into(devicesFormPage.LANGUAGES_SELECTOR),
//                Enter.theValue(mobileDevices).into(devicesFormPage.MOBILE_DEVICES_SELECTOR),
//             //   SelectFromOptions.byVisibleText(mobileDevices).from(devicesFormPage.MOBILE_DEVICES_SELECTOR),
//                SelectFromOptions.byVisibleText(model).from(devicesFormPage.MODEL_SELECTOR),
//                SelectFromOptions.byVisibleText(operatingSystem).from(devicesFormPage.OPERATING_SYSTEM_SELECTOR),
                Click.on(devicesFormPage.NEXT_LAST_STEP_BUTTON));


    }
}