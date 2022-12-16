package co.com.sofka.pages.saucedemo;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject {

    public static final Target ADD_CAR_LABSBACKPACK= Target.the("añadir producto 1").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADD_CAR_LABSBIKELIGHT = Target.the("añadir prodycto 2").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BOTON_CART= Target.the("boton ir carrito").located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

}