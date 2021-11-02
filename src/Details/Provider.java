package Details;

public class Provider {
    private int id;
    private String nom;
    private String nationalité;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNationalité() {
        return nationalité;
    }

    public void setNationalité(String nationalité) {
        this.nationalité = nationalité;
    }

    public Provider(int id, String nom, String nationalité) {
        this.id = id;
        this.nom = nom;
        this.nationalité = nationalité;
    }
}
