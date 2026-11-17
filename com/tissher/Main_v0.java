package com.tissher;

import com.tissher.domain.EntrepriseTextile;

public class Main {
    public static void main(String[] args) {
        // 1. 1ere entrée - Instanciation
        EntrepriseTextile maCoop = new EntrepriseTextile("Laines Paysannes", 0, 30, "France", 2016);
        
        // 1. 2e entrée - Instanciation
        EntrepriseTextile maCoop2 = new EntrepriseTextile("Ardelaine", 0, 60, "France", 1982);
        
        // 2. 1ere entrée - Affichage
        System.out.println("--- Fiche Entreprise TissHer ---");
        System.out.println("Nom : " + maCoop.getNom());
        System.out.println("Pays : " + maCoop.getPays());
        System.out.println("Année de création : " + maCoop.getAnneeCreation());
        System.out.println("Chiffre d'affaires : " + maCoop.getChiffreDaffaires() + " euros");
        System.out.println("Effectif : " + maCoop.getEffectif() + " collaboratrices");
    
        // 2. 2e entrée - Affichage
        System.out.println("--- Fiche Entreprise Ardelaine ---");
        System.out.println("Nom : " + maCoop2.getNom());
        System.out.println("Pays : " + maCoop2.getPays());
        System.out.println("Année de création : " + maCoop2.getAnneeCreation());
        System.out.println("Chiffre d'affaires : " + maCoop2.getChiffreDaffaires() + " euros");
        System.out.println("Effectif : " + maCoop2.getEffectif() + " collaboratrices");
    
    }
}