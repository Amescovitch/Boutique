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
public class Employe extends Personne implements Serializable {

    private LocalDate dateNaissance;

    public Employe(LocalDate date, long id, String nom, String prenom) {
        super(id, nom, prenom);
        this.dateNaissance = date;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tDate de naissance: " + dateNaissance;
    }
}
