package Ex3;

import java.util.Scanner;
public class C9 {
    static Scanner sc = new Scanner(System.in);

    public static void output(String s1, String s2){
        int pos =  sc.nextInt();
        for(int i = 0; i < pos; i++){
            System.out.print(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++){
            System.out.print(s2.charAt(i));
        }
        for(int i = pos; i < s1.length(); i++){
            System.out.print(s1.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        output(s1, s2);
    }
}
