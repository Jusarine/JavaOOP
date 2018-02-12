package lesson3.planet;

/**
 * Created by Tania on 12.07.2016.
 */
public class PlanetRunner {
    public static void main(String[] args) {

        Planet earth = new Planet("Earth");

        createIslands(earth);
        createOceans(earth);
        createContinents(earth);

        earth.printPlanetName();
        earth.printContinentsNumber();
        //System.out.println(earth.toString());
    }

    public static void createIslands(Planet planet) {

        planet.addIsland(new Island("Greenland", 790000));
        planet.addIsland(new Island("New Guinea", 790000));
    }

    public static void createOceans(Planet planet) {

        planet.addOcean(new Ocean("Atlantic Ocean", 106400000));
        planet.addOcean(new Ocean("Pacific Ocean", 165250000));
        planet.addOcean(new Ocean("Indian Ocean", 70560000));
    }

    public static void createContinents (Planet planet) {

        planet.addContinent(new Continent("Eurasia", 54759000, 504100000));
        planet.addContinent(new Continent("Asia", 544579000, 416425200));
        planet.addContinent(new Continent("South America", 17840000, 385742000));
        planet.addContinent(new Continent("North America", 24709000, 56526500));
        planet.addContinent(new Continent("Africa", 30370000, 1100000000));
        planet.addContinent(new Continent("Australia", 7692024, 24139900));
        planet.addContinent(new Continent("Antarctica", 14000000, 4500));
    }
}
