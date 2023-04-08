package TH.Lab1;
import java.util.Scanner;
public class C6 {
    static Scanner sc = new Scanner(System.in);
    public static void input(int a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
    }

    public static void operator(int a[]){
        int max = a[0];
        boolean check = true;

        for(int i = 0;i < a.length; i++){
            if(a[i] >= max){
                max = a[i];
            }
        }

        for(int i = 0;i < a.length; i++){
            if(a[i] <= max && a[i] > 0){
                max = a[i];
                check = false;
            }
        }


        if(check){
            System.out.print(-1);   
        }else{
            for(int i = 0;i < a.length; i++){
                if(a[i] == max){
                    System.out.print(i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a[] = new int[n];
        input(a);
        operator(a);
    }
}
