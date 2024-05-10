package lab_03;

public class MaxAndMinInArray {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 0, 9};

        int max = intArr[0], min = intArr[0];

        for (int i : intArr) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        System.out.printf("the Maximum number: %d, the Minimum number: %d", max, min);
    }
}
