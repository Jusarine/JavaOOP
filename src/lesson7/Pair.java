package lesson7;

/**
 * Created by Tania on 22.07.2016.
 */

/*
�������� ����� Pair<L, R>, �������� ���� �������� (L left, R right). ������� ������ Pair ������ ���� ������������ (Immutable).
 �������� ���������� ���, ��������������� ������ Pair.
 */
public class Pair <L, R> {

    private L left;
    private R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }
}
