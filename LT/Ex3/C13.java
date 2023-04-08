package Ex3;

import java.util.Scanner;
public class C13{
    static Scanner sc = new  Scanner(System.in);
    public static void main(String[] args){
        String s = sc.nextLine();
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
