package Ex2;
import java.util.Scanner;
public class C2 {
    static Scanner sc = new Scanner(System.in);
    public static int input(int n, int a[][]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
                if(j > i)
                    sum += a[i][j];
            }
        }
        return sum;
    }
    
    public static void output(int a[][], int n){
        System.out.print(input(n, a));
    }

    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        int a[][] = new int[n][n];
        output(a, n);
    }
}
