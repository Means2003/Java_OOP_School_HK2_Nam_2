package Ex1;

import java.util.Scanner;

public class C3 {
    public static int findmaxnumber(int a, int b, int c, int d){
        int max = a;
        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(findmaxnumber(a, b, c, d));
    }
}
