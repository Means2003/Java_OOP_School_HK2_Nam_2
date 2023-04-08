package Ex2;
import java.util.Scanner;
public class C21 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[][]){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static byte check(int a[][]){
        int temp = a[0][0];
        int count = 0;
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                temp = a[x][y];
                count = 0;
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(a[i][j] < 1 || a[i][j] > 9) return 0;
                        if(a[i][j] == temp){
                            count++;
                            if(count == 2) return 0;
                        }
                    }
                }
            }
        }
        return 1;
    }

    public static void output(int a[][]){
        System.out.print(check(a));
    }

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        input(a);
        output(a);
    }
}
