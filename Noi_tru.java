import org.w3c.dom.Notation;

public class Noi_tru extends Benh_nhan {
    private int So_ngay_dieu_tri;
    private int Don_gia_tien_phong;
    public Noi_tru(){
        super();
    }
    public Noi_tru(String Ma_benh_nhan, String Ten_benh_nhan, int so_ngay_dieu_tri, int don_gia_tien_phong){
        super(Ma_benh_nhan, Ten_benh_nhan);
        this.So_ngay_dieu_tri = so_ngay_dieu_tri;
        this.Don_gia_tien_phong = don_gia_tien_phong;
    }
    @Override
    public int Tinh_vien_phi(){
        return So_ngay_dieu_tri * Don_gia_tien_phong;
    }
    public String toString(){
        return this.getMa_benh_nhan() + "\t" +this.getTen_benh_nhan() + "\tNoi tru\t" + Tinh_vien_phi();
    }
}
