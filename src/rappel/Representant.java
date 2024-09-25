package rappel;

public class Representant extends Employe {
    private double chiffreAffaires;

    public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaires) {
        super(nom, prenom, age, dateEntree);
        this.chiffreAffaires = chiffreAffaires;
    }

    @Override
    public double calculerSalaire() {
        return 0.2 * chiffreAffaires + 800; // 20% du chiffre d'affaires + 800 Dinars
    }

    @Override
    public String getNom() {
        return "Le representant " + getPrenom() + " " + getNomDeFamille();
    }
}


