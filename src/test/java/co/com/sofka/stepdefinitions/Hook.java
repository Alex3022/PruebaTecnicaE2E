package co.com.sofka.stepdefinitions;

import co.com.sofka.tasks.AbrirSite;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.sofka.utils.Constants.getApplicationUrl;

public class Hook {

    public static Actor actor;

    @Managed(driver = "chrome")
    public static WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());

    }
    @Dado("El {string} abre el sitio de {string}")
    public void elAbreElSitioDe(String actorScenario, String application) {
        actor = Actor.named(actorScenario);
        actor.can(BrowseTheWeb.with(driver));
        actor.attemptsTo(AbrirSite.abrir(getApplicationUrl(application)));
    }

}
