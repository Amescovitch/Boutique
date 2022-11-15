/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entites;

import java.io.Serializable;

/**
 *
 * @author Amescovitch
 */
public class Categorie implements Serializable {

    private int id;
    private String libelle;
    private String description;

    public Categorie() {
    }

    public Categorie(int id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = 31 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object ido) {

        if (!(ido instanceof Categorie)) {
            return false;
        }
        Categorie categorie = (Categorie) ido;
        return (this.id != 0) && (this.id == categorie.id);
    }

    @Override
    public String toString() {
        return "Informations Catégorie\n" + "\tIdentifiant: " + id + "\n\tLibellé: " + libelle + "\n\tDescription: " + description;
    }
}
