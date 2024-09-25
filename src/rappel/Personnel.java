package rappel;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    private List<Employe> employes; // Liste pour stocker les employés

    public Personnel() {
        employes = new ArrayList<>(); // Initialiser la liste
    }

    // Méthode pour ajouter un employé à la collection
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    // Méthode pour afficher les salaires
    public void afficherSalaires() {
        for (Employe employe : employes) {
            System.out.println(employe.getNom() + " gagne " + employe.calculerSalaire() + " Dinars");
        }
    }

    // Méthode pour calculer le salaire moyen
    public double salaireMoyen() {
        if (employes.isEmpty()) return 0; 
        double total = 0;
        for (Employe employe : employes) {
            total += employe.calculerSalaire();
        }
        return total / employes.size();
    }
}
