package clases;

public class Asiento {

    private int numero;
    private int fila;
    private char columna;
    private boolean ocupado;

    public Asiento(int numero, int fila, char columna){
        this.numero = numero;
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
   }

    public int getNumero(){
        return numero;}
    public int getFila(){
        return fila;}
    public char getColumna(){
        return columna;}
    public boolean estaOcupado(){
        return ocupado;}
    public void ocupar(){
        ocupado = true;}
    public void liberar(){
        ocupado = false;}

    @Override
    public String toString(){
        return "Asiento " + numero + " (" + fila + columna + ")" + (ocupado ? " [ocupado]" : "");
   }
}
