
public class NoiTru extends BenhNhan{
  private int SoNgayDieuTri;
  private double DonGiaPhong;

  // public int getSoNgayDieuTri() {
  //   return SoNgayDieuTri;
  // }
  // public void setSoNgayDieuTri(int soNgayDieuTri) {
  //   SoNgayDieuTri =SoNgayDieuTri>0?SoNgayDieuTri:0;
  // }
  // public double getDonGiaPhong() {
  //   return DonGiaPhong;
  // }
  // public void setDonGiaPhong(double DonGiaPhong) {
  //   DonGiaPhong = DonGiaPhong>0?DonGiaPhong:0;
  // }
  public NoiTru(String MaBenhNhan,String TenBenhNhan,int SoNgayDieuTri,double DonGiaPhong)
  {
    super(MaBenhNhan, TenBenhNhan);
    // setSoNgayDieuTri(SoNgayDieuTri);
    // setDonGiaPhong(DonGiaPhong);
    this.SoNgayDieuTri = SoNgayDieuTri>0?SoNgayDieuTri:0;
    this.DonGiaPhong = DonGiaPhong>0?DonGiaPhong:0;
  }
  @Override
    double TinhVienPhi() {
      // TODO Auto-generated method stub
      return SoNgayDieuTri*DonGiaPhong;
    }
  @Override
    public String toString() {
      // TODO Auto-generated method stub
      return  "[" + super.toString() + "\t Loai: Noi Tru" + "\t Vien Phi: " + TinhVienPhi() + "]";
    }
  
  }
