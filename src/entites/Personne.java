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
public class Personne implements Serializable{

    protected long id;
    protected String nom;
    protected String prenom;

    public Personne() {
    }

    public Personne(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object ido) {

        if (!(ido instanceof Personne)) {
            return false;
        }
        Personne personne = (Personne) ido;
        return (this.id != 0) && (this.id == personne.id);
    }

    @Override
    public String toString() {
        return "Informations Personne:\n\tIdentifiant: " + id + "\n\tNom: " + nom + "\n\tPrénom(s): " + prenom;
    }

}
