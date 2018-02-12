package lesson2.puppy;

/**
 * Created by Tania on 06.07.2016.
 */
public class Dog extends Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("I'm " + getName());
    }

    @Override
    public void voice() {
        System.out.println("Woof, woof, woof!");
    }

    @Override
    public void jump() {
        System.out.println("Jump");
    }

    @Override
    public void run() {
        System.out.println("Run");
    }

    @Override
    public void bite() {
        System.out.println("Bite");

    }
}
