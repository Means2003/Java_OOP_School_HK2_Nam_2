package Ex3;

import java.util.Scanner;
public class C12{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String s = sc.nextLine();
        int pos = sc.nextInt();
        int size = sc.nextInt();
        System.out.print(s.substring(pos, pos+size));
    }
}