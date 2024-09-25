package rappel;

public abstract class Employe {

    private String nom;
    private String prenom;
    private int age;
    private String dateEntree;

    public Employe(String nom, String prenom, int age, String dateEntree) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public abstract double calculerSalaire();

    public String getNom() {
        return   prenom + " " + nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDeFamille() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getDateEntree() {
        return dateEntree;
    }
}

