package com.tissher;

import com.tissher.domain.EntrepriseTextile;
import java.util.ArrayList; // 1. Importer la classe ArrayList
import java.util.List;     // 2. Importer l'interface List

public class Main {
    public static void main(String[] args) {
        // 1. Création d'une liste vide qui va contenir des "EntrepriseTextile"
        List<EntrepriseTextile> entreprises = new ArrayList<>();

        // 2. Ajout des entreprises dans la liste avec .add()
        entreprises.add(new EntrepriseTextile("Laines Paysannes", 0, 30, "France", 2016, "SCIC", "https://laines-paysannes.fr/"));
        entreprises.add(new EntrepriseTextile("Ardelaine", 0, 60, "France", 1982, "SCOP", "https://www.ardelaine.fr/"));
        entreprises.add(new EntrepriseTextile("Fashionomics", 0, 3000, "Nigeria", 2016, "AfDB initiative", "https://fashionomicsafrica.org/"));

        // 3. Parcours de la liste avec une boucle "for-each"
        System.out.println("--- Projet TissHer : Annuaire des Entreprises ---");
        
        int compteur = 1;
        for (EntrepriseTextile atelier : entreprises) {
            System.out.println(compteur + ". Nom : " + atelier.getNom());
            System.out.println("   Forme juridique : " + atelier.getFormeJuridique());
            System.out.println("   Pays : " + atelier.getPays() + " | Année : " + atelier.getAnneeCreation());
            System.out.println("   Effectif : " + atelier.getEffectif() + " travailleuses\n");
            System.out.println("   Site Internet : " + atelier.getSiteInternet()+ "\n");

            compteur++;
        }
    }
}