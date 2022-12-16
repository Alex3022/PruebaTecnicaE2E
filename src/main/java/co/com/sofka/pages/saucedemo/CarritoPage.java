package co.com.sofka.pages.saucedemo;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class CarritoPage extends PageObject {

    public static final Target BOTON_CHECKOUT = Target
            .the("boton ir cheackout")
            .located(By.id("checkout"));

    public static final Target CAMPO_FIRST_NAME = Target
            .the("campo primer nombre")
            .located(By.id("first-name"));

    public static final Target CAMPO_LAST_NAME = Target
            .the("campo apellido")
            .located(By.id("last-name"));

    public static final Target CAMPO_ZIP_POSTAL_CODE = Target
            .the("campo codigo postal")
            .located(By.id("postal-code"));

    public static final Target BOTON_CONTINUE = Target
            .the("boton continue")
            .located(By.id("continue"));

    public static final Target BOTON_FINISH = Target
            .the("Boton finish")
            .located(By.id("finish"));

    public static final Target MENSAJE_FINAL = Target
            .the("Mensaje final")
            .located(By.xpath("//*[@id=\"checkout_complete_container\"]/h2"));
}
