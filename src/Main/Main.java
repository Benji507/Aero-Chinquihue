//Benjamin Espinoza, Francisco Felasquez, Camillo Bustamante, Benjamin Paredes

package vista;

import clases.*;
import controlador.ControladorAerolinea;

public class Main{
    public static void main(String[] args){
        ControladorAerolinea c = new ControladorAerolinea();
        c.poblarDatos();

        System.out.println("Destinos: " + c.getDestinos().size());
        System.out.println("Vuelos cargados: " + c.getVuelos().size());
        for (Vuelo v : c.getVuelos()){
            System.out.println(v);
        }
    }
}
