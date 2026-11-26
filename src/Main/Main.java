package vista;

import clases.*;
import controlador.ControladorAerolinea;
import java.util.List;

/**
 * AeroChinquihue - Avance 1
 * Integrantes: (completar nombres del equipo)
 */
public class Main {
    public static void main(String[] args) {
        ControladorAerolinea c = new ControladorAerolinea();
        c.poblarDatos();

        System.out.println("Destinos: " + c.getDestinos().size());
        System.out.println("Vuelos cargados: " + c.getVuelos().size());

        Cliente cliente = c.getClientes().get(1);
        List<Vuelo> vuelos = c.buscarVuelos("Chaitén", "2026-11-26");
        Vuelo vuelo = vuelos.get(0);
        System.out.println(vuelo);

        Pasaje p = c.reservarPasaje(cliente, vuelo, vuelo.buscarAsiento(1));
        System.out.println(p);
        c.registrarVenta("Pasaje", "Débito", p.getPrecioFinal(), vuelo.getFecha());

        Encomienda e = c.enviarEncomienda(cliente, vuelo, 10);
        System.out.println(e);
        c.registrarVenta("Encomienda", "Efectivo", e.getPrecioFinal(), vuelo.getFecha());

        System.out.println("Ventas del dia:");
        for (Venta v : c.resumenVentasDiario(vuelo.getFecha())) {
            System.out.println("  " + v);
        }
    }
}
