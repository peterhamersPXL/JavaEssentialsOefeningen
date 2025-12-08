package be.pxl.h1.oefening1;

public class TorenApp {
    static void main() {
        Toren torenApp = new Toren("Zuidertoren", "Sint-Gillis (brussel)", 1967, 150.0, 37);
        System.out.println("Naam: " + torenApp.getNaam());
        System.out.println("Locatie: " + torenApp.getLocatie());
        System.out.println("Voltooiiingsjaar: " + torenApp.getVoltooiingsJaar());
        System.out.println("Hoogte (m): " + torenApp.getHoogte());
        System.out.println("Verdiepingen: " + torenApp.getVerdiepingen());
    }
}
