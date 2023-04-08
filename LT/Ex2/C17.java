package Ex2;
import java.util.Scanner;

public class C17 {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        float a[] = new float[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextFloat();
        }
        float x = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            x = a[i];
            count = 0;
            for(int j = 0; j < n; j++){
                if(x == a[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(a[i]);
                break;
            }
        }
    }
}
