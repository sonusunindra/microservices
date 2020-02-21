package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ProfitArr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nod=sc.nextLine();
        //System.out.println("nod-->"+nod);
        String profits=sc.nextLine();
        //System.out.println("profits-->"+profits);
        int arr[] = new int[Integer.parseInt(nod)];
        int n = 0;
        StringTokenizer strtk = new StringTokenizer(profits);
        while (strtk.hasMoreElements()) {
            int i = (Integer.parseInt((String) strtk.nextElement()));
            //System.out.println(i);
            arr[n++] = i;
        }
        int noq=Integer.parseInt(sc.nextLine());
        for(int i=0;i<noq;i++){
            String range=(sc.nextLine());
            StringTokenizer ranges = new StringTokenizer(range);
            int l=Integer.parseInt((String)ranges.nextElement());
            int r=Integer.parseInt((String)ranges.nextElement());
            int counter=0;
            for(int j=0;j<arr.length;j++){
                if(l<=arr[j]&& arr[j]<=r){
                    //System.out.println(arr[j]);
                    counter++;
                }
            }
            System.out.println(counter);
        }


    }
    static void m1(int l,int k){
        for(int i=l;l<=k;l++){

        }
    }
}
