package clases;

public class Encomienda {

    private double pesoKg;
    private Destino destino;
    private int precioFinal;
    private String fechaEntrega;
    private double descuento; // porcentaje 0-100

    public Encomienda(double pesoKg, Destino destino, String fechaEntrega){
        this.pesoKg = pesoKg;
        this.destino = destino;
        this.fechaEntrega = fechaEntrega;
        this.descuento = 0;
        calcularPrecio();
   }

    public int calcularPrecio(){
        double base = pesoKg * destino.getPrecioKgEncomienda();
        precioFinal = (int) Math.round(base * (1 - descuento / 100));
        return precioFinal;
   }
   // Calc 10%
    public void aplicarDescuento(double porcentaje){
        if (porcentaje >= 0 && porcentaje <= 100){
            descuento = porcentaje;
            calcularPrecio();
       }
   }

    public double getPesoKg(){
        return pesoKg;}
    public Destino getDestino(){
        return destino;}
    public int getPrecioFinal(){
        return precioFinal;}
    public String getFechaEntrega(){
        return fechaEntrega;}

    @Override
    public String toString(){
        return "Encomienda " + pesoKg + " kg a " + destino.getNombre() + " / entrega " + fechaEntrega + " / CLP" + precioFinal;
   }
}
