package clases;

import java.util.ArrayList;
import java.util.List;

public class Vuelo{

    private String fecha;
    private String hora;
    private Avion avion;
    private Destino destino;
    private boolean extraordinario;
    private List<Asiento> asientos = new ArrayList<>();
    private double cargaActualKg;

    public Vuelo(String fecha, String hora, Avion avion, Destino destino, boolean extraordinario){
        this.fecha = fecha;
        this.hora = hora;
        this.avion = avion;
        this.destino = destino;
        this.extraordinario = extraordinario;
        generarAsientos();
   }

    // Crea los asientos segun la capacidad del avion (2 columnas A y B)
    public void generarAsientos(){
        asientos.clear();
        for (int i = 1; i <= avion.getCapacidadPasajeros(); i++){
            int fila = (i - 1) / 2 + 1;
            char columna = (i % 2 == 1) ? 'A' : 'B';
            asientos.add(new Asiento(i, fila, columna));
       }
   }

    public String getFecha(){
        return fecha;}
    public String getHora(){
        return hora;}
    public Avion getAvion(){
        return avion;}
    public Destino getDestino(){
        return destino;}
    public boolean esExtraordinario(){
        return extraordinario;}
    public double getCargaActualKg(){
        return cargaActualKg;}
    public List<Asiento> getAsientos(){
        return asientos;}

        // Busca un asiento por su numero y devuelve null si no lo encuentra
    public Asiento buscarAsiento(int numero){
        for (Asiento a : asientos){
            if (a.getNumero() == numero){
                return a;
           }
       }
        return null;
   }

    public int asientosDisponibles(){
        int libres = 0;
        for (Asiento a : asientos){
            if (!a.estaOcupado()){
                libres++;
           }
       }
        return libres;
   }
   // Intenta reservar un asiento
    public boolean reservarAsiento(Asiento a){
        if (a == null || !asientos.contains(a) || a.estaOcupado()){
            return false;
       }
        a.ocupar();
        return true;
   }
   //Devuelve la carga disponible en kg
    public double cargaDisponible(){
        return avion.getPesoMaximo() - cargaActualKg;
   }
   // Si no queda espacio no se agrega la carga y devuelve false
    public boolean agregarCarga(double kg){
        if (kg <= 0 || kg > cargaDisponible()){
            return false;
       }
        cargaActualKg += kg;
        return true;
   }

    @Override
    public String toString(){
        return fecha + " " + hora + "  " + destino.getNombre() + " [" + avion.getModelo()
                + "] asientos libres: " + asientosDisponibles() + ", carga libre: " + cargaDisponible() + " kg"
                + (extraordinario ? " (EXTRAORDINARIO)" : "");
   }
}
