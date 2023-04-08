package Ex3;

import java.util.Scanner;
public class C22 {
    static Scanner sc = new Scanner(System.in);

    public static void output(String s, int k){
        for(int i = 0; i < s.length(); i++){
            if ((s.charAt(i) >= 'a' && s.charAt(i) < 'z')||(s.charAt(i) >= 'A' && s.charAt(i) < 'Z')){
                int x = 1;
                while(x <= k){
                    if((s.charAt(i)+x <= 'z') || s.charAt(i)+x <= 'Z'){
                        System.out.print((char)(s.charAt(i)+x));
                        x++;
                    }else{
                        if(s.charAt(i-1) == 'Z' || s.charAt(i) == 'z')
                    }
                }
            }else if((s.charAt(i)=='z')||(s.charAt(i)=='Z')){
                System.out.print((char)(s.charAt(i)-25+k-1));
            }else
                System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = sc.nextLine();
        int k = sc.nextInt();
        output(s, k);
    }
}
