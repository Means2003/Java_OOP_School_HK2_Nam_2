package TH.Lab1;

import java.util.Scanner;
public class C7 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void operator(int a[]){
        int count = 0;
        for (int i=1;i<a.length-1;i++){
            if (a[i]>a[i-1]&&a[i]>a[i+1]||(a[i]<a[i-1]&&a[i]<a[i+1])){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        operator(a);
    }
}
