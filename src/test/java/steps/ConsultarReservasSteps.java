package steps;


import foodkapage.FoodkaPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

public class ConsultarReservasSteps {
    FoodkaPage foodkapage;

    @Dado("Que me encuentro en el modulo de consultar reserva")
    public void que_me_encuentro_en_el_modulo_de_consultar_reserva() {
        foodkapage = new FoodkaPage();
        foodkapage.navegar_a_foodka();
    }

    @Cuando("ingreso el codigo de la reserva en el campos correspondiente")
    public void ingreso_el_codigo_de_la_reserva_en_el_campos_correspondiente() {
        foodkapage.clickBtnMisReservas();
        foodkapage.escribirCampoReserva();
    }

    @Entonces("se consulte y se visualice la informacion de la reserva")
    public void se_consulte_y_se_visualice_la_informacion_de_la_reserva() {
        foodkapage.clickBtnBuscar();
        foodkapage.cerrarVentanaReservas();
        foodkapage.cerrarNavegador();

    }

    @Dado("Que me encuentro en la opcion de consultar reserva")
    public void que_me_encuentro_en_la_opcion_de_consultar_reserva() {
        foodkapage = new FoodkaPage();
       foodkapage.navegar_a_foodka();

    }

    @Cuando("no ingreso el codigo de la reserva")
    public void no_ingreso_el_codigo_de_la_reserva() {



    }

    @Entonces("debo observar un mensaje que me indique que no se pudo consultar la reserva")
    public void debo_observar_un_mensaje_que_me_indique_que_no_se_pudo_consultar_la_reserva() {
        //foodkapage.cerrarNavegador();

    }
}
