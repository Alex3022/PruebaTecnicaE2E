package co.com.sofka.tasks.saucedemo;

import co.com.sofka.utils.PropertiesManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.sound.midi.Instrument;

import static co.com.sofka.pages.saucedemo.CarritoPage.*;
import static co.com.sofka.pages.saucedemo.HomePage.*;
import static co.com.sofka.pages.saucedemo.LoginPage.INPUT_USER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HacerCheckout implements Task {

    public static HacerCheckout hacer () { return Tasks.instrumented(HacerCheckout.class);

    }

    public <T extends Actor> void performAs(T actor) {
        int timeout = Integer.parseInt(PropertiesManager.getValue("timeout.long"));
        actor.attemptsTo(
                WaitUntil.the(BOTON_CHECKOUT, isVisible()).forNoMoreThan(timeout).seconds(),
                Click.on(BOTON_CHECKOUT),
                WaitUntil.the(CAMPO_FIRST_NAME, isVisible()).forNoMoreThan(timeout).seconds(),
                Enter.theValue("camila").into(CAMPO_FIRST_NAME),
                WaitUntil.the(CAMPO_LAST_NAME, isVisible()).forNoMoreThan(timeout).seconds(),
                Enter.theValue("jaramillo").into(CAMPO_LAST_NAME),
                WaitUntil.the(CAMPO_ZIP_POSTAL_CODE, isVisible()).forNoMoreThan(timeout).seconds(),
                Enter.theValue("000100105").into(CAMPO_ZIP_POSTAL_CODE),
                WaitUntil.the(BOTON_CONTINUE, isVisible()).forNoMoreThan(timeout).seconds(),
                Click.on(BOTON_CONTINUE),
                WaitUntil.the(BOTON_FINISH, isVisible()).forNoMoreThan(timeout).seconds(),
                Click.on(BOTON_FINISH)

        );
    }
}
