package co.com.test.tasks;

import co.com.test.userinterface.LinioHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

/**
 * Created by Candado on 16/10/2019.
 */
public class Buscar implements Task{

    private String producto;


    public Buscar(String producto) {
        this.producto = producto;
    }

    @Override

    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(producto).into(LinioHomePage.CASILLA_BUSCADOR_PRODUCTO));
        actor.attemptsTo(Click.on(LinioHomePage.BOTON_BUSCAR));

    }

    public static Buscar Producto(String producto) {
        return Tasks.instrumented(Buscar.class, producto);
    }
}
