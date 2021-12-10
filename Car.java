import java.util.Scanner;

public class Car {
	//properties 
	private String brand; 
	private String model; 
	private String colour;

	public void setBrand (String b) { brand = b;}
	public String getBrand () { return brand; }

	public void setModel (String m) { model = m; }
	public String getModel () { return model; }

	public void setColour (String c) { colour = c; }
	public String getColour () { return colour; }

	//behaviours 
	public static double speed(double d, double t) {
		return (d/t) * 5793.6384;
	}

	public void infor() {
		System.out.printf("Model: %s \nBrand: %s \nColor: %s \n\n", getModel(), brand, colour);
	}

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		Car obj1 = new Car();

		obj1.setModel("Foucs");
		obj1.setBrand("Ford");
		obj1.setColour("gray");

		System.out.printf("\n\nEnter distance in miles and time in seconds: ");

		System.out.printf("\n\n%20sThis is Your car information \n\nspeed: %.3f KM/h\n", " ", speed(in.nextDouble(), in.nextDouble()));	
		obj1.infor();
	}
}