package clases;

public class Avion {

    private String modelo;
    private int capacidadPasajeros;
    private int pesoMaximo; // kg

    public Avion(String modelo, int capacidadPasajeros, int pesoMaximo){
        this.modelo = modelo;
        this.capacidadPasajeros = capacidadPasajeros;
        this.pesoMaximo = pesoMaximo;
   }

    public static Avion cessna310(){
        return new Avion("CESSNA 310", 5, 910);}
    public static Avion cessna208Caravan(){
        return new Avion("CESSNA 208 CARAVAN", 9, 1315);}
    public static Avion let410(){
        return new Avion("LET 410 UVP-E20", 19, 1800);}

    public String getModelo(){
        return modelo;}
    public void setModelo(String modelo){
        this.modelo = modelo;}
    public int getCapacidadPasajeros(){
        return capacidadPasajeros;}
    public void setCapacidadPasajeros(int c){
        this.capacidadPasajeros = c;}
    public int getPesoMaximo(){
        return pesoMaximo;}
    public void setPesoMaximo(int p){
        this.pesoMaximo = p;}

    public boolean cabeCarga(double pesoKg){
        return pesoKg >= 0 && pesoKg <= pesoMaximo;
   }

    @Override
    public String toString(){
        return modelo + " (" + capacidadPasajeros + " pasajeros, " + pesoMaximo + " kg)";
   }
}
