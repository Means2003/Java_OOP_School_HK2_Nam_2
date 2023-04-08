package Ex2;
import java.util.Scanner;

public class C7 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[][], int n, int matrix[]){
        for(int i = 0; i < n; i++){
            for(int j =  0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int x = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[x++] = a[i][j];
            }
        }
    }

    public static void operator(int n, int matrix[], int m){
        int max = 0;
        for(int i = 0; i < n*m; i++){
            max = i;
            for(int j = i+1; j < n*m; j++){
                if(matrix[max] < matrix[j])   max = j;
            }
            if(max != i){
                int c = matrix[max];
                matrix[max] = matrix[i];
                matrix[i] = c;
            }
        }
    }

    public static void output(int matrix[], int n, int m){
        int count = 0;
        for(int i = 0; i < n*m; i++){
            System.out.print(matrix[i] + " ");
            count++;
            if(count == n){
                System.out.print("\n");
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int matrix[] = new int[n*m];
        input(a, n, matrix);
        operator(n, matrix, m);
        output(matrix, n, m);
    }
}
