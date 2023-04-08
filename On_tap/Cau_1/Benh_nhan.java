abstract public class Benh_nhan{
    private String Ma_benh_nhan;
    private String Ten_benh_nhan;
    public Benh_nhan(){};
    public Benh_nhan(String Ma_benh_nhan, String Ten_benh_nhan){
        this.Ma_benh_nhan = Ma_benh_nhan;
        this.Ten_benh_nhan = Ten_benh_nhan;
    }

    public String getMa_benh_nhan(){
        return Ma_benh_nhan;
    }

    public void setMa_benh_nhan(String ma_ben_nhan){
        this.Ma_benh_nhan = ma_ben_nhan;
    }

    public String getTen_benh_nhan(){
        return Ten_benh_nhan;
    }

    public void setTen_benh_nhan(String ten_benh_nhan){
        this.Ten_benh_nhan = ten_benh_nhan;
    }

    public String toString(){
        return "";
    }
    public abstract int Tinh_vien_phi();
}
