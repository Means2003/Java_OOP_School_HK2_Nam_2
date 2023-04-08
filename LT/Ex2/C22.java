package Ex2;
import java.util.Scanner;
public class C22 {
    static Scanner sc = new Scanner(System.in);
    public static void input(char a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.next().charAt(0);
        }
    }

    public static boolean in_rac(char rac[], char x){
        for(int i = 0; i < rac.length; i++){
            if(x == rac[i]) return true;
        }
        return false;
    }


    public static boolean check(char a[], char rac[]){
        int c[][] = new int[2][a.length];
        for(int i = 0; i < a.length; i++){
            char x = a[i];
            int count = 0;
            if(!in_rac(rac, x)){
                c[0][i] = a[i];
                for(int j = 0; j < a.length; j++){
                    if(x == a[j]) count++;
                }
                c[1][i] = count;
            }
        }
        for(int i = 0; i < c[1].length; i++){
            if(c[1][i] > a.length/2){
                System.out.print(Character.toChars(c[0][i]));
                return true;
            }
        }
        return false;
    }

    public static void output(char a[], char rac[]){
        if(!check(a, rac))  System.out.print("none");
    }
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        char a[] = new char[n];
        char rac[] = new char[a.length];
        input(a);
        output(a, rac);
    }
}
