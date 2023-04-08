package Ex3;

import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i = 0; i < a.length(); i++){
            if (a.charAt(i) >= 'a' && a.charAt(i) < 'z'){
                System.out.print((char)(a.charAt(i)+1));
            }else if(a.charAt(i)=='z'){
                System.out.print((char)(a.charAt(i)-25));
            }else
                System.out.print(a.charAt(i));
        }
    }
}
