package org.example;

import java.util.ArrayList;
public class Panier extends PanierObservable {

    private String contenu;

    public Panier () {
        this.contenu = new String ("Contenu du panier");
    }

    public String getContenu() {
        return this.contenu;
    };

    public void setContenu(String pContenu) {
        this.contenu = pContenu;
    }

    public void declencherCommande() {
        this.faireTraiter(this.contenu);
    }
}
