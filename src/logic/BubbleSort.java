package logic;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class BubbleSort {
    private Array data;

    public  void start () {

        //create array

        Scanner s = new Scanner(System.in);
        out.println("Please, enter number of elements of the Array: ");
        int n = s.nextInt();
        int array[] = new int[n];

        out.println("Please, enter elements of the Array: ");

        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        data = new Array(array);

        out.println("Your input logic.Array is:" + Arrays.toString(Array.getData()));

//Initialize the method for User
        String param;

        param = Array.enterParam("Please, enter sort parameter: U for upward, D for downward: ");

        while (!param.equals("U") & !param.equals("D")) {
                param = Array.enterParam("Please, re-enter. U for upward, D for downward: ");};

        switch (param) {
                case "U":
                    out.println("Your upward sorting Array is: " + Arrays.toString(upSearch()));
                    break;
                case "D":
                    out.println("Your downward sorting Array is:" + Arrays.toString(downSearch()));
                    break;
                default:
                    out.println("You wrote wrong parameter. Please, try again later.");
                    break;
            }
    }

//upward sorting - arrUS
    private int[] upSearch() {

        int[] arrUS = Array.getData();
        int n = arrUS.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arrUS[j - 1] > arrUS[j]) {
                    temp = arrUS[j - 1];
                    arrUS[j - 1] = arrUS[j];
                    arrUS[j] = temp;
                }
            }
        }
        return arrUS;
    }

//downward sorting - arrDS
    private int[] downSearch() {

        int[] arrDS = Array.getData();
        int n1 = arrDS.length;
        int temp1 = 0;

        for (int a = 0; a < n1; a++) {
            for (int b = 1; b < (n1 - a); b++) {
                if (arrDS[b - 1] < arrDS[b]) {
                    temp1 = arrDS[b - 1];
                    arrDS[b - 1] = arrDS[b];
                    arrDS[b] = temp1;
                }
            }
        }
        return arrDS;
    }
}





