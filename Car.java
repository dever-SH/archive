import java.util.Scanner;

public class Car {
	//properties 
	private String brand; 
	private String model; 
	private String colour;

	public void setBrand (String b) {
		brand = b;
	}

	public String getBrand () { return brand; }

	public void setModel (String m) {
		model = m;
	}

	public String getModel () { return model; }

	public void setColour (String c) {
		colour = c;
	}

	public String getColour () { return colour; }

	//behaviours 
	public static void speed(double s, String unit) {
		System.out.println("\n\n");
		switch (unit) {
			case "m/s": System.out.printf("Speed: %.3f KM/h\n", s*3.6); break;
			case "ft/s":System.out.printf("Speed: %.3f KM/h\n", s*1.097); break;
			case "mi/s": System.out.printf("Speed: %.3f KM/h\n", s*5793.6384); break;
			case "km/h": System.out.printf("Speed: %.3f KM/h\n", s); break;
			default: System.out.println("invalid unit, \n\nspeed: 0.0 KM/h"); 
		}
	}

	public void infor() {
		System.out.printf("Model: %s \nBrand: %s \nColor: %s \n\n", model, brand, colour);
	}

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Car obj1 = new Car();

		obj1.setModel("Foucs");
		obj1.setBrand("Ford");
		obj1.setColour("gray");

		System.out.printf("%20sThis is Your car information \n\nEnter speed and unit \nunits: (m/s) (ft/s) (mi/s) (km/h)\n", " ");
		speed(in.nextDouble(), in.next()); in.close();
		obj1.infor();
	}
}