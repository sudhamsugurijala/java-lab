import java.util.Scanner;
class Complex {
	private float real;
	private float imaginary;
	
	Complex() { real = imaginary = 0; }
	Complex(float r, float i){
		real = r;  imaginary = i;
	}
	
	void display(){
		System.out.printf("\n Result = %.2f+i%.2f \n",this.getReal(),this.getImaginary());
	}
	boolean isReal () { return imaginary == 0; } 
	boolean isImag () {	return real == 0; }
	final float getReal() { return real; } 
	final float getImaginary() { return imaginary; }
	
	void mult(Complex C,Complex D) {
		System.out.print("\n Multiplication : ");
		this.real = C.getReal()*D.getReal() - C.getImaginary()*D.getImaginary();
		this.imaginary = C.getReal()*D.getImaginary() + C.getImaginary()*D.getReal();
		display();
	}
	void mult(Complex C,float c, boolean i) {
		if(i) {
			System.out.print("\n Multiplication by Real number : ");
			this.real = C.getReal()*c; this.imaginary = C.getImaginary()*c;
			display();
		}   else {
				System.out.print("\n Multiplication by Imaginary number : ");
				this.real = -C.getImaginary()*c; this.imaginary = C.getReal()*c;
				display();
		}
	}
	
	void addSub(Complex C,Complex D) {
		System.out.print("\n Addition : ");
		this.real = C.getReal()+D.getReal(); this.imaginary = C.getImaginary()+D.getImaginary();
		display();
		System.out.print("\n Subtraction : ");
		this.real = C.getReal()-D.getReal(); this.imaginary = C.getImaginary()-D.getImaginary();
		display();
	}
	void addSub(Complex C,int c) {
			System.out.print("\n Addition : ");
			this.real = C.getReal()+c; this.imaginary = C.getImaginary();
			display();
			System.out.print("\n Subtraction : ");
			this.real = C.getReal()-c; this.imaginary = C.getImaginary();
			display();
	}
} 
public class ComplexNumDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		float x,y;
		int n;
		boolean real =true , imag = false;
		System.out.print("\n Enter Real part of Complex number 1 (C1) : ");
		x = ip.nextFloat();
		System.out.print(" Enter Imaginary part of Complex number 1 (C1) : ");
		y = ip.nextFloat();
		Complex c1 = new Complex(x,y);
		System.out.print(" Enter Real part of Complex number 2 (C2) : ");
		x = ip.nextFloat();
		System.out.print(" Enter Imaginary part of Complex number 2 (C2) : ");
		y = ip.nextFloat();
		Complex c2 = new Complex(x,y);
		Complex C = new Complex();
		C.mult(c1,c2);
		C.addSub(c1,c2);
		System.out.print("\n (taking C1 for operations)");
		System.out.print("\n Enter an integer(real number) : ");
		n = ip.nextInt();
		C.mult(c1,n,real);
		C.addSub(c1,n);
		System.out.print("\n Enter coefficient of imaginary number : ");
		n = ip.nextInt();
		C.mult(c1,n,imag);
		ip.close();
	}

}
