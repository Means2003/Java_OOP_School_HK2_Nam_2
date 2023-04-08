package Ex1;
import java.util.Scanner;
public class C10 {
    // public static boolean CheckNamNhuan(int year){
    //     if(year % 4 == 0 || (year % 4 == 0 && year % 100 == 0)) return true;
    //     return false;
    // }
    public static void OperatorDay(byte month, int year){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.print(31); break;
            case 4:
            case 6:
            case 9:
            case 11: System.out.print(30); break;
            case 2: if(year % 4 == 0 || (year % 4 == 0 && year % 100 == 0)){
                System.out.print(29);
                break;
            }else{System.out.print(28);
                break;}
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte month = sc.nextByte();
        int year = sc.nextInt();
        OperatorDay(month, year);
    }
}
