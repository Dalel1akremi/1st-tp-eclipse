package rappel;

public class Vendeur extends Employe {
    private double chiffreAffaire;

    public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return 0.20 * chiffreAffaire + 400;
    }

    @Override
    public String getNom() {
        return "Le vendeur " + getPrenom() + " " + getNomDeFamille();
    }
}