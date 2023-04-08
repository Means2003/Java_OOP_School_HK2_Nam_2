package Ex1;
import java.util.Scanner;
public class C9 {
    public static boolean checkSCP(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) count++;
        }
        if(count % 2 != 0) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(1 + " ");
        for(int i = 4; i <= x; i++){
            if(checkSCP(i)) System.out.print(i + " " );
        }
    }
}
