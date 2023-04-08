import java.util.Vector;

import javax.security.auth.callback.TextInputCallback;

import java.util.Scanner;
public class Quan_Ly_Benh_Nhan {
    public static Benh_nhan input_Benh_nhan_ngoai_tru(Scanner sc){
        sc.nextLine();
        String Ma_benh_nhan = sc.nextLine();
        String Ten_benh_nhan = sc.nextLine();
        int Tien_cong_kham = sc.nextInt();
        return new Ngoai_tru(Ma_benh_nhan, Ten_benh_nhan, Tien_cong_kham);
    }
    public static Benh_nhan input_Ben_nhan_noi_tru(Scanner sc){
        sc.nextLine();
        String Ma_benh_nhan = sc.nextLine();
        String Ten_benh_nhan = sc.nextLine();
        int So_ngay_dieu_tri = sc.nextInt();
        int Don_gia_tien_phong = sc.nextInt();
        return new Noi_tru(Ma_benh_nhan, Ten_benh_nhan, So_ngay_dieu_tri, Don_gia_tien_phong);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Vector <Benh_nhan> danh_sach_Benh_nhan = new Vector<Benh_nhan>();
        Benh_nhan benh_nhan;
        int user;
        do{
            System.out.println("1. Them benh nhan ngoai tru.");
            System.out.println("2. Them benh nhan noi tru.");
            System.out.println("3. In danh sach benh nhan.");
            System.out.println("4. Tim thong tin benh nhan theo ma benh nhan.");
            System.out.println("5. Ghi thong tin benh nhan ra file benhnhan.txt(dung serializable).");
            System.out.println("6. Doc du lieu benh nhan tu file benhnhan.txt.");
            System.out.println("0. Thoat");
            user = sc.nextInt();
            switch(user){
                case 1:
                    benh_nhan = input_Benh_nhan_ngoai_tru(sc);
                    danh_sach_Benh_nhan.add(benh_nhan);
                    break;
                case 2:
                    benh_nhan = input_Ben_nhan_noi_tru(sc);
                    danh_sach_Benh_nhan.add(benh_nhan);
                    break;
                case 3:
                    System.out.print("Ma_Benh_Nhan\tTen_Benh_Nhan\tLoai\tTien_Cong_Kham\n");
                    for(Benh_nhan x : danh_sach_Benh_nhan){
                        System.out.println(x.toString());
                    }
                    break;
                case 4:
                    sc.nextLine();
                    Boolean check = true;
                    String ma_benh_nhan_can_tim = sc.nextLine();
                    for(Benh_nhan x : danh_sach_Benh_nhan){
                        if(ma_benh_nhan_can_tim.equals(x.getMa_benh_nhan())){
                            System.out.print("Ma_Benh_Nhan\tTen_Benh_Nhan\tLoai\tTien_Cong_Kham\n");
                            System.out.println(x.toString());
                            check = false;
                        }
                    }
                    if(check){
                        System.out.println("khong tim thay benh nhan nao!");
                    }
                    break;
            }
        }while(user != 0);
    }
}
