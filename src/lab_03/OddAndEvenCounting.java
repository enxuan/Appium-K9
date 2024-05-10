package lab_03;

public class OddAndEvenCounting {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int oddNum = 0, evenNum = 0;

        for (int j : intArr) {
            if (j % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }
        }

        System.out.printf("The Odd number is : %d, the Even number is: %d", oddNum, evenNum);
    }
}
