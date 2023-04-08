package Ex2;

import java.util.Scanner;
public class C16 {
    static Scanner sc = new Scanner(System.in);
    
    public static void output(char k[][], char a){
        for(int i = 0; i < k.length; i++){
            System.out.print(a);
        }
        System.out.print('\n');
        for(int i = 1; i < k[0].length-1; i++){
            for(int j = 0; j < k.length; j++){
                if(i == k[i].length/2 && j == k.length/2){
                    System.out.print('I');
                    continue;
                }
                if(j == 0 || j == k.length-1){
                    System.out.print(a);
                    continue;
                }
                System.out.print(" ");
            }
            System.out.print('\n');
        }
        for(int i = 0; i < k.length; i++){
            System.out.print(a);
        }
    }

    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        char a = sc.next().charAt(0);
        char k[][] = new char[n][m];
        output(k, a);
    }
}
