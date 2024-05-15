package lab_02;

import java.util.Scanner;

public class WeightHeightEvaluation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input your weight: ");
        float weight = scanner.nextFloat();

        System.out.println("input your height: ");
        float height = scanner.nextFloat();

        float BMI = weight / (height * 2);

        System.out.println("your BMI is: " + BMI);

        if (BMI < 18.5f) {
            System.out.println("you are under weight, plz eat more");
        } else if (BMI <= 24.9f) {
            System.out.println("Congratulation, you has normal weight");
        } else if (BMI <= 29.9 ) {
            System.out.println("you are overweight, take care yourself");
        } else {
            System.out.println("you are obesity, plz eat less and practice more, it's urgent");
        }
    }
}
