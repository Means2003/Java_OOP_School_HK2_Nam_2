package Ex2;

import java.util.Scanner;
public class C25 {
    static Scanner sc = new Scanner(System.in);

    public static void input(byte a[]){
        for(byte i = 0; i < a.length; i++){
            a[i] = sc.nextByte();
        }
    }

    public static boolean check(byte a[]){
        int s = 0;
        boolean check = true;
        for(int i = 0; i < a.length; i++){
            s += a[i];
            if(i < 2){
                if(a[i]>10) check = false;
            }else if(i < 4){
                if(a[i]>20) check = false;
            }else if(i < 6){
                if(a[i] > 25) check = false;
            }else{
                if(a[i] > 30) check = false;
            }
        }
        if(check && s <= 120) return true;
        return false;
    }

    public static void output(byte a[]){
        if(check(a)) System.out.print("qualified");
        else
            System.out.print("disqualified");
    }

    public static void main(String[] args) {
        byte a[] = new byte[8];
        input(a);
        output(a);
    }
}
