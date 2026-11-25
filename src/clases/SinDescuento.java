package clases;

public class SinDescuento implements Descuento{

    @Override
    public int aplicar(int precio){
        return precio;
    }
}
