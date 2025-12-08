package be.pxl.h2.opdracht3;

public class KlasgroepApp {

    public static void main(String[] args) {

        System.out.println("Het maximum aantal studenten in een klas is " + Klasgroep.MAX_STUDENTEN);

        Klasgroep[] groepen = new Klasgroep[3];

        groepen[0] = new Klasgroep("1TINA", 23);
        groepen[1] = new Klasgroep("1TINB", 19);
        groepen[2] = new Klasgroep("1TINC", 60);

        // ▶ setAantalStudenten corrigeert het totaal automatisch
        groepen[0].setAantalStudenten(55);

        for (Klasgroep klasgroep : groepen) {
            System.out.println(klasgroep.getNaam() + ": " + klasgroep.getAantalStudenten());
        }

        // ▶ Aantal klasgroepen
        System.out.println("\nAantal klasgroepen: " + Klasgroep.getAantalKlasgroepen());

        // ▶ Totaal aantal studenten
        System.out.println("Totaal aantal studenten: " + Klasgroep.getTotaalAantalStudenten());

        // ▶ 1 student toevoegen aan klas 1TINB
        groepen[1].setAantalStudenten(groepen[1].getAantalStudenten() + 1);

        System.out.println("\nNa toevoegen van 1 student aan 1TINB:");
        System.out.println("Totaal aantal studenten: " + Klasgroep.getTotaalAantalStudenten());

        // ▶ Gemiddelde berekenen
        double gemiddelde = (double) Klasgroep.getTotaalAantalStudenten()
                / Klasgroep.getAantalKlasgroepen();

        System.out.printf("Gemiddeld aantal studenten per klasgroep: %.1f\n", gemiddelde);
    }
}
