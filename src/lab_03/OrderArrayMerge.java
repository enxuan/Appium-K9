package lab_03;

public class OrderArrayMerge {

    public static void main(String[] args) {
        int[] intArr1 = {1, 12, 16, 28, 34, 0, 39, 48, 100, 200};
        int[] intArr2 = {1, 13, 16, 27, 99};

        // declare the merge array
        int[] mergeArr = new int[intArr1.length + intArr2.length];

        int i1 = 0, i2 = 0, mindex = 0;

        while (i1 < intArr1.length) {
            if (intArr1[i1] < intArr2[i2]) {
                mergeArr[mindex++] = intArr1[i1++];
            } else {
                mergeArr[mindex++] = intArr2[i2++];
            }

            if (i2 == intArr2.length) break;
        }

        // assign the rest item in array
        for (int i = i1; i < intArr1.length; i++) {
            mergeArr[mindex++] = intArr1[i];
        }
        for (int i = i2; i < intArr2.length; i++) {
            mergeArr[mindex++] = intArr2[i];
        }

        System.out.println("the array after merge:");
        for (int i : mergeArr) {
            System.out.print("   " + i);
        }
    }
}
