/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Amescovitch
 */
public class Produit implements Serializable {

    private long id;
    private String libelle;
    private double prixUnitaire;
    private LocalDate datePeremtion;
    private Categorie categorie;

    public Produit() {
    }

    public Produit(long id, String libelle, double prixUnitaire, LocalDate datePeremtion, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
        this.categorie = categorie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public LocalDate getDatePeremtion() {
        return datePeremtion;
    }

    public void setDatePeremtion(LocalDate datePeremtion) {
        this.datePeremtion = datePeremtion;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public boolean estPerime() {

        if (datePeremtion.isBefore(LocalDate.now())) {
            System.out.println("Attention !\nLe produit est périmé. Son usage est strictement déconseillé.");
            return true;
        } else if (datePeremtion.isEqual(LocalDate.now())) {
            System.out.println("Attention !\nLe produit est en cours de péremtion.Vous avez encore jusqu'à la fin de la journée pour en finir avec.");
        } else {
            System.out.println("Rien à craindre, le produit est toujours utilisable !");
        }
        return false;
    }

    public boolean estPerime(LocalDate dateReference) {

        if (datePeremtion.isBefore(dateReference)) {
            System.out.println("Attention !\nLe produit est périmé. Son usage est strictement déconseillé.");
            return true;
        } else if (datePeremtion.isEqual(dateReference)) {
            System.out.println("Attention !\nLe produit est en cours de péremtion.Vous avez encore jusqu'à la fin de la journée pour en finir avec.");
        } else {
            System.out.println("Rien à craindre, le produit est toujours utilisable !");
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash = 31 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object ido) {

        if (!(ido instanceof Produit)) {
            return false;
        }
        Produit produit = (Produit) ido;
        return (this.id != 0) && (this.id == produit.id);
    }

    @Override
    public String toString() {
        return "Informations Produits:" + "\n\tIdentifiant: " + id + "\n\tLibellé: " + libelle + "\n\tPrix Unitaire: " + prixUnitaire + " FCFA\n\tDate de péremtion: " + datePeremtion + "\n\tCatégorie du Produit: " + categorie.getLibelle();
    }
}
