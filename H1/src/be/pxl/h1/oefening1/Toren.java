package be.pxl.h1.oefening1;

public class Toren {
    private String naam;
    private String locatie;
    private int voltooiingsJaar;
    private double hoogte;
    private int verdiepingen;

    public Toren(String naam, String locatie, int voltooiingsJaar, double hoogte, int verdiepingen) {
        this.naam = naam;
        this.locatie = locatie;
        this.voltooiingsJaar = voltooiingsJaar;
        this.hoogte = hoogte;
        this.verdiepingen = verdiepingen;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public int getVoltooiingsJaar() {
        return voltooiingsJaar;
    }

    public void setVoltooiingsJaar(int voltooiingsJaar) {
        this.voltooiingsJaar = voltooiingsJaar;
    }

    public double getHoogte() {
        return hoogte;
    }

    public void setHoogte(double hoogte) {
        this.hoogte = hoogte;
    }

    public int getVerdiepingen() {
        return verdiepingen;
    }

    public void setVerdiepingen(int verdiepingen) {
        this.verdiepingen = verdiepingen;
    }
}
