package TH.Lab1;
import java.util.Scanner;
public class C8 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static int operator(int[] a, int x){
        int count = 0;
        for (int d : a) {
            if(d == x) {
                count++;
            }
        }
        return count;
    }
    
    public static void main (String[]agrs) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        for(int i=0; i < a.length; i++){
            boolean check = true;
            for (int j = 0; j < i; j++)      
                if(a[j]==a[i])
                    check = false;
            if(check)
                System.out.println(a[i]+" "+operator(a, a[i]));
        }
    }
}