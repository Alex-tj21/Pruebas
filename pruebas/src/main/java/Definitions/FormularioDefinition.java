package Definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import pages.GeneralPage;

public class FormularioDefinition {
    GeneralPage generalPage= new GeneralPage();


    @Cuando("Se diligencie el formulario {string} {string} {string}")
    public void se_diligencie_el_formulario(String string, String string2, String string3) {
                 generalPage.getCurrentUrl();
    }
    @Entonces("se valida que sea exitoso")
    public void se_valida_que_sea_exitoso() {

    }
}
