package Ex2;

import java.util.Scanner;
public class C4 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[][], int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void delak(int a[][], int n, int m){
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == k) break;
                System.out.print(a[i][j] + " ");
            }
            if(i != k)
                System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        input(a, n, m);
        delak(a, n, m);
    }
}
