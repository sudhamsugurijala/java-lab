import java.util.Scanner; 

class Figure {
	 
	private double dim1;     
	private double dim2;
	 
	Figure(){
		dim1=0; dim2=0;
	}
	Figure(double a, double b) {
		dim1 = a; dim2 = b;
	} 

	double area(){
		System.out.println(" Area for Figure is undefined.");               
		return 0; 
	}
	
	final double getDim1(){
		return dim1;
	}
	final double getDim2(){
		return dim2;
	} 
} 

class Rectangle extends Figure {
	Rectangle(double a, double b) {
		super(a,b);
		}
	double area() {
		double a,b;
		a = getDim1();
		b = getDim2();
		System.out.println(" Inside area of Rectangle.");
		return a*b;  
		}
}

class Triangle extends Figure { 
	Triangle(double a, double b) {
		super(a, b);
		}
	double area() {
		double a,b;
		a = getDim1();
		b = getDim2();
		System.out.println(" Inside area of Triangle.");
		return a*b/ 2;
		} 
}

public class FigureDemo {

	public static void main(String[] args) {
		double area,x,y;
		Scanner ip = new Scanner(System.in);
		Figure fig = new Figure(10,10);
		area = fig.area();
		System.out.println(" Area of Figure = "+area);
		System.out.print("\n Enter length of rectangle : ");
		x = ip.nextDouble();
		System.out.print(" Enter breadth of rectangle : ");
		y = ip.nextDouble();
		Figure rectangle = new Rectangle(x,y);
		area = rectangle.area();
		System.out.println("\n Area of Rectangle = "+area);
		System.out.print("\n Enter base length of triangle : ");
		x = ip.nextDouble();
		System.out.print(" Enter height of triangle : ");
		y = ip.nextDouble();
		Figure triangle = new Triangle(x,y);
		area = triangle.area();
		System.out.println("\n Area of Triangle = "+area);
		ip.close();
	}

}
