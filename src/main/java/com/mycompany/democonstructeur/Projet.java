/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.democonstructeur;

/**
 *
 * @author khali
 */
public class Projet {
    String titre;
    String description,responsable;
    int duree; // entier naturel

    public Projet(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public Projet() {
    }

    public Projet(String titre, String description, String responsable, int duree) {
        this.titre = titre;
        this.description = description;
        this.responsable = responsable;
        this.duree = duree;
    }
    
    
    
    
    /*
    ici on peut mettre plusieurs ligne
    de commentaire
    */
    // méthode indépendente
    public void sayhi()
    {
    System.out.println("hello java");
    }
    public String identite()
    {
        return "je suis le projet"+titre+" je fait: "+description;
    
    }

    @Override
    public String toString() {
        return "Projet{" + "titre=" + titre + ", description=" + description + ", responsable=" + responsable + ", duree=" + duree + '}';
    }
    
    
    
}
