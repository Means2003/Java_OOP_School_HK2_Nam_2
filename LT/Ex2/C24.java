package Ex2;
import java.util.Scanner;
import java.lang.Math;
public class C24 {
    static Scanner sc = new Scanner(System.in);
    
    public static int check_Harshad(int n){
        int x = n;
        int sum = 0;
        while(x != 0){
            sum += x % 10;
            x /= 10;
        }
        if(n % sum == 0){
            return n/sum;
        }
        return 0;
    }

    public static boolean check_Moran(int n){
        if(check_Harshad(n)!=0){
            int s = check_Harshad(n);
            if(s < 2) return false;
            for(int i = 2; i <= Math.sqrt(s); i++){
                if(s % i == 0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void output(int n){
        if(check_Moran(n)){
            System.out.print('M');
        }else if(check_Harshad(n)!=0)
            System.out.print('H');
        else
            System.out.print("Neither");
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        output(n);
    }
}
