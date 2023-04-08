package TH.Lab1;
import java.util.Scanner;
public class C13{
    static Scanner sc = new Scanner(System.in);
    
    public static void output(String s){
        System.out.print(s.replaceAll(" +", " ").trim());
    }
    
    public static void main(String[] args){
        String s = sc.nextLine();
        output(s);
    }
} 
