package TH.Lab1;
import java.util.Scanner;
public class C1 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static int find_max(int a[][]){
        int max = a[0][0];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(max < a[i][j]) max = a[i][j];
            }
        }
        return max;
    }

    public static int count_max(int a[][]){
        int max = find_max(a);
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(max == a[i][j]) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        input(a);
        System.out.print(count_max(a));
    }
}
