package Ex1;
import java.util.Scanner;
public class C8 {
    public static int findFn(int n){
        int fn = 0;
        int fn_1 = 1;
        int fn_2 = 1;
        for(int i = 3; i < n+1; i++){
            fn = fn_2 + fn_1;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        return fn;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findFn(n));
    }
    
}
