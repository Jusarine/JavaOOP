package lesson4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tania on 15.07.2016.
 */
public class Directory extends AbstractFSItem{

    private List<FSItem> items = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) {
        checkCyclicDependency(item);

        items.add(item);
        return this;
    }

    private void checkCyclicDependency(FSItem item) {
        if (isCreateCyclicDependency(item)) {
            throw new IllegalArgumentException("Cyclic dependency");
        }
    }

    private boolean isCreateCyclicDependency(FSItem item) {

        // TODO: ����������� �������� �� ������������
        return this == item;
    }

    @Override
    public int getSize() {
        int sizeSum = 0;

        for (FSItem item : items) {
            sizeSum += item.getSize();
        }

        return sizeSum;
    }

    @Override
    public String toString() {
        // TODO: ���������� �������� ������ �������� ��������� � ���� ������
        return "d" + items + "";
    }
}
