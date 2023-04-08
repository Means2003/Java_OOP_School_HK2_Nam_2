package Ex3;
import java.util.Scanner;
public class C11 {
    static Scanner sc = new Scanner(System.in);
    public static void output(String s){
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = sc.nextLine();
        output(s);
    }  
}
