package clases;

public class DescuentoFrecuente implements Descuento{
    private static final double PORCENTAJE = 10.0;

    @Override// Aplica un decuento para clientes con mas de 10 vuelos
    public int aplicar(int precio){
        return (int) Math.round(precio * (1 - PORCENTAJE / 100));
    }
}
