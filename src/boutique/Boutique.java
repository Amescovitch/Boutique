/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boutique;

import entites.Achat;
import entites.Categorie;
import entites.Client;
import entites.Employe;
import entites.Personne;
import entites.Produit;
import entites.ProduitAchete;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Amescovitch
 */
public class Boutique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Personne personne1 = new Personne(1001, "YOVO", "Amèvi");
//        Personne personne2 = new Personne(1002, "KOUMAKOU", "Yawavi Dové");
//        Personne personne3 = new Personne(1003, "HOFFER", "Kodjo Gothlieb");
//
//        System.out.println(personne3);
//
//        Client client1 = new Client(2001, "ZIDOL", "Yaovi");
//        System.out.println(client1);
//
//        Employe employe1 = new Employe(LocalDate.of(2002, Month.MARCH, 06), 1003, "ATTISSO", "Kossivi Moise");
//        //System.out.println(employe1);
//        Categorie categorie1 = new Categorie(3001, "Savons", "Endroit reservé aux produits pour lessives, douches, vaisselles et netaoyage.");
//        //System.out.println(categorie1);
//
//        Produit produit1 = new Produit(3001, "Aqualinda", 250, LocalDate.of(2022, Month.OCTOBER, 29), categorie1);
//        //System.out.println(produit1);
//
//        //produit1.estPerime();
//        //produit1.estPerime(LocalDate.of(2023, Month.MARCH, 10));
//        Achat achat = new Achat();
//        ProduitAchete produitachete1 = new ProduitAchete(05, produit1, achat);
//
//        Achat achat1 = new Achat(5001, LocalDate.of(2022, Month.MAY, 18), 10, produitachete1, client1, employe1);
//        achat.setId(achat1.getId());
//        System.out.println(produitachete1);
//
//        System.out.println(achat1);
Produit produit1 = new Produit(10001, "Aqualis", 275, LocalDate.of(2022, Month.DECEMBER, 28), new Categorie(1001, "Savons", "Savons de lessive, de douche"));
ProduitAchete pachete1 = new ProduitAchete(6, produit1, new Achat());
Achat achat1 = new Achat();
        System.out.println(achat1);
    }

}
