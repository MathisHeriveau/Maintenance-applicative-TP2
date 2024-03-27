package org.example;

import java.util.ArrayList;

public class GestionDeStock implements ActionPanier {
    private String gestionStock;

    public GestionDeStock(String pGestionStock) {
        this.gestionStock = pGestionStock;
    }
    public void traite(String contenu) {

        System.out.println("G.DES.STOCKS:" + contenu.toString().toUpperCase());
    }
}
