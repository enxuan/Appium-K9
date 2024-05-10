package lab_03;

public class MinToMaxArrayShorting {

    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};

        //sort the array by bubble sort
        for (int i = 0; i < intArr.length; i++) {
            for (int t = i + 1; t < intArr.length; t++) {
                if (intArr[i] > intArr[t]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[t];
                    intArr[t] = temp;
                }
            }
        }

        //print array after sort
        for (int i : intArr) {
            System.out.print("   " + i);
        }
    }
}
