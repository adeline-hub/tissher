package com.tissher;

import com.tissher.domain.EntrepriseTextile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Création de la liste des acteurs
        List<EntrepriseTextile> entreprises = new ArrayList<>();

        entreprises.add(new EntrepriseTextile("Laines Paysannes", 0, 30, "France", 2016, "SCIC", "https://laines-paysannes.fr/", "Brebis_mérinos_d'Arles.jpg"));
        entreprises.add(new EntrepriseTextile("Ardelaine", 0, 60, "France", 1982, "SCOP", "https://www.ardelaine.fr/", "Brebis_mérinos_d'Arles.jpg"));
        entreprises.add(new EntrepriseTextile("Fashionomics", 0, 3000, "Nigeria", 2016, "AfDB initiative", "https://fashionomicsafrica.org/", "tchad_cotton.jpg"));

        // 2. Calcul dynamique des statistiques globales
        int totalEntreprises = entreprises.size();
        int totalSalariees = 0;
        for (EntrepriseTextile atelier : entreprises) {
            totalSalariees += atelier.getEffectif();
        }

        // 3. Construction du code HTML propre
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<!DOCTYPE html>\n");
        htmlContent.append("<html lang=\"fr\">\n");
        htmlContent.append("<head>\n");
        htmlContent.append("    <meta charset=\"UTF-8\">\n");
        htmlContent.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
        htmlContent.append("    <title>TissHer - Annuaire</title>\n");
        htmlContent.append("    <link rel=\"icon\" href=\"img/favicon.ico\">\n");
        htmlContent.append("    <style>\n");
        htmlContent.append("        body { font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif; background-color: #0f1115; color: #f0f2f5; max-width: 800px; margin: 0 auto; padding: 40px 20px; }\n");
        htmlContent.append("        header { text-align: center; margin-bottom: 50px; }\n");
        htmlContent.append("        .logo-container img { max-width: 220px; height: auto; border-radius: 8px; box-shadow: 0 8px 20px rgba(0,0,0,0.4); margin-bottom: 20px; }\n");
        htmlContent.append("        h1 { font-size: 2.8rem; margin: 10px 0 5px 0; color: #33FFA2; letter-spacing: -1px; }\n");
        htmlContent.append("        .slogan { font-style: italic; color: #a0aec0; font-size: 1.1rem; margin-bottom: 30px; }\n");
        
        htmlContent.append("        .stats-box { display: inline-flex; gap: 40px; background: #1a1d24; border: 1px solid #2d3748; padding: 18px 35px; border-radius: 16px; box-shadow: 0 4px 12px rgba(0,0,0,0.3); }\n");
        htmlContent.append("        .stat-item { text-align: center; }\n");
        htmlContent.append("        .stat-number { font-size: 1.4rem; font-weight: bold; color: #FF33FF; }\n");
        htmlContent.append("        .stat-label { font-size: 0.85rem; color: #a0aec0; margin-top: 4px; }\n");

        // Style des cartes individuelles
        htmlContent.append("        .card { background: #161920; border: 1px solid #2d3748; border-radius: 12px; padding: 25px; margin-bottom: 20px; box-shadow: 0 4px 6px rgba(0,0,0,0.2); display: flex; justify-content: space-between; align-items: center; gap: 20px; transition: transform 0.2s, border-color 0.2s; }\n");
        htmlContent.append("        .card:hover { transform: translateY(-3px); border-color: #33FFA2; }\n");
        htmlContent.append("        .card-content { flex: 1; }\n");
        htmlContent.append("        .card h3 { margin-top: 0; color: #FF33FF; font-size: 1.4rem; }\n");
        htmlContent.append("        .meta { font-size: 0.95rem; color: #cbd5e0; margin: 8px 0; }\n");
        htmlContent.append("        a { display: inline-block; margin-top: 15px; color: #33FFA2; text-decoration: none; font-weight: 600; }\n");
        htmlContent.append("        a:hover { text-decoration: underline; }\n");
        
        // Style de l'image à droite
        htmlContent.append("        .card-img { width: 110px; height: 110px; object-fit: cover; border-radius: 10px; border: 1px solid #2d3748; background: #222; flex-shrink: 0; }\n");
        htmlContent.append("    </style>\n");
        htmlContent.append("</head>\n");
        htmlContent.append("<body>\n");
        htmlContent.append("    <header>\n");
        htmlContent.append("        <div class=\"logo-container\">\n");
        htmlContent.append("            <img src=\"img/logo.png\" alt=\"TissHer Visual\">\n");
        htmlContent.append("        </div>\n");
        htmlContent.append("        <h1>TissHer</h1>\n");
        htmlContent.append("        <div class=\"slogan\">Counting women in textile</div>\n");
        
        htmlContent.append("        <div class=\"stats-box\">\n");
        htmlContent.append("            <div class=\"stat-item\">\n");
        htmlContent.append("                <div class=\"stat-number\">").append(totalEntreprises).append("</div>\n");
        htmlContent.append("                <div class=\"stat-label\">Structures</div>\n");
        htmlContent.append("            </div>\n");
        htmlContent.append("            <div class=\"stat-item\">\n");
        htmlContent.append("                <div class=\"stat-number\">").append(totalSalariees).append("</div>\n");
        htmlContent.append("                <div class=\"stat-label\">Travailleuses</div>\n");
        htmlContent.append("            </div>\n");
        htmlContent.append("        </div>\n");
        htmlContent.append("    </header>\n");
        htmlContent.append("    <main>\n");

        // BOUCLE UNIQUE (Génération propre de chaque carte l'une après l'autre)
        for (EntrepriseTextile atelier : entreprises) {
            htmlContent.append("        <div class=\"card\">\n");
            htmlContent.append("            <div class=\"card-content\">\n");
            htmlContent.append("                <h3>").append(atelier.getNom()).append("</h3>\n");
            htmlContent.append("                <div class=\"meta\"><strong>Forme juridique :</strong> ").append(atelier.getFormeJuridique()).append("</div>\n");
            htmlContent.append("                <div class=\"meta\"><strong>Pays :</strong> ").append(atelier.getPays()).append(" &bull; <strong>Création :</strong> ").append(atelier.getAnneeCreation()).append("</div>\n");
            htmlContent.append("                <div class=\"meta\"><strong>Effectif :</strong> ").append(atelier.getEffectif()).append(" travailleuses</div>\n");
            htmlContent.append("                <a href=\"").append(atelier.getSiteInternet()).append("\" target=\"_blank\">Visiter le site &rarr;</a>\n");
            htmlContent.append("            </div>\n");
            htmlContent.append("            <img src=\"img/").append(atelier.getImageUrl()).append("\" alt=\"Logo de ").append(atelier.getNom()).append("\" class=\"card-img\">\n");
            htmlContent.append("        </div>\n");
        }

        htmlContent.append("    </main>\n");
        htmlContent.append("</body>\n");
        htmlContent.append("</html>");

        // 4. Écriture du fichier index.html
        try {
            Files.writeString(Path.of("index.html"), htmlContent.toString());
            System.out.println("Succès : Le fichier index.html a été régénéré !");
        } catch (IOException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}