package lesson7;

/**
 * Created by Tania on 22.07.2016.
 */
public class PairRunner {

    public static void main(String[] args) {

        Pair <String, Integer> pair1 = new Pair<>("Hello", 20);
        Pair <Integer, Integer> pair2 = new Pair<>(3, 5);

        System.out.println(pair2.getRight());
        System.out.println(pair1.getLeft());
    }
}
