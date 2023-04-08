package Ex2;
import java.util.Scanner;
public class C10 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void convert(int a[][], int b[]){
        int index = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                b[index++] = a[i][j];
            }
        }
    }

    public static void output(int a[][], int b[]){
        convert(a, b);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int [n][m];
        int b[] = new int[n*m];
        input(a);
        output(a, b);
    }
}

