package co.com.sofka.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirSite implements Task {

    private static String url;

    public static AbrirSite abrir(String application) {
        url = application;
        return Tasks.instrumented(AbrirSite.class);
    }

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}
