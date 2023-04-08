package Ex2;
import java.util.Scanner;
public class C13 {
    static Scanner sc = new Scanner(System.in);

    public static int input(){
        int n = sc.nextInt();
        return n;
    }

    public static void output(){
        int x = input();
        int a[][] = new int[x][x];
        if(x == 0) System.out.print("[]");
        for(int i = 0; i < a.length; i++){
            System.out.print('[');
            for(int j = 0; j < a[i].length; j++){
                System.out.print(x);
                if(j != a[i].length - 1 )
                    System.out.print(", ");
            }
            System.out.print("]\n");
        }
    }

    public static void main(String[] args) {
        output();
    }
}
