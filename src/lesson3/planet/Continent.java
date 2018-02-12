package lesson3.planet;

/**
 * Created by Tania on 12.07.2016.
 */
public class Continent {

    private String name;
    private int territory;
    private long population;

    public Continent(String name, int territory, long population) {
        this.name = name;
        this.territory = territory;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTerritory() {
        return territory;
    }

    public void setTerritory(int territory) {
        this.territory = territory;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", territory=" + territory +
                ", population=" + population +
                '}';
    }
}
