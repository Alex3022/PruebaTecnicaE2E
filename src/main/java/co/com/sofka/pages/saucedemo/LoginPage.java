package co.com.sofka.pages.saucedemo;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final Target INPUT_USER = Target.the("Campo usuario").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the(" campo contraseña").located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("boton login").located(By.id("login-button"));

}
