
public class NgoaiTru  extends BenhNhan{
  private int TienCongKham ;
  
  public NgoaiTru(String MaBenhNhan,String TenBenhNhan,int TienCongKham) {
	  super(MaBenhNhan,TenBenhNhan);
	  this.TienCongKham=TienCongKham;
  };
  @Override
	double TinhVienPhi() {
		// TODO Auto-generated method stub
		return TienCongKham;
	}
    
    public String toString() {
		// TODO Auto-generated method stub
		return "[" + super.toString()+ "\tLoai: Ngoai Trú" + "\t Vien Phi: " + TinhVienPhi() +"]";
	}
}
