package TH.Lab1;
import java.util.Scanner;
public class C10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        System.out.print(s.replaceAll(" ", ""));
    }
}
