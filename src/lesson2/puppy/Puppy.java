package lesson2.puppy;

/**
 * Created by Tania on 06.07.2016.
 */
/*
�������  ������  ������ �����,  ���������  ������  ��������,  ������. ������: ������� �� ������� ���, ������ �����, �������, ������, ������.
 */
public class Puppy extends Dog {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.setName("Aki");
        puppy.printName();
        puppy.voice();
        puppy.jump();
        puppy.run();
        puppy.bite();
    }
}
