import java.util.Scanner;
public class ShapePatternExample {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] agrs)
	{
		ShapeFactory S = new ShapeFactory();
		System.out.println("1.	Draw Cricle");
		System.out.println("2.	Draw Square");
		System.out.println("3.	Draw Rectangle");
		System.out.println("0.	Exit");
		int chon;
		do {
			chon = Integer.parseInt(sc.nextLine());
			switch (chon)
			{
			case 1:
				S.getShape(VehiccleType.CIRCLE).draw();
				break;
			case 2:
				S.getShape(VehiccleType.Square).draw();
				break;
			case 3:
				S.getShape(VehiccleType.Rectangle).draw();
				break;
			}
		}while(chon!=0);
	}
}


