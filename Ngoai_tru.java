public class Ngoai_tru extends Benh_nhan{
    private int Tien_cong_kham;
    public Ngoai_tru(){
        super();
    }
    public Ngoai_tru(String Ma_benh_nhan, String Ten_benh_nhan, int tien_cong_kham){
        super(Ma_benh_nhan, Ten_benh_nhan);
        this.Tien_cong_kham = tien_cong_kham;
    }
    public int getTien_cong_kham(){
        return Tien_cong_kham;
    }
    @Override
    public int Tinh_vien_phi(){
        return Tien_cong_kham;
    }

    // public String toString(){
    //     return "MaBenNhan" + this.getMa_benh_nhan() + ", TenBenNhan=" + this.getTen_benh_nhan() + ", Loai=Ngoai_tru, VienPhi=" + Tinh_vien_phi();
    // }
    public String toString(){
        return this.getMa_benh_nhan() + "\t" +this.getTen_benh_nhan() + "\tNgoai tru\t" + Tinh_vien_phi();
    }
}