package co.com.sofka.questions;

import co.com.sofka.utils.PropertiesManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.sofka.pages.saucedemo.CarritoPage.MENSAJE_FINAL;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidarMensajeCheckout implements Question {
    public static ValidarMensajeCheckout obtenerMensaje (){return new ValidarMensajeCheckout();}


    @Override
    public Question<String> answeredBy(Actor actor) {
        int timeout = Integer.parseInt(PropertiesManager.getValue("timeout.long"));
        actor.attemptsTo(
                WaitUntil.the(MENSAJE_FINAL,isVisible()).forNoMoreThan(timeout).seconds()
        );
        return Text.of(MENSAJE_FINAL).asString();
    }
}
