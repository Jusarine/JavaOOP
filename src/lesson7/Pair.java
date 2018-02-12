package lesson7;

/**
 * Created by Tania on 22.07.2016.
 */

/*
Написать класс Pair<L, R>, хранящий пару значений (L left, R right). Объекты класса Pair должны быть неизменяемые (Immutable).
 Написать клиентский код, демонстрирующий работу Pair.
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
