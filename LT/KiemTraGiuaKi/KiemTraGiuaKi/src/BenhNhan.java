
public abstract  class BenhNhan {
   private String MaBenhNhan ;
   private String TenBenhNhan;
   
   public BenhNhan(String MaBenhNhan, String TenBenhNhan) {
	    this.MaBenhNhan=MaBenhNhan;
	    this.TenBenhNhan=TenBenhNhan;
	    
   }
   public String getMaBenhNhan() {
	return MaBenhNhan;
  }
   public String getTenBenhNhan() {
	return TenBenhNhan;
 }
  
   abstract double TinhVienPhi(); // 
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "maBN: "+MaBenhNhan+"\t TBN: "+TenBenhNhan;
	}

}
   
   
  
   


