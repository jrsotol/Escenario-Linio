package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Candado on 16/10/2019.
 */
@DefaultUrl("https://www.linio.com.pe/")
public class LinioHomePage extends PageObject{

    public static final Target CASILLA_BUSCADOR_PRODUCTO = Target.the("Casilla para buscar el producto").located(By.xpath("//input[@class='form-control']"));
    public static final Target BOTON_BUSCAR =  Target.the("Botón para buscar el producto elegido").located(By.xpath("//button[@class='btn btn-primary btn-search']"));
}


