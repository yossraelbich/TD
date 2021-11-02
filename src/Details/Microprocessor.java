package Details;

public class Microprocessor {
private String marque;
private double vitesse;
private int nbCorps;

    public Microprocessor(String marque, double vitesse, int nbCorps) {
        this.marque = marque;
        this.vitesse = vitesse;
        this.nbCorps = nbCorps;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public int getNbCorps() {
        return nbCorps;
    }

    public void setNbCorps(int nbCorps) {
        this.nbCorps = nbCorps;
    }
}
