package Ex2;
import java.util.Scanner;
public class C20 {
    static Scanner sc = new Scanner(System.in);
    public static void input(char a[]){
        for(int i = 0; i < a.length; i++){
            a[i] = sc.next().charAt(0);
        }
    }

    public static int tinh_diem_ko_A(char x){
        if(x == 'J' || x == 'Q' || x == 'K') return 10;
        if(Integer.parseInt(String.valueOf(x)) >= 2 && Integer.parseInt(String.valueOf(x)) <= 9)
            return Integer.parseInt(String.valueOf(x));
        return 0;
    }

    public static int tinh_diem_co_A(char x, int point){
        if(point + 10 > 21) return 1;
        return 10;
    }

    public static int operator(char a[]){
        int point = 0;
        int index = 0;
        boolean check = false;
        char temp[] = new char[4];
        for(int i = 0; i < a.length; i++){
            if(a[i] == 'A'){
                temp[index++] = a[i];
                check = true;
            }
            else
                point += tinh_diem_ko_A(a[i]);
        }
        if(check)
            for(int i = 0; i < 4; i++){
                point += tinh_diem_co_A(temp[i], point);
            }
        return point;
    }

    public static void output(char a[]){
        if(operator(a) > 21) System.out.print(0);
        else
            System.out.print(1);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        char a[] = new char[n];
        input(a);
        output(a);
    }
}
