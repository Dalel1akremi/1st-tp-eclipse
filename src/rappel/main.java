package rappel;

public class main {
    public static void main(String[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Ali", "Sassi", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Sami", "Soussi", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Rami", "Bouaziz", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Jacem", "Zrig", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Jalel", "Fetwi", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Amir", "Ammar", 30, "2001", 45));

        // Affichage des salaires
        p.afficherSalaires();
        System.out.println("Le salaire moyen est de " + p.salaireMoyen() + " dinars.");
    }
}
