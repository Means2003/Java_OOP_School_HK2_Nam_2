package Ex1;
import java.util.Scanner;
import java.lang.Math;
public class C7 {
    public static boolean CheckSNT(int n){
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void printSNT(int n){
        for(int i = 0; i < n; i++){
            if(CheckSNT(i)) System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSNT(n);
    }
}
