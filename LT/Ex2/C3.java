package Ex2;

import java.util.Scanner;
public class C3 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int n, int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static int countmaxnumber(int a[][], int n, int m){
        int max = a[0][0], count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                    count = 1;
                }else if(max == a[i][j]) count++;
            }
        }
        return count;
    }
    
    public static void output(int a[][], int n, int m){
        System.out.print(countmaxnumber(a, n, m));
    }

    public static void main(String[] args) {
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int a[][] = new int[n][m];
        input(n, a);
        output(a, n, m);
    }
}
