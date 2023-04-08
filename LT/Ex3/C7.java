package Ex3;
import java.util.Scanner;
public class C7 {
    static Scanner sc = new Scanner(System.in);
    public static void output(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                System.out.print((char)(s.charAt(i)-32));
            }else if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                System.out.print((char)(s.charAt(i)+32));
            }else{
                System.out.print(s.charAt(i));
            }

        }
    }
    public static void main(String[] args) {
        String s = sc.nextLine();
        output(s);
    }
}
