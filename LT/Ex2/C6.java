package Ex2;
import java.util.Scanner;
public class C6 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static boolean is_perfect_number(int x){
        int sum = 1;
        if(x == 1) return false;
        for(int i = 2; i < x; i++){
            if(x % i == 0) sum += i;
        }
        if(x == sum) return true;
        return false;
    }

    public static void output(int a[]){
        for(int i = 0; i < a.length; i++){
            if(is_perfect_number(a[i])) System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        output(a);
    }
}

