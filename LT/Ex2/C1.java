package Ex2;
import java.util.Scanner;
import java.lang.Math;
public class C1 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int n, int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void output(int a[][]){
        for(int i = 0; i < a.length; i++){
            if((a[i][i]>=0) && (Math.sqrt(a[i][i]) == (int)Math.sqrt(a[i][i])))
                System.out.print(a[i][i] + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        n = sc.nextInt();
        int a[][] = new int[n][n];
        input(n, a);
        output(a);
    }
}
