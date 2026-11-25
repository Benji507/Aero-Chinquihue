package clases;

public class Encomienda {
    
    private double pesoKg;
    private int precioFinal;
    private String fechaEntrega;
    private double descuento;

    public Encomienda(double pesoKg, int precioFinal, String fechaEntrega, double descuento) {
        this.pesoKg = pesoKg;
        this.fechaEntrega = fechaEntrega;
        this.descuento = 0;
        this.precioFinal = calcularPrecio();
    }

    // cada kilo cuesta 1000 (puede cambar ese valor)
    public int calcularPrecio() {
        double precioBase = pesoKg * destino.getPrecioencomienda();
        double rebaja = precioBase * descuento / 100;
        precioFinal = (int) (precioBase - rebaja);
        return precioFinal;
    }

    public void aplicarDescuento(double porcentaje) {
        descuento = porcentaje;
        calcularPrecio();
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public int getPrecioFInal() {
        return precioFinal;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }
}
