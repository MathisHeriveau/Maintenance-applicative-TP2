package org.example;

public class Main {

    public static void main(String[] args) {
        Panier panier = new Panier();
        ActionPanier gestionDeStock = new GestionDeStock("gestion de stock");
        ActionPanier comptabilite = new Comptabilite("comptabilite");

        panier.ajouterActionPanier(gestionDeStock);
        panier.ajouterActionPanier(comptabilite);

        System.out.println("Contenu du panier : " + panier.getContenu());

        panier.declencherCommande();

        panier.setContenu("nouveau contenu");


        panier.supprimerActionPanier(gestionDeStock);
        panier.declencherCommande();
    }
}


