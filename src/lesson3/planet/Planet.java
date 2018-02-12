package lesson3.planet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 12.07.2016.
 */

/*
Создать объект класса Планета, используя классы Материк, Океан, Остров. Методы: вывести на консоль название материка, планеты, количество материков.
 */
public class Planet {

    private String name;
    List<Island> islands = new ArrayList<>();
    List<Ocean> oceans = new ArrayList<>();
    List<Continent> continents = new ArrayList<>();

    public Planet (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addIsland(Island island) {
        islands.add(island);
    }

    public void addOcean(Ocean ocean) {
        oceans.add(ocean);
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public void printPlanetName() {
        System.out.println("Planet name: " + getName());
    }

    public void printContinentsNumber() {
        System.out.println("Continents number: " + continents.size());
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", islands=" + islands +
                ", oceans=" + oceans +
                ", continents=" + continents +
                '}';
    }
}
