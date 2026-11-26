package clases;

public abstract class Usuario{
    private String nombre;
    private String rut;
    private String usuario;

    public Usuario(String nombre, String rut, String usuario){
        this.nombre = nombre;
        this.rut = rut;
        this.usuario = usuario;
   }

    public String getNombre(){
        return nombre;}
    public String getRut(){
        return rut;}
    public String getUsuario(){
        return usuario;}
}
