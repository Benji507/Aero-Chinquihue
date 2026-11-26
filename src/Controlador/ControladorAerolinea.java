package controlador;

import clases.*;
import java.util.ArrayList;
import java.util.List;

public class ControladorAerolinea{

    private List<Vuelo> vuelos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Venta> ventas = new ArrayList<>();
    private List<Destino> destinos = new ArrayList<>();
    private List<Avion> aviones = new ArrayList<>();
    private boolean estadoEmergencia = false;

    public List<Vuelo> getVuelos(){
        return vuelos;}
    public List<Cliente> getClientes(){
        return clientes;}
    public List<Venta> getVentas(){
        return ventas;}
    public List<Destino> getDestinos(){
        return destinos;}
    public List<Avion> getAviones(){
        return aviones;}
    public boolean isEstadoEmergencia(){
        return estadoEmergencia;}
    public void setEstadoEmergencia(boolean e){
        this.estadoEmergencia = e;}

    // Carga destinos, aviones y vuelos diarios de la aerolinea
    public void poblarDatos(){
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
        for (String fecha : fechas){
            for (Destino d : destinos){
                Avion a = d.getPrecioPasaje() <= 20000 ? c310
                        : d.getPrecioPasaje() <= 30000 ? c208 : let;
                vuelos.add(new Vuelo(fecha, "09:00", a, d, false));
            }
        }

        clientes.add(new Cliente("Lionel Messi", "11.677.111-1", "+569111676711"));
        clientes.add(new Cliente("Cristiano Ronaldo", "22.766.252-2", "+56922672677", 12));
    }
}