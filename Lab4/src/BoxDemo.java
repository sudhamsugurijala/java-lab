import java.util.Scanner;

interface BoxModel {
	double area();
	double volume();
}

class Box implements BoxModel{
	protected double l,b,h;
	Box() {		l=b=h=0;	}
	Box(double l,double b,double h) {
		this.l = l; this.b = b; this.h = h;
	}
	public double area() {
		return 2*((l*b)+(b*h)+(h*l));
	}
	public double volume() {
		return l*b*h;
	}
	boolean equalsVol(Box B) {
		return this.volume()==B.volume();
	}
	boolean equalsArea(Box B) {
		return this.area()==B.area();
	}
	boolean equalsDim(Box B) {
		return this.l==B.l && this.b==B.b && this.h==B.h;
	}
}

public class BoxDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		double l,b,h;
		System.out.print("\n Enter Dimensions of Box1 (LXBXH) : ");
		l = ip.nextDouble();  b = ip.nextDouble();  h = ip.nextDouble();
		Box box1 = new Box(l,b,h);
		System.out.print(" Enter Dimensions of Box2 (LXBXH) : ");
		l = ip.nextDouble();  b = ip.nextDouble();  h = ip.nextDouble();
		Box box2 = new Box(l,b,h);
		if(box1.equalsArea(box2)) { System.out.println("\n The Boxes have equal Surface Area."); }
		else { System.out.println("\n The Boxes have Different Surface Areas."); }
		if(box1.equalsVol(box2)) { System.out.println(" The Boxes have equal Volume."); }
		else { System.out.println(" The Boxes have Different Volumes."); }
		if(box1.equalsDim(box2)) { System.out.println(" The Boxes have equal Dimensions."); }
		else { System.out.println(" The Boxes have Different Dimensions."); }
		ip.close();
	}

}
