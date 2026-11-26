package clases;

public class Venta{
    private String servicio;
    private String medioPago;
    private int monto;
    private String fecha;

    public Venta(String servicio, String medioPago, int monto, String fecha){
        this.servicio = servicio;
        this.medioPago = medioPago;
        this.monto = monto;
        this.fecha = fecha;
   }

    public String getServicio(){
        return servicio;}
    public int getMonto(){
        return monto;}
    public String getFecha(){
        return fecha;}
    public String getMedioPago(){
        return medioPago;}

    @Override
    public String toString(){
        return fecha + " / " + servicio + " / " + medioPago + " / CLP" + monto;
   }
}
