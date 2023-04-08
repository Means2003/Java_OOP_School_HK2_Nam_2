import java.util.Scanner;
import java.util.Vector;

public class testHopiTall {
   	public static BenhNhan inputNgoaiTru(Scanner sc) {
	   String MaBenhNhan = sc.next();
	   sc.nextLine();
	   String TenBenhNhan =sc.nextLine();
	   int TienCongKham =sc.nextInt();
	   return new NgoaiTru(MaBenhNhan, TenBenhNhan, TienCongKham);
   }
   	public static BenhNhan inputNoiTru(Scanner sc) {
	   String MaBenhNhan = sc.next();
	   sc.nextLine();
	   String TenBenhNhan =sc.nextLine();
	   int SoNgayDieuTri=sc.nextInt();
	   double DonGiaPhong =sc.nextDouble();
	   return new NoiTru(MaBenhNhan, TenBenhNhan, SoNgayDieuTri, DonGiaPhong);
   }
	
   	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("----MENU----");
		System.out.println("1.Them Benh Nhan Ngoai Tru");
		System.out.println("2.Them Benh Nhan Noi Tru");
		System.out.println("3.In danh sach benh nhan");
		System.out.println("4.Tim benh nhan theo ma");
		System.out.println("5.Doc danh sach tu file");
		System.out.println("0.Thoat chuong trinh");
		Vector<BenhNhan>lstBenhNhan = new Vector<BenhNhan>();
		BenhNhan b;
		int chon;
		do{
			System.out.println("Chon thao tac");
			chon=sc.nextInt();
			switch (chon) {
			case 1:
				b=inputNgoaiTru(sc);
				lstBenhNhan.add(b);
				break;
			case 2:
				b=inputNoiTru(sc);
				lstBenhNhan.add(b);
				break;
			case 3:
				for (BenhNhan bn: lstBenhNhan){
					System.out.println(bn + "\n");}
				break;
			case 4:
				String MaBenhNhan = sc.next();
				for (BenhNhan bn : lstBenhNhan){
					if(bn.getMaBenhNhan().equalsIgnoreCase(MaBenhNhan)){
						System.out.println(bn.getTenBenhNhan());
						break;
					}
				}
			}
		}while(chon!=0);
	}
}
