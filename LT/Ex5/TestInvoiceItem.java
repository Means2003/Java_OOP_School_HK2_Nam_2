package Ex5;
import java.util.Scanner;
public class TestInvoiceItem{
	public static Scanner sc= new Scanner(System.in);
	public static void main(String[] args){
		InvoiceItem inv1 = new InvoiceItem("A101","Pen Red", 888, 0.08);
		System.out.println(inv1);
		inv1.display();
		System.out.println("Total price: "+inv1.getTotal());
	}
}