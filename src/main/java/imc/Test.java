/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;

import com.mycompany.democonstructeur.Projet;

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
        Personne p=new Personne("Ali", "Ali", 1.82, 82);
        Projet prj=new Projet(); // accessible puisque projet est publique
        
        //prj.sayhi(); // erreur car sayhi n'est pas publique => par defaut package
        System.out.println(p.toString());
        System.out.println("le imc est: "+Math.round(p.imc())); //Math.round retourne l'arrondi
        p.setPoids(75);
        System.out.println(p.getNom()+" "+p.getPrenom());

        System.out.println("le nouveau imc est: "+Math.round(p.imc())); //Math.round retourne l'arrondi
        
    }
    
}
