package Ex3;
import java.util.Scanner;
public class C4 {
    static Scanner sc = new  Scanner(System.in);

    public static void operator(String s){
        int count = 0;
        int max = 0;
        String temp = "";
        for(int i = 0; i < s.length(); i++){
            count = 0;
            if(s.charAt(i) != ' '){
                for(int j = i; j < s.length(); j++){
                    if(s.charAt(j) == ' ') break;
                    else{
                        count++;
                    }
                }
                if(max < count){
                    max = count;
                    temp = s.substring(i, i+max);
                }
            }
        }
        System.out.print(temp);
    }
    public static void main(String[] args) {
        String s = sc.nextLine();
        operator(s);
    }
}
