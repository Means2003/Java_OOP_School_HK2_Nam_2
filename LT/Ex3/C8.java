package Ex3;

import java.util.Scanner;
public class C8 {
   public static Scanner sc = new Scanner (System.in);
   public static void main (String[] agrs) {
	   String str= sc.nextLine();
	   String arr[] = str.trim().split(" +");
	   String max =arr[0];
	   for(String text :arr) {
		   System.out.println(text);
		   if (text.length()>max.length()) {
			   max=text;
		   }
	   }
	   System.out.println(arr.length);
	   System.out.println(max.length());
   }
}
