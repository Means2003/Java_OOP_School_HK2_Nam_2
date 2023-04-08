package Ex1;

import java.util.Scanner;

public class C2 {
	public static int checkTangDan(long n){
		long num = n%10;
		n/=10; // 12
		while(n!=0){
			if(n%10> num)
				return 0;
			num = n%10;
			n/=10;
		}
		return 1;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		long n;
		n = sc.nextInt();
		System.out.println(checkTangDan(n));
	}
}
