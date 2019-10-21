package co.com.test.tasks;

import co.com.test.userinterface.AgregarProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

/**
 * Created by Candado on 16/10/2019.
 */
public class AgregarProducto implements Task {

    private AgregarProductoPage agregarProductoPage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AgregarProductoPage.ELEGIR_PRODUCTO));
        actor.attemptsTo(Click.on(AgregarProductoPage.BOTON_AGREGAR_AL_CARRITO));



    }

    public static AgregarProducto Producto(String producto) {
        return Tasks.instrumented(AgregarProducto.class, producto);
    }
}
