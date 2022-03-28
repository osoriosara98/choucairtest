package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.LocationFormPage;

public class LocationForm implements Task {
    private LocationFormPage locationFormPage;
    private String city;
    private String zipCode;
    private String country;

    public LocationForm(String city, String zipCode, String country) {
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }


    public static LocationForm fillOutLocationForm(String city, String zipCode, String country) {
        return Tasks.instrumented(LocationForm.class, city, zipCode, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(locationFormPage.CITY_TEXT),
                Hit.the(Keys.ARROW_DOWN).keyIn(locationFormPage.CITY_TEXT),
                Hit.the(Keys.ENTER).keyIn(locationFormPage.CITY_TEXT),
                Enter.theValue(zipCode).into(locationFormPage.ZIP_CODE_TEXT),
                Click.on(locationFormPage.NEXT_DEVICES_BUTTON));


    }
}