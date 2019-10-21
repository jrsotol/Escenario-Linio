package co.com.test.tasks;

import co.com.test.userinterface.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Candado on 16/10/2019.
 */


public class Abrir implements Task{

    private LinioHomePage linioHomePage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(linioHomePage));

    }

    public static Abrir LaPaginaDeLinio() {
        return Tasks.instrumented(Abrir.class);
    }
}
