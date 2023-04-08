package Ex1;
import java.util.Scanner;

public class C5 {
    public static String xeploai(float point){
        if(point < 5) return "yeu";
        else if(point < 6) return "trung binh";
        else if(point < 7) return "trung binh kha";
        else if(point < 8) return "kha";
        else if(point < 9) return "gioi";
        else return "xuat sac";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float point = sc.nextFloat();
        System.out.println(xeploai(point));
    }
}
