package Ex3;

import java.util.Scanner;
public class C3 {
    static Scanner sc = new  Scanner(System.in);

    public static void operator(int n, String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                count = 0;
                // System.out.println(s.charAt(i) + "-");
                for(int j = 0; j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        count++;
                    }
                }
                // System.out.println(count);
                if(count == n){
                    System.out.print(s.charAt(i));
                    break;
                }
            }
        }
    }

    public static void output(int n, String s){
        operator(n, s);
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        int n = sc.nextInt();
        output(n, s);
    }
}
