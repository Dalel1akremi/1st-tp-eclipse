package rappel;

public class Technicien extends Employe {
    private int nbUnites;

    public Technicien(String nom, String prenom, int age, String dateEntree, int nbUnites) {
        super(nom, prenom, age, dateEntree);
        this.nbUnites = nbUnites;
    }

    @Override
    public double calculerSalaire() {
        return nbUnites * 5; // Salaire basé sur le nombre d'unités produites
    }

    @Override
    public String getNom() {
        return "Le technicien " + getPrenom() + " " + getNomDeFamille();
    }
}

