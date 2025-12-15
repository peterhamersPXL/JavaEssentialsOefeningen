package be.pxl.h4.oefening2;

public class Pokemon {
    private String naam;
    private String type;

    public Pokemon(String naam, String type) {
        this.naam = naam;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return naam + " (" + type + ")";
    }
}
