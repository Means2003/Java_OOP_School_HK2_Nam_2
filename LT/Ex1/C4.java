package Ex1;
import java.util.Scanner;
public class C4 {
    public static int tienhoahong(int hh){
        if(hh < 5000) return hh*10/100;
        else if(hh < 10000) return hh*8/100;
        else return hh*5/100;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        System.out.print(tienhoahong(hh));
    }
}
