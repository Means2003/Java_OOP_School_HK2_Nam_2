package Ex2;
import java.util.Scanner;
public class C27 {
    static Scanner sc = new Scanner(System.in);
    
    public static void input(String a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextLine();
        }
    }

    public static void output(String a[]){
        for(int i = 0; i < a.length; i++){
            if(a[i].charAt(a[i].length()-1) == 'F'){
                if(Integer.parseInt(a[i].substring(0, a[i].length()-1)) >= 212){
                    System.out.print("True\nOFF\n");
                    break;
                }else{
                    System.out.print("False\n");
                }
            }else{
                if(Integer.parseInt(a[i].substring(0, a[i].length()-1)) >= 100){
                    System.out.print("True\nOFF\n");
                    break;
                }else{
                    System.out.print("False\n");
                }
            }
            if(i == a.length-1)
                System.out.print("OFF");
        }
    }

    public static void main(String[] args) {
        String a[] = new String[6];
        input(a);
        output(a);
    }
}
