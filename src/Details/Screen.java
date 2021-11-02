package Details;

import Enumerations.ScreenType;

public class Screen {
   private double taille;
   private ScreenType type;
   private Provider provider;

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public ScreenType getType() {
        return type;
    }

    public void setType(ScreenType type) {
        this.type = type;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Screen(double taille, ScreenType type, Provider provider) {
        this.taille = taille;
        this.type = type;
        this.provider = provider;
    }
}
