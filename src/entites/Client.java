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
public class Client extends Personne implements Serializable {

    public Client() {
    }

    public Client(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
