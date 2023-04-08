package Ex2;
import java.util.Scanner;
public class C19 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void Sort(int a[]){
        int min = 0;
        for(int i = 0; i < a.length; i++){
            min = i;
            for(int j = i+1; j < a.length; j++){
                if(a[min] > a[j]) min = j;
            }
            if(min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    public static byte check(int a[]){
        Sort(a);
        for(int i = 1; i < a.length; i++){
            if(a[i]-1 != a[i-1]) return 0;
        }
        return 1;
    }

    public static void output(int a[]){
        System.out.print(check(a));
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        output(a);
    }
}
