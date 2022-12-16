package co.com.sofka.tasks.saucedemo;

import co.com.sofka.utils.PropertiesManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.pages.saucedemo.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProductos implements Task {

    public static AgregarProductos agregar() {
        return Tasks.instrumented(AgregarProductos.class);
    }

    public <T extends Actor> void performAs(T actor) {
        int timeout = Integer.parseInt(PropertiesManager.getValue("timeout.long"));
        actor.attemptsTo(
                WaitUntil.the(ADD_CAR_LABSBACKPACK, isVisible()).forNoMoreThan(timeout).seconds(),
                Click.on(ADD_CAR_LABSBACKPACK),
                WaitUntil.the(ADD_CAR_LABSBIKELIGHT, isVisible()).forNoMoreThan(timeout).seconds(),
                Click.on(ADD_CAR_LABSBIKELIGHT),
                Click.on(BOTON_CART)
        );
    }
}
