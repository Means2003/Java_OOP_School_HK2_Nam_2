import java.util.Scanner;
interface Vehicle {
	void move();
}
class car implements Vehicle{

	@Override
	public void move() {
	  System.out.println("Car is moving");
		
	}
}
class truck implements Vehicle{

	@Override
	public void move() {
		 System.out.println("Truck is moving");
	}
	
}

enum VehicleType {
	Car,Truck,
}
class VehicleFatory {
	public Vehicle getVehicle (VehicleType type) {
		switch (type) {
		case Car:
			return new car();
		case Truck:
			return new truck();

		}
		return null;
	}
	
}

public class FactoryPatternExample {
	public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	VehicleFatory f = new VehicleFatory();
    	System.out.println("1. Create Car");
    	System.out.println("2. Create Truck");
    	System.out.println("3. Exit");
    	int chon;
    	do {
    		chon=Integer.parseInt(sc.nextLine());
    		switch(chon) {
    		case 1:
    			f.getVehicle(VehicleType.Car).move();
    			break;
    		case 2: 
    			f.getVehicle(VehicleType.Truck).move();
    			break;
    		}
    	}while(chon>=0);
	}
     
}
