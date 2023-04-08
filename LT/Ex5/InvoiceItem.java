package Ex5;

public class InvoiceItem{
	private String id;
	private String desc;
	private int qty;
	private double uniPrice;
	public InvoiceItem(String id, String desc, int qty, double uniPrice){
		this.id = id;
		this.desc = desc;
		if(qty > 0) this.qty = qty;
		else this.qty = 0;
		if(uniPrice > 0) this.uniPrice = uniPrice;
		else this.uniPrice = 0;
	}
	public String getId(){
		return this.id;
	}
	public String getDesc(){
		return this.desc;
	}
	public int getQty(){
		return this.qty;
	}
	public double getUniPrice(){
		return uniPrice;
	}
	public void setQty(int qty){
		if(qty>0) this.qty = qty;
	}
	public void setUniPrice(double uniPrice){
		if(uniPrice >= 0) this.uniPrice = uniPrice;
	}
	public double getTotal(){
		return this.qty*this.uniPrice;
	}
	public void display(){
		System.out.println("InvoiceItem[id = " + id + " desc = " + desc + " qty = " + qty + " uniPrice = " + uniPrice+  "]");
	}
}
