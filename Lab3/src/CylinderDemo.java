import java.util.Scanner;

class Circle {
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double findCircumference() {
		return 2*Math.PI*radius; 
    }    
	public double findArea() {
		return Math.PI*radius*radius;     
	} 
}

class Cylinder extends Circle{
	private double length;
	public Cylinder(double rad) {
		super(rad);
	}
	public double findArea(double length) {
		this.length = length;
		return findCircumference()*length;
	}
	public double findArea() {
		return 2*super.findArea()+findArea(length);
	}
	public double findVolume() {
		return super.findArea()*length;
	}
}

public class CylinderDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double r,l;
		System.out.print("\n Enter base radius of Cylinder : ");
		r = ip.nextDouble();
		System.out.print(" Enter length of Cylinder : ");
		l = ip.nextDouble();
		Cylinder C = new Cylinder(r);
		System.out.printf("\n Curved Surface Area : %.2f %s",C.findArea(l),"sq units");
		System.out.printf("\n Total Surface Area : %.2f %s",C.findArea(),"sq units");
		System.out.printf("\n Volume of Cylinder : %.2f %s",C.findVolume(),"cubic units");
		ip.close();
	}

}
