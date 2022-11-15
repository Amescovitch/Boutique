/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amescovitch
 */
public class Achat implements Serializable {

    private long id;
    private LocalDate date;
    private double remise;
    private Client client;
    private Employe employe;
    private List<ProduitAchete> ListeDesProduitsAchetes = new ArrayList<>();

    public Achat() {
    }

    public Achat(long id, LocalDate date, double remise, ProduitAchete produitAchete, Client client, Employe employe) {
        this.id = id;
        this.date = date;
        this.remise = remise;
        this.produitAchete = produitAchete;
        this.client = client;
        this.employe = employe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public ProduitAchete getProduitAchete() {
        return produitAchete;
    }

    public void setProduitAchete(ProduitAchete produitAchete) {
        this.produitAchete = produitAchete;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    double remiseTotal = 0;

    public double getRemiseTotal() {
        for (ProduitAchete produitAchete : ListeDesProduitsAchetes) {
            remiseTotal += (produitAchete.getRemise() * produitAchete.getProduit().getPrixUnitaire()) / 100;
        }
        return remiseTotal;
    }
    double totalPayer = 0;
    double prixNet = 0;

    public double getTotalPayer() {
        for (ProduitAchete produitAchete : ListeDesProduitsAchetes) {
            prixNet += produitAchete.getProduit().getPrixUnitaire();
        }
        totalPayer = prixNet - remiseTotal;

        return totalPayer;
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 31 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object ido) {

        if (!(ido instanceof Achat)) {
            return false;
        }
        Achat achat = (Achat) ido;
        return (this.id != 0) && (this.id == achat.id);
    }

    @Override
    public String toString() {
        return "Informations sur Achat" + "\n\tIdentifiant: " + id + "\n\tDate de l'achat: "
                + date + "\n\tProduit acheté: "
                + produitAchete.getProduit().getId() + "\t" + produitAchete.getProduit().getLibelle()
                + "\n\tPrix unitaire: " + produitAchete.getProduit().getPrixUnitaire() + " FCFA"
                + "\n\tRemise sur achat: " + getRemiseTotal() + " FCFA"
                + "\n\tTotal Payer: " + getTotalPayer() + " FCFA"
                + "\n\tClient: " + client.getId() + "\t" + client.getNom() + "\t" + client.getPrenom() + "\n\tEmployé (vendeur): "
                + employe.getId() + "\t" + employe.getNom() + "\t" + employe.getPrenom();
    }

}
