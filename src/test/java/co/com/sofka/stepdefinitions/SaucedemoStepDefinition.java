package co.com.sofka.stepdefinitions;

import co.com.sofka.questions.ValidarMensajeCheckout;
import co.com.sofka.tasks.saucedemo.AgregarProductos;
import co.com.sofka.tasks.saucedemo.HacerCheckout;
import co.com.sofka.tasks.saucedemo.LoguearUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import java.util.Objects;

import static co.com.sofka.stepdefinitions.Hook.actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class SaucedemoStepDefinition {

    @Dado("que se registra en la pagina con usuario y contrasena")
    public void queSeRegistraEnLaPaginaConUsuarioYContrasena() {
        actor.attemptsTo(
                LoguearUsuario.logIn()
        );
    }
    @Cuando("añade dos productos al carrito y revisa el carrito para completar su compra")
    public void añadeDosProductosAlCarrito() {
        actor.attemptsTo(
                AgregarProductos.agregar()
        );
    }

     @Cuando("realiza el checkout y finaliza")
    public void realizaElCheckoutYFinaliza() {
        actor.attemptsTo(
                HacerCheckout.hacer()
        );

    }
    @Entonces("recibe un mensaje de {string}")
    public void recibeUnMensajeDe(String string) {
        actor.should(
                seeThat(ValidarMensajeCheckout.obtenerMensaje().answeredBy(actor), equalTo(string))
        );

    }

}
