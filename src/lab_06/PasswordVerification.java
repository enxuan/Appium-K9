package lab_06;

import java.util.Scanner;

public class PasswordVerification {

    public static void main(String[] args) {
        String myPassword = "Password123";

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("plz input your password:");
            String input = scanner.nextLine();
            if (input.equals(myPassword)) {
                System.out.println("you pass is correct!!!");
                break;
            }
            System.out.println("Well, the inputted password is wrong, plz try again.");

        }
    }
}
