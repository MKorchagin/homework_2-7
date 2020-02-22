package logic;

import java.util.Scanner;

public class Array {
    private static int[] data;
    private int length;
    private String message;

//init of Array
    public  Array(int[] data){
        this.data = data;
        this.length = length;
    }

//enter String param
    public static String enterParam (String message) {

        System.out.print(message);
        Scanner s1 = new Scanner(System.in);
        return s1.nextLine();
    }

    public static int [] getData() {return data;}
}
