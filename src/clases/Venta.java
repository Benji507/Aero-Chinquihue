package clases;

public class Venta {
    private String servicio;
    private MedioPago medioPago;
    private int monto;
    private String fecha;

    public Venta(String servicio, MedioPago medioPago, int monto,String fecha) {
        this.servicio = servicio;
        this.medioPago = medioPago;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMedioPago() {
        return medioPago.toString();
    }
}
