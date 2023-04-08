package Ex2;

import java.util.Scanner;
public class C11 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static int operator(int a[], int b[], int min){
        
        for(int i = 0; i < a.length; i++){
            a[i] = a[i]/b[i];
        }
        min = a[0];
        for(int i = 1; i < a.length; i++){
            if(min > a[i])  min = a[i];
        }
        return min;
    }

    public static void output(int a[], int b[], int min){
        System.out.print(operator(a, b, min));
    }

    public static void main(String[] args) {
        int a[] = new int[3];
        int b[] = {4, 1, 2};
        int min = 0;
        input(a);
        output(a, b, min);
    }
}
