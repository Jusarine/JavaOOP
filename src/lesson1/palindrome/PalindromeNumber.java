package lesson1.palindrome;

import java.util.Scanner;

/**
 * Created by Tania on 01.07.2016.
 */
//Ввести N чисел с консоли. Среди чисел найти число-палиндром. Если таких чисел больше одного,  найти второе.

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers:");
        int n = sc.nextInt();

        isPalindrome(n, sc);
    }
    public static void isPalindrome(int n, Scanner sc){
        for (int i = 0; i < n; i++){
            System.out.println("Enter the number:");
            int j = sc.nextInt();
            String s = Integer.toString(j);
            String[] sj = s.split("");

            if (!(sj.length == 1) && sj[0].equals(sj[sj.length-1])) {
                System.out.println("Palindrome-number: " + j);
            }else System.out.println("The number isn't a palindrome.");
        }
    }
}
