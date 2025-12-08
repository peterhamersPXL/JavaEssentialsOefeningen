package be.pxl.h2.opdracht3;

public class Klasgroep {

    public static final int MAX_STUDENTEN = 40;
    private String naam;
    private int aantalStudenten;

    private static int aantalKlasgroepen = 0;
    private static int totaalAantalStudenten = 0;


    public Klasgroep() {
        this("1TINx", 0);
    }

    public Klasgroep(String naam, int aantalStudenten) { // BASIS
        this.naam = naam;
        setAantalStudenten(aantalStudenten);
        aantalKlasgroepen++;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }

    public void setAantalStudenten(int aantalStudenten) {
        if (aantalStudenten > MAX_STUDENTEN) {
            aantalStudenten = MAX_STUDENTEN;
        }
        totaalAantalStudenten -= this.aantalStudenten;
        totaalAantalStudenten += aantalStudenten;

        this.aantalStudenten = aantalStudenten;
    }

    public static int getAantalKlasgroepen() {
        return aantalKlasgroepen;
    }

    public static int getTotaalAantalStudenten() {
        return totaalAantalStudenten;
    }
}
