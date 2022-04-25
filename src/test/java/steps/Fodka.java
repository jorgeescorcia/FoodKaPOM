package steps;

import foodkapage.FoodkaPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;



public class Fodka {
    FoodkaPage foodkapage = new FoodkaPage();

    @Dado("que quiero comprar")
    public void que_quiero_comprar() {
      foodkapage.navegar_a_foodka();

    }

    @Cuando("llene los datos")
    public void llene_los_datos() {

    }

    @Entonces("podre escoger el plato")
    public void podre_escoger_el_plato() {

    }

}
