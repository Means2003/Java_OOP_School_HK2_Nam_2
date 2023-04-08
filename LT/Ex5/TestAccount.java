package Ex5;
public class TestAccount{
	public static void main(String[] args){
		Account a1= new Account("A101", "Tan An Teck", 88);
		System.out.println(a1);
		Account a2= new Account("A102", "Kumar");
		System.out.println(a2);
		System.out.println("id: " + a1.getId());
		System.out.println("name: " + a1.getName());
		System.out.println("balance: " + a1.getBalance());
		a1.setCredit(100);
		System.out.println(a1);
		a1.setDebit(50);
		System.out.println(a1);
		a1.setDebit(500);
		System.out.println(a1);
		a1.TransferTo(a2,100);
		System.out.println(a1);
		System.out.println(a2);
		
	}
}
