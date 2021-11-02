package Computers;


public class Computers {
    Computer tabC[];
    private static int nbComp;
    private final int maxComp=100;

    public Computers(Computer[] tabC) {
        this.tabC = tabC;
    }

    public Computer[] getTabC() {
        return tabC;
    }

    public void setTabC(Computer[] tabC) {
        this.tabC = tabC;
    }

    public static int getNbComp() {
        return nbComp;
    }

    public static void setNbComp(int nbComp) {
        Computers.nbComp = nbComp;
    }

    public int getMaxComp() {
        return maxComp;
    }
}
