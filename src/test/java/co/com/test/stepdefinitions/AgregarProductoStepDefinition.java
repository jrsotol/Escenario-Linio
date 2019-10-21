package co.com.test.stepdefinitions;

import co.com.test.questions.ElMensaje;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.AgregarProducto;
import co.com.test.tasks.Buscar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

/**
 *
 */
public class AgregarProductoStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario= Actor.named("Usuario");
    @Before
    public void configuracionInicial(){
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que usuario quiere ingresar a la pagina de Linio Peru$")
    public void queUsuarioQuiereIngresarALaPaginaDeLinioPeru() throws Exception {
        usuario.wasAbleTo(Abrir.LaPaginaDeLinio());

    }


    @Cuando("^el ingrese y agregue un (.*) al carro de compras$")
    public void elIngreseYAgregueUnProductoAlCarroDeCompras(String producto) throws Exception {
        usuario.attemptsTo(Buscar.Producto(producto));
        usuario.attemptsTo(AgregarProducto.Producto(producto));

    }

    @Entonces("^el deberia ver que (.*)$")
    public void elDeberiaVerQueTuProductoSeAgregoAlCarrito(String mensaje) throws Exception {
    usuario.should(GivenWhenThen.seeThat(ElMensaje.es(), Matchers.equalTo(mensaje)));

    }
}
