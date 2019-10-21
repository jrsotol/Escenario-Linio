package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by Candado on 16/10/2019.
 */
public class AgregarProductoPage {

    public static final Target ELEGIR_PRODUCTO = Target.the("Se elige el producto deseado").located(By.xpath("//span[@class='title-section']"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("El botón para agregar el articulo solicitado al carrito de compras").located(By.xpath("//button[@class='btn btn-lg hidden-sm-down btn-primary']"));
    public static final Target MENSAJE_EXITOSO = Target.the("Mensaje de que el producto ha sido agregado exitosamente").located(By.xpath("//span[@class='added-product']"));
}
