package lesson1.monthNumber;

import java.util.Scanner;

/**
 * Created by Tania on 01.07.2016.
 */
/*
 Ввести число от 1 до 12.
 Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */
public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12:");
        int n = sc.nextInt();

        check(n);
        monthNum(n);
    }
    public static void monthNum(int n){
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String s = month[n-1];
        System.out.println(s);
    }
    public static void check(int n){
        if (n>12 || n<1) {
            System.out.println("Incorrect number");
            System.exit(0);
        }
    }
}
