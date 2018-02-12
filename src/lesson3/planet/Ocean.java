package lesson3.planet;

/**
 * Created by Tania on 12.07.2016.
 */
public class Ocean {

    private String name;
    private long area;

    public Ocean (String name, long area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
