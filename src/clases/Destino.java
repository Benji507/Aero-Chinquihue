package clases;

public class Destino{

    private String nombre;
    private int precioPasaje;          //por persona
    private int precioKgEncomienda;    //por kg

    public Destino(String nombre, int precioPasaje, int precioKgEncomienda){
        this.nombre = nombre;
        this.precioPasaje = precioPasaje;
        this.precioKgEncomienda = precioKgEncomienda;
   }

    public String getNombre(){
        return nombre;
   }

    public void setNombre(String nombre){
        this.nombre = nombre;
   }

    public int getPrecioPasaje(){
        return precioPasaje;
   }

    public void setPrecioPasaje(int precioPasaje){
        this.precioPasaje = precioPasaje;
   }

    public int getPrecioKgEncomienda(){
        return precioKgEncomienda;
   }

    public void setPrecioKgEncomienda(int precioKgEncomienda){
        this.precioKgEncomienda = precioKgEncomienda;
   }

    @Override // Devuelve una representacion en cadena del destino
    public String toString(){
        return nombre + " (pasaje: CLP" + precioPasaje + ", encomienda: CLP" + precioKgEncomienda + "/kg)";
   }
}