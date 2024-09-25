package rappel;

public class ManutARisque extends Manutentionnaire implements EmployeARisque {

    public ManutARisque(String nom, String prenom, int age, String dateEntree, int heuresTravailles) {
        super(nom, prenom, age, dateEntree, heuresTravailles);  // Appel au constructeur de Manutention
    }

    @Override
    public double calculerSalaire() {
        // Ajout de la prime de risque au salaire de base
        return super.calculerSalaire() + PRIME_DE_RISQUE;
    }

    @Override
    public String getNom() {
        return "Le manut. " + getPrenom() + " " + getNomDeFamille();
    }
}




