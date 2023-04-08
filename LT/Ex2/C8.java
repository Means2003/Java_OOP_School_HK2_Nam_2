package Ex2;
import java.util.Scanner;

public class C8 {
    static Scanner sc = new Scanner(System.in);

    public static void input(String a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.next();
            }
        }
    }

    public static String get_index(String a[][]){
        int m = sc.nextInt();
        int index = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(index == m){
                    return a[i][j];
                }
                index++;
            }
        }
        return "";
    }

    public static void output(String a[][]){
        System.out.print(get_index(a));
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        String s = sc.nextLine();
        String a[][] = new String[n][n];
        input(a);
        output(a);
    }
}
