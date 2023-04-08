package TH.Lab1;
import java.util.Scanner;
public class C5 {
    static Scanner sc = new Scanner(System.in);
    public static void input(float a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextFloat();
        }
    }

    public static void operator(float a[]){
        for(int i = 0;i < a.length; i++){
            if(a[i] < 0) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        float a[] = new float[n];
        input(a);
        operator(a);
    }
}
