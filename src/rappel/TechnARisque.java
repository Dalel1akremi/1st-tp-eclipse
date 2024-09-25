package rappel;

public class TechnARisque extends Technicien implements EmployeARisque {

    public TechnARisque(String nom, String prenom, int age, String dateEntree, int nbUnites) {
        super(nom, prenom, age, dateEntree, nbUnites);
    }

    @Override
    public double calculerSalaire() {
        // Ajoute la prime de risque au salaire de base
        return super.calculerSalaire() + PRIME_DE_RISQUE;
    }

    @Override
    public String getNom() {
        return "Le technicien " + getPrenom() + " " + getNomDeFamille();
    }
}





