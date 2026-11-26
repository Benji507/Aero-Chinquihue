package clases;

public class DescuentoEmergencia implements Descuento{

    @Override // Devuelve 0 pq el no se pagan los pasajes en estado de emergencia
    public int aplicar(int precio){
        return 0;
   }
}