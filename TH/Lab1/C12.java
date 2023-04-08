package TH.Lab1;
import java.util.Scanner;
public class C12 {
    static Scanner sc = new Scanner(System.in);
    public static void output(String path){
        for(int i = path.length()-1; i >= 0; i--){
            if(path.charAt(i) == '/' || path.charAt(i) == '\\'){
                for(int x = i+1; x < path.length(); x++){
                    System.out.print(path.charAt(x));
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        String path = sc.nextLine();
        output(path);
    }
}
