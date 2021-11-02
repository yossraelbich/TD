package Computers;

import Details.Microprocessor;
import Details.Provider;
import Details.Screen;
import Enumerations.ProductState;
import Enumerations.ScreenType;

public class Computer {
    private long id;
    //composition
    private Microprocessor microprocess;
    private Screen screen;
    private Provider provider;
    private String battery;
    private double price;
    private int RAM;
    private int hardDisck;
    private ProductState state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Microprocessor getMicroprocess() {
        return microprocess;
    }

    public void setMicroprocess(Microprocessor microprocess) {
        this.microprocess = microprocess;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHardDisck() {
        return hardDisck;
    }

    public void setHardDisck(int hardDisck) {
        this.hardDisck = hardDisck;
    }

    public ProductState getState() {
        return state;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    //constructors
    public Computer(String marque, double vitesse, int nbCorps, int id, String nom, String nationalité, double taille, ScreenType type,Provider provider){
        this.id=1;
        this.provider=new Provider(id,nom,nationalité);
        this.microprocess=new Microprocessor( marque,vitesse,nbCorps);
        this.screen=new Screen(taille,type,provider);
        this.battery="";
        this.price=0.0;
        this.hardDisck=0;
        this.RAM=0;
        this.state=ProductState.AVAILABLE;
    }

}
