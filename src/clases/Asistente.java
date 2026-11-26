package clases;

public class Asistente extends Usuario {

    public Asistente(String nombre, String rut, String usuario){
        super(nombre, rut, usuario);
   }

    public int cotizarPrecio(Cliente cliente, Vuelo vuelo){
        Descuento d = cliente.tieneDescuento() ? new DescuentoFrecuente() : new SinDescuento();
        return d.aplicar(vuelo.getDestino().getPrecioPasaje());
   }

    public Pasaje registrarReserva(Cliente cliente, Vuelo vuelo, Asiento asiento){
        if (!vuelo.reservarAsiento(asiento)){
            return null;
       }
        Descuento d = cliente.tieneDescuento() ? new DescuentoFrecuente() : new SinDescuento();
        return new Pasaje(cliente, vuelo, asiento, d);
   }
}
