package be.pxl.h1.opdracht7;

import be.pxl.h1.oefening1.TorenApp;

public class PlanetApp {

    static void main() {
        Planet sun = new Planet();
        sun.setName("Sun");
        sun.setDiameter(1391400);
        sun.setDistanceFromSun(0L);

        Planet earth = new Planet();
        earth.setName("Earth");
        earth.setDiameter(12756);
        earth.setDistanceFromSun(149600000L);

        if (earth.getDistanceFromSun() < sun.getDistanceFromSun()) {
            System.out.println(earth.getName() + " is closer to the sun.");
        } else {
            System.out.println(sun.getName() + " is closer to the sun");
        }

        Planet mars = new Planet();
        mars.setDistanceFromSun(227900000);

        System.out.println(sun.berekenAE() + "AE");
        System.out.println(mars.berekenAE() + "AE");

        System.out.println(mars);
        System.out.println(earth);




    }
}
