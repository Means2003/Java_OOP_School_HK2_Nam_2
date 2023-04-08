package TH.Lab1;
import java.util.Scanner;
public class C11 {
    static Scanner sc = new Scanner(System.in);
    public static void output(String name){
        int pos1 = 0;
        name = name.replaceAll(" +", " ").trim();
        for(int i = 0; i < 6; i++){
            if(name.charAt(i) != ' '){
                pos1 = i;
                System.out.print(name.charAt(i));
            }    
            else{
                break;
            }
        }
        System.out.print('\n');
        int pos2 = 0;
        for(int i = name.length() - 1; i >= 0; i--){
            if(name.charAt(i) == ' ') break;
            else pos2 = i;
        }
        for(int i = pos1+2; i < pos2; i++){
            System.out.print(name.charAt(i));
        }
        if(pos2-pos1 > 2)
            System.out.print('\n');
        for(int i = pos2; i < name.length(); i++){
            System.out.print(name.charAt(i));
        }

    }

    public static void main(String[] args) {
        String name = sc.nextLine();
        output(name);
    }
}
