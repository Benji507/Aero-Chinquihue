package clases;

public class Pasaje{

    private Cliente cliente;
    private Vuelo vuelo;
    private Asiento asiento;
    private int precioFinal;
    private Descuento descuento;

    public Pasaje(Cliente cliente, Vuelo vuelo, Asiento asiento, Descuento descuento){
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.descuento = descuento;
        calcularPrecio();
   }

    public int calcularPrecio(){
        precioFinal = descuento.aplicar(vuelo.getDestino().getPrecioPasaje());
        return precioFinal;
   }

    public void aplicarDescuento(Descuento d){
        this.descuento = d;
        calcularPrecio();
   }

    public Cliente getCliente(){
        return cliente;}
    public Vuelo getVuelo(){
        return vuelo;}
    public Asiento getAsiento(){
        return asiento;}
    public int getPrecioFinal(){
        return precioFinal;}

    @Override
    public String toString(){
        return "Pasaje " + cliente.getNombre() + " / " + vuelo.getDestino().getNombre() + " "
                + vuelo.getFecha() + " " + vuelo.getHora() + " / asiento " + asiento.getNumero() + " / CLP" + precioFinal;
   }
}
