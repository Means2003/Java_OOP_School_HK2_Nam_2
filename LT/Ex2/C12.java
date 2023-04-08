package Ex2;
import java.util.Scanner;
public class C12 {
    static Scanner sc = new Scanner(System.in);
    public static int input(){
        int n = sc.nextInt();
        return n;
    }

    public static void encryption(){
        int x = input();
        int n = 0;
        int y = x;
        int count = 0;
        while(y!=0){
            n++;
            y /= 10;
        }
        int arr[] = new int [n];
        int x_y[][] = new int [2][n];
        for(int i = arr.length - 1 ; i >= 0; i--){
            arr[i] = x % 10;
            x_y[0][i] = arr[i];
            x /= 10;
        }

        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if(x_y[0][i] == arr[j]){
                    count++;
                }
            }
            x_y[1][i] = count;
        }

        for(int i = 0; i < x_y[1].length; i++){
            System.out.print(x_y[1][i]);
        }

    }

    public static void main(String[] args) {
        encryption();
    }
}
