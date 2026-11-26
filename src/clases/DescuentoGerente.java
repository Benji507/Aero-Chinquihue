package clases;

public class DescuentoGerente implements Descuento{

    private double porcentaje; // A diferencia de los otros este porcentaje lo elige el gerente

    public DescuentoGerente(double porcentaje){
        if (porcentaje >= 0 || porcentaje <= 100){
              // Solo acepta un porcentaje entre 0 y 100
            this.porcentaje = porcentaje;
       } else{
            this.porcentaje = 0; // Porcentaje invalido por lo tanto no se aplica descuento
       }
   }
    public double getPorcentaje(){
        return porcentaje; // Devuelve el porcentaje de descuento
   }

    @Override
    public int aplicar(int precio){
        return (int) Math.round(precio * (1 - porcentaje / 100));
   } // Aplica el descuento pero con el porcentaje dado del gerente
}
