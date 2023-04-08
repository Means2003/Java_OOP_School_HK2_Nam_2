package Ex2;
import java.util.Scanner;
public class C23 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void Sort(int a[]){
        for(int i = 0; i < a.length; i++){
            int min = i;
            for(int j = i+1; j < a.length; j++){
                if(a[min] > a[j]) min = j;
            }

            if(min != i){
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void output(int a[], int b[]){
        int c[] = new int[a.length+b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = a.length; i < a.length+b.length; i++){
            c[i] = b[i-a.length];
        }
        Sort(c);
        boolean check = true;
        for(int i = 1; i < c.length; i++){
            if(c[i]-1 != c[i-1]){
                check = false;
                break;
            }
        }
        if(check) System.out.print(1);
        else
            System.out.print(0);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        int m = sc.nextInt();
        int b[] = new int[m];
        input(b);
        output(a, b);
    }   
}
