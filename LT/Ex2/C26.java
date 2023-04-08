package Ex2;

import java.util.Scanner;
public class C26 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void output(int a[]){
        for(int i = 1; i < a.length-1; i++){
            if(a[i]>a[i-1] && a[i] > a[i+1]){
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        output(a);
    }
}
