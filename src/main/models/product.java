package main.models;

public class product {
    //Atrubuts
    private String nom;
    private String id;
    private double preu;
    private int numVentas;

    //Constructor del amb els atributs asignats
    public product(String nom, String id, double preu){
        this.nom = nom;
        this.id = id;
        this.preu = preu;
        this.numVentas = 0;
    }

    //Motidos Geters
    public int GetVentas(){
        return numVentas;
    }

    public double GetPreu(){
        return preu;
    }

    public String GetId(){
        return id;
    }

    public  String GetNom(){
        return nom;
    }

    //Funcions de la Classe
    public int AddSales(int i){
        if(i>0){
            numVentas = numVentas + i;
        }
    }
}
