package Ex2;
import java.util.Scanner;
public class C18 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static boolean in_rac(int rac[], int x){
        for(int i = 0; i < rac.length; i++){
            if(rac[i] == x) return true;
        }
        return false;
    }

    public static void output(int a[], int rac[]){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            int x = a[i];
            count = 0;
            for(int j = 0; j < a.length; j++){
                if(x == a[j]) count++;
            }
            if(count % 2 != 0 && !in_rac(rac, x)){
                    System.out.print(x);
                    rac[i] = a[i];
                }
            }
        }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        int rac[] = new int[n];
        input(a);
        output(a, rac);
    }
}
