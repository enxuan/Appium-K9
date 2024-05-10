package lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intArr = new ArrayList<>();
        boolean b = true;

        // Menu: 1: input number to array list, 2: print numbers, 3: get max number, 4: get min number
        //    5: get number's postion

        while(b) {
            System.out.println("Input your Option, 1: insert, 2: print, 3: get max, 4: get min, 5: get number index");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("plz input your insert number :");
                    int num = scanner.nextInt();
                    insert(intArr, num);
                    break;
                case 2:
                    printAll(intArr);
                    break;
                case 3:
                    int max = getMax(intArr, 1);
                    System.out.println("the max number: " + max);
                    break;
                case 4:
                    int min = getMax(intArr, 0);
                    System.out.println("the min number: " + min);
                    break;
                case 5:
                    System.out.println("input number you want to find index: ");
                    int searchNum = scanner.nextInt();
                    int idx = getNumberIndex(intArr, searchNum);
                    if (idx == -1) {
                        System.out.println("the number you insert do not exist in the list");
                    } else {
                        System.out.printf("the number: %d has index: %d", searchNum, idx);
                    }
                    break;
                default:
                    System.out.println("the option is invalid, plz try again");
                    b = false;
                    break;
            }
        }
    }

    private static void insert(List<Integer> list, int number) {
        list.add(number);
    }

    private static void printAll(List<Integer> list) {
        for (Integer i : list) {
            System.out.print("   " + i);
        }
        System.out.println("all done");
    }

    private static int getMax(List<Integer> list, int option) {
        //option  0: return min, 1: return max
        int max = list.get(0);
        int min = list.get(0);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }

        //check option for return
        if (option == 1) return max;
        return min;
    }

    private static int getNumberIndex(List<Integer> list, int number) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) == number){
                return index;
            }
        }
        //if can't find number, we will return -1
        return -1;
    }
}
