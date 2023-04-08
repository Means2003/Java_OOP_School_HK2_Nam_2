package Ex2;
import java.util.Scanner;
public class C5 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[][], int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void output(int a[][], int n, int m){
        boolean check = true;
        for(int i = 0; i < n; i++){
            check = true;
            for(int j = 0; j < m; j++){
                if(a[i][j] % 2 == 0){
                    check = false;
                    break;
                }
            }
            if(check)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        input(a, n, m);
        output(a, n, m);
    }
}
