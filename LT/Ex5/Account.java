package Ex5;

public class Account{
	private String id;
	private String name;
	private int balance;
	public Account(String id, String name){
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getBalance(){
		return this.balance;
	}
	public int setCredit(int amount){
		
		return this.balance+=amount;
	}
	public int setDebit(double amount){
		if(amount<=balance){
			balance-=amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int TransferTo(Account another ,int amount){
		if (amount <= this.balance) {
			balance += amount;
			another.balance += amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	@Override
	public String toString(){
		System.out.println("Account [id = " + this.id + ", name = " + this.name + ", balance = " + this.balance + "]");
		return super.toString();
	}
}
