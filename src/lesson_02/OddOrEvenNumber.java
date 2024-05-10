package lesson_02;

import java.util.Scanner;

public class OddOrEvenNumber {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("input the integer number you want to check: ");
        int num = scanner.nextInt();

        //check google can 0 is even number
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
