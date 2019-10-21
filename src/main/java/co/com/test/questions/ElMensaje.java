package co.com.test.questions;

import co.com.test.userinterface.AgregarProductoPage;
import com.vladsch.flexmark.ext.tables.TablesExtension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 * Created by Candado on 17/10/2019.
 */
public class ElMensaje implements Question<String>{



    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AgregarProductoPage.MENSAJE_EXITOSO).viewedBy(actor).asString();
    }

    public static ElMensaje es() {
        return new ElMensaje();
    }
}
