package be.pxl.h3;

public class DagApp {
    public static void main(String[] args) {

        System.out.println("--- Overzicht van alle dagen ---");

        for (Dag d : Dag.values()) {
            System.out.printf("Naam: %-10s | Ordinaal: %d | Type: %s%n",
                    d.name(),
                    d.ordinal(),
                    d.getTypeDag()
            );
        }

        System.out.println("\n--- Vergelijking van 2 willekeurige dagen ---");

        Dag dag1 = Dag.WOENSDAG;
        Dag dag2 = Dag.ZATERDAG;

        System.out.println("Dag 1: " + dag1);
        System.out.println("Dag 2: " + dag2);

        if (dag1 == dag2) {
            System.out.println("- De dagen zijn gelijk.");
        } else {
            System.out.println("- De dagen zijn NIET gelijk.");
        }

        if (dag1.compareTo(dag2) < 0) {
            System.out.println("- " + dag1 + " komt voor " + dag2);
        } else if (dag1.compareTo(dag2) > 0) {
            System.out.println("- " + dag2 + " komt voor " + dag1);
        } else {
            System.out.println("- Het is dezelfde dag.");
        }

        int verschil = Math.abs(dag1.ordinal() - dag2.ordinal());

        System.out.println("- Aantal stappen/dagen verschil: " + verschil);
    }
}
