package Ex2;
import java.util.Scanner;
public class C14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String n = sc.nextLine();
        String a[] = n.split(" ");
        System.out.print(a[a.length-1]);
        for(int i = 0; i < a.length-1; i++){
            System.out.print(" " + a[i]);
        }
    }
}
