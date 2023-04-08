package Ex2;
import java.util.Scanner;
public class C15 {
    static Scanner sc = new Scanner(System.in);
    public static void input(float a[], float b[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextFloat();
            b[i] = sc.nextFloat();
        }
    }

    public static int check(float a[], float b[]){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]==b[i]) count++;
        }
        return count;
    }

    public static void output(float a[], float b[]){
        System.out.print(check(a, b));
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        float a[] = new float[x];
        float b[] = new float[x];
        input(a, b);
        output(a, b);
    }
}

