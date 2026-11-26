package clases;

public class Gerente extends Usuario{

    public Gerente(String nombre, String rut, String usuario){
        super(nombre, rut, usuario);
   }

    public Vuelo crearVueloExtraordinario(String fecha, String hora, Avion avion, Destino destino){
        return new Vuelo(fecha, hora, avion, destino, true);
   }

    public DescuentoGerente aplicarDescuentoEspecial(double porcentaje){
        return new DescuentoGerente(porcentaje);
   }
}
