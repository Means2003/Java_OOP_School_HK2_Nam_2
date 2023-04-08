package TH.Lab1;
import java.util.Scanner;
public class C2 {
    static Scanner sc = new Scanner(System.in);
    public static void input(float a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextFloat();
            }
        }
    }

    public static void operator(float a[][], float b[][]){
        float max = a[0][0];
        float min = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max) max = a[i][j];
                else if(a[i][j] < min) min = a[i][j];
            }
        }
        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i].length; j++){
                b[i][j] = (a[i][j]-min)/(max-min);
                System.out.print(b[i][j] + " ");
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        float a[][] = new float[n][m];
        float b[][] = new float[n][m];
        input(a);
        operator(a, b);
    }
}
