package co.com.test.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Created by Candado on 16/10/2019.
 */
public class EsperandoPagina implements Interaction {

    private int esperar;

    protected EsperandoPagina(int esperar) {
        this.esperar = esperar;
    }

    public static EsperandoPagina esperandoPagina(int esperar){
        return instrumented(EsperandoPagina.class, esperar);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(esperar);

    }
}
