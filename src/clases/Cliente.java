package clases;

public class Cliente{

    private static final int VUELOS_PARA_DESCUENTO = 10;

    private String nombre;
    private String rut;
    private String telefono;
    private int vuelosRealizados;

    public Cliente(String nombre, String rut, String telefono){
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.vuelosRealizados = 0;
   }

    public Cliente(String nombre, String rut, String telefono, int vuelosRealizados){
        this(nombre, rut, telefono);
        this.vuelosRealizados = vuelosRealizados;
   }

    public String getNombre(){
        return nombre;
   }

    public void setNombre(String nombre){
        this.nombre = nombre;
   }

    public String getRut(){
        return rut;
   }

    public void setRut(String rut){
        this.rut = rut;
   }

    public String getTelefono(){
        return telefono;
   }

    public void setTelefono(String telefono){
        this.telefono = telefono;
   }

    public int getVuelosRealizados(){
        return vuelosRealizados;
   }

    public void incrementarVuelos(){
        vuelosRealizados++;
   }

    // Descuento del 10% para clientes con más de 10 vuelos realizados
    public boolean tieneDescuento(){
        return vuelosRealizados > VUELOS_PARA_DESCUENTO;
   }

    @Override
    public String toString(){
        return nombre + " (" + rut + ") - vuelos: " + vuelosRealizados;
   }
}