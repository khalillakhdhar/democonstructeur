/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.democonstructeur;

/**
 *
 * @author khali
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Projet pr; // création de variable de type classe
       //pr.sayhi(); //innacceptable => on doit initialisé (new Projet()) pr sinon on ne peut plus y accéder
        pr=new Projet(); //initialisation
        Projet p2=new Projet("site web avocat", "site web de gestion des client Maitre Hichem");
         pr.sayhi();
         // p2.sayhi();
         Projet projet=new Projet("projet java comptable","projet compta plus","Amal", 20);
        System.out.println(p2.identite());
        System.out.println(projet.toString());
    }
    
}
