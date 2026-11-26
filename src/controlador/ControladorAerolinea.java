package controlador;

import clases.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorAerolinea {

    private List<Vuelo> vuelos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();
    private List<Destino> destinos = new ArrayList<>();
    private List<Avion> aviones = new ArrayList<>();
    private boolean estadoEmergencia = false;

    public List<Vuelo> getVuelos() { return vuelos; }
    public List<Cliente> getClientes() { return clientes; }
    public List<Venta> getVentas() { return ventas; }
    public List<Destino> getDestinos() { return destinos; }
    public List<Avion> getAviones() { return aviones; }
    public boolean isEstadoEmergencia() { return estadoEmergencia; }
    public void setEstadoEmergencia(boolean e) { this.estadoEmergencia = e; }

    /** Carga destinos, aviones y vuelos diarios de la aerolinea. */
    public void poblarDatos() {
        Avion c310 = Avion.cessna310();
        Avion c208 = Avion.cessna208Caravan();
        Avion let = Avion.let410();
        aviones.add(c310);
        aviones.add(c208);
        aviones.add(let);

        destinos.add(new Destino("Cochamó", 20000, 5000));
        destinos.add(new Destino("Puelo Bajo", 20000, 5000));
        destinos.add(new Destino("Contao", 20000, 5000));
        destinos.add(new Destino("Rio Negro", 25000, 6000));
        destinos.add(new Destino("Pupelde", 25000, 6000));
        destinos.add(new Destino("Chepu", 30000, 8000));
        destinos.add(new Destino("Ayacara", 30000, 8000));
        destinos.add(new Destino("Pillán", 40000, 12000));
        destinos.add(new Destino("Reñihue", 40000, 12000));
        destinos.add(new Destino("Isla Quenac", 40000, 12000));
        destinos.add(new Destino("Palqui", 40000, 12000));
        destinos.add(new Destino("Chaitén", 50000, 15000));
        destinos.add(new Destino("Santa Bárbara", 50000, 15000));

        // Vuelos diarios desde Aerodromo La Paloma (3 dias)
        String[] fechas = {"2026-11-26", "2026-11-27", "2026-11-28"};
        for (String fecha : fechas) {
            for (Destino d : destinos) {
                Avion a = d.getPrecioPasaje() <= 20000 ? c310
                        : d.getPrecioPasaje() <= 30000 ? c208 : let;
                vuelos.add(new Vuelo(fecha, "09:00", a, d, false));
            }
        }

        clientes.add(new Cliente("Juan Pérez", "11.111.111-1", "+56911111111"));
        clientes.add(new Cliente("María Soto", "22.222.222-2", "+56922222222", 12));
    }

    public List<Vuelo> buscarVuelos(String destino, String fecha) {
        List<Vuelo> r = new ArrayList<>();
        for (Vuelo v : vuelos) {
            if (v.getDestino().getNombre().equalsIgnoreCase(destino) && v.getFecha().equals(fecha)) {
                r.add(v);
            }
        }
        return r;
    }

    /** Reserva con descuento automatico (frecuente) o el descuento indicado. */
    public Pasaje reservarPasaje(Cliente cliente, Vuelo vuelo, Asiento asiento) {
        Descuento d = cliente.tieneDescuento() ? new DescuentoFrecuente() : new SinDescuento();
        return reservarPasaje(cliente, vuelo, asiento, d);
    }

    public Pasaje reservarPasaje(Cliente cliente, Vuelo vuelo, Asiento asiento, Descuento descuento) {
        if (!vuelo.reservarAsiento(asiento)) {
            return null;
        }
        Pasaje p = new Pasaje(cliente, vuelo, asiento, descuento);
        cliente.incrementarVuelos();
        return p;
    }

    public Encomienda enviarEncomienda(Cliente cliente, Vuelo vuelo, double kg) {
        if (!vuelo.agregarCarga(kg)) {
            return null;
        }
        return new Encomienda(kg, vuelo.getDestino(), vuelo.getFecha());
    }

    public Venta registrarVenta(String servicio, String medioPago, int monto, String fecha) {
        Venta v = new Venta(servicio, medioPago, monto, fecha);
        ventas.add(v);
        return v;
    }

    public List<Venta> resumenVentasDiario(String fecha) {
        List<Venta> r = new ArrayList<>();
        for (Venta v : ventas) {
            if (v.getFecha().equals(fecha)) {
                r.add(v);
            }
        }
        return r;
    }
}
