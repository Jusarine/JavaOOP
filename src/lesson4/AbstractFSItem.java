package lesson4;

/**
 * Created by Tania on 15.07.2016.
 */
public abstract class AbstractFSItem implements FSItem {

    private String name;

    public AbstractFSItem() {
    }

    public AbstractFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
