package rappel;

public class Manutentionnaire extends Employe {
    private int heuresTravaillees;

    public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravaillees) {
        super(nom, prenom, age, dateEntree);
        this.heuresTravaillees = heuresTravaillees;
    }

    @Override
    public double calculerSalaire() {
        return heuresTravaillees * 65; // Salaire basé sur le nombre d'heures travaillées
    }

    @Override
    public String getNom() {
        return "Le manut. " + getPrenom() + " " + getNomDeFamille();
    }
}



