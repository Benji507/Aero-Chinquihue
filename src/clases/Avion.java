package clases;

public class Avion{

    private String clases;
    private int capacidadPasajeros;
    private int pesoMaximo;   // kg

    public Avion(String clases, int capacidadPasajeros, int pesoMaximo){
        this.clases = clases;
        this.capacidadPasajeros = capacidadPasajeros;
        this.pesoMaximo = pesoMaximo;
    }

    //Los clasess de aviones

    public static Avion cessna310(){
        return new Avion("CESSNA 310", 5, 910);
    }

    public static Avion cessna208Caravan(){
        return new Avion("CESSNA 208 CARAVAN", 9, 1315);
    }

    public static Avion let410(){
        return new Avion("LET 410 UVP-E20", 19, 1800);
    }

    public String getclases(){
        return clases;
    }

    public void setclases(String clases){
        this.clases = clases;
    }

    public int getCapacidadPasajeros(){
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros){
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getPesoMaximo(){
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo){
        this.pesoMaximo = pesoMaximo;
    }

    //Esto indica si el avion puede cargar un paquete de x peso
    public boolean cabeCarga(double pesoKg){
        return pesoKg >= 0 && pesoKg <= pesoMaximo;
    }

    @Override
    public String toString(){
        return clases + " (" + capacidadPasajeros + " pasajeros, " + pesoMaximo + " kg)";
    }
}