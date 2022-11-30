/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imc;

/**
 *
 * @author khali
 */
public class Personne {
   private  String nom,prenom;
    private  double taille,poids;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Personne() {
    }

    public Personne(String nom, String prenom, double taille, double poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", taille=" + taille + ", poids=" + poids + '}';
    }
    public double imc()
    {
    return this.poids/Math.pow(taille,2); // poid / taille ² 
    // => Math.pow= Math.power (valeur,puissance)
    }
    
}
