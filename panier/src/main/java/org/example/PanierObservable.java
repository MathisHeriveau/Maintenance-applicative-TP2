package org.example;

import java.util.ArrayList;

public class PanierObservable {

    // Liste d'actionPanier
    private ArrayList<ActionPanier> listeActionPanier = new ArrayList<ActionPanier>();

    public void faireTraiter(String contenu) {
        for (ActionPanier actionPanier : listeActionPanier) {
            actionPanier.traite(contenu);
        }
    }

    public void ajouterActionPanier(ActionPanier actionPanier) {
        listeActionPanier.add(actionPanier);
    }

    public void supprimerActionPanier(ActionPanier actionPanier) {
        listeActionPanier.remove(actionPanier);
    }

}
