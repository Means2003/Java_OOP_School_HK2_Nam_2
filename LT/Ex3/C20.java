package Ex3;
import java.util.Scanner;
public class C20 {
    static Scanner sc = new Scanner(System.in);
    

    public static void output(String s){
        String name[] = s.split(" ");        
        String rac[] = new String[name.length];
        int index = 0;
        boolean check = false;
        for(int i = 0; i < name.length; i++){
            check = false;
            for(int x = 0; x < rac.length; x++){
                if(name[i].equals(rac[x])){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.print(name[i] + " ");
                rac[index] = name[i];
                index++;
            }
        }
        
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        output(s);
    }
}
