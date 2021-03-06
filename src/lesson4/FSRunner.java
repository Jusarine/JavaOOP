package lesson4;

/**
 * Created by Tania on 15.07.2016.
 */
public class FSRunner {

    public static void main(String[] args) {
        Directory root = new Directory()
                .add(new Directory()
                                .add(new File(10))
                                .add(new File(20))
                )
                .add(new Directory()
                                .add(new Directory()
                                                .add(new File(30))
                                )
                )
                .add(new File(50))
                .add(new Symlink(new File(10)));

        System.out.println(root);
        System.out.println("size = " + root.getSize());
    }
}