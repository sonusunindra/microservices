package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        System.out.println("size of array is " + j);
        int arr[] = new int[j];
        int n = 0;
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.nextLine();
        System.out.println(str1);
        StringTokenizer strtk = new StringTokenizer(str1);
        while (strtk.hasMoreElements()) {
            int i = (Integer.parseInt((String) strtk.nextElement()));
            System.out.println(i);
            if(i<1||i>100) {System.exit(0);}
            arr[n++] = i;

        }
        /*System.out.println("printing array as follow");
        for (int k : arr
                ) {
            System.out.println(k);
        }*/
        Arrays.sort(arr);
        System.out.println("printing sorted array as follow");
        for (int k : arr
                ) {
            System.out.println(k);
        }
        sc1.close();
    }


}
