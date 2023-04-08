package TH.Lab1;
import java.util.Scanner;
public class C4 {
    static Scanner sc = new Scanner(System.in);
    public static void input(float a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextFloat();
        }
    }

    public static void operator(float a[]){
        byte c = 0;
        for(int i = 0; i < a.length; i++){
            c = 0;
            for(int j = 0; j < a.length; j++){
                if(a[j] == a[i]) c++;
            }
            if(c == 1){
                System.out.print(a[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        float a[] = new float[n];
        input(a);
        operator(a);
    }
}

