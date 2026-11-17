package com.tissher.domain;

public class EntrepriseTextile {
    // 1. Attributs + encapsulation avec 'Private'
    private String nom;
    private double chiffreDaffaires;
    private int effectif;
    private String pays;
    private int anneeCreation;
    private String formeJuridique;
    private String siteInternet;
    private String imageUrl;   

    // 2. Constructeur (va créer l'objet)
    public EntrepriseTextile(String nom, double chiffreDaffaires, int effectif, String pays, int anneeCreation, String formeJuridique, String siteInternet, String imageUrl ) {
        this.nom = nom;
        this.chiffreDaffaires = chiffreDaffaires;
        this.effectif = effectif;
        this.pays = pays;
        this.anneeCreation = anneeCreation;
        this.formeJuridique = formeJuridique; 
        this.siteInternet = siteInternet; 
        this.imageUrl = imageUrl;                
    }

    // 3. Les getters (pour lire les données de l'extérieur)
    public String getNom() {
        return nom;
    }

    public double getChiffreDaffaires() {
        return chiffreDaffaires;
    }

    public int getEffectif() {
        return effectif;
    }

    public String getPays() {
        return pays;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public String getFormeJuridique() {
        return formeJuridique;
    }
 
    public String getSiteInternet() {
        return siteInternet;
    }

    public String getImageUrl() { 
        return imageUrl; } 
}