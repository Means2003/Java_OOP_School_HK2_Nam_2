package Ex3;

import java.util.Scanner;
public class C1 {
    static Scanner sc = new Scanner(System.in);

    public static int operator(String s){
        int sum = 0;
        s = s.replaceAll("[^0-9,-\\.]", ",");
        String a[] = s.split(",");
        for(int i = 0; i < a.length; i++){
            try{
                Integer.parseInt(a[i]);
                sum += Integer.parseInt(a[i]);
            }catch(NumberFormatException e){}
        }
        return sum;
    } 

    public static void output(String s){
        System.out.print(operator(s));
    }

    public static void main(String[] args) {
        String s = sc.nextLine();    
        output(s);
    }
}
