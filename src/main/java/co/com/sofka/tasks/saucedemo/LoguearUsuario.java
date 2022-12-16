package co.com.sofka.tasks.saucedemo;

import co.com.sofka.utils.PropertiesManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.pages.saucedemo.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoguearUsuario implements Task {

    public static LoguearUsuario logIn() {
        return Tasks.instrumented(LoguearUsuario.class);
    }

    public <T extends Actor> void performAs(T actor) {
        int timeout = Integer.parseInt(PropertiesManager.getValue("timeout.long"));
        actor.attemptsTo(
                WaitUntil.the(INPUT_USER, isVisible()).forNoMoreThan(timeout).seconds(),
                Enter.theValue("standard_user").into(INPUT_USER),
                WaitUntil.the(INPUT_PASSWORD, isVisible()).forNoMoreThan(timeout).seconds(),
                Enter.theValue("secret_sauce").into(INPUT_PASSWORD),
                Click.on(BOTON_LOGIN)
        );
    }
}