import java.util.Scanner;
class Fraction {
	private int num,denom;
	
	Fraction() { num = denom = 1; } 
	Fraction(int n, int d){
		int t,a,b;
		if(d>n) { a = d; b = n; }
		else { a = n; b = d; }
		t = a%b;
		while(t!=0) {
			a = b; b = t;
			t = a%b;
		}
		t = b;
		num = n/t; denom = d/t;
	}  
	void display() {
		if(this.isZero()) System.out.println(" Fraction : 0");
		else if(this.isOne()) System.out.println(" Fraction : 1");
		else if(this.isInt()) System.out.println(" Fraction : "+this.getNum()/this.getDenom());
		else System.out.printf(" Fraction : %d/%d\n",this.getNum(),this.getDenom());
	}
	boolean isZero () { return num == 0; }
	boolean isOne () { return num == denom; }
	boolean isInt() { return denom!=0 && num%denom==0; } 
	int floor() { return (int)Math.floorDiv(num,denom); }
	int ceiling() { return (int)Math.ceil(num/denom); }
	final int getNum() { return num; }
	final int getDenom(){ return (int)denom; }
	final int compare(Fraction f) {
		if(this.getNum()==f.getNum() && this.getDenom()==f.getDenom()) return 0;
		return 1;
	}
	final int compare(int i) {
		if(this.floor()==this.ceiling() && this.floor()==i) return 0;
		return 1;
	}
	final void addFraction(Fraction f) {
		int n = this.getNum()*f.getDenom() + this.getDenom()*f.getNum();
		int d = this.getDenom()*f.getDenom();
		Fraction result = new Fraction(n,d);
		System.out.print(" Sum");
		result.display();
	}
	final void addFraction(int i) {
		int n = this.getNum()+i*this.getDenom();
		int d = this.getDenom();
		Fraction result = new Fraction(n,d);
		System.out.print(" Sum");
		result.display();
	}
} 

public class FractionDemo {

	public static void main(String[] args) {
		int x,y;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter Fraction 1 Numerator = ");
		x = ip.nextInt();
		System.out.print(" Enter Fraction 1 Denominator = ");
		y = ip.nextInt();
		Fraction f1 = new Fraction(x,y);  f1.display();
		System.out.print("\n Enter Fraction 2 Numerator = ");
		x = ip.nextInt();
		System.out.print(" Enter Fraction 2 Denominator = ");
		y = ip.nextInt();
		Fraction f2 = new Fraction(x,y);  f2.display();
		int f = f1.compare(f2);
		if(f==0) System.out.printf(" Comparison : %d (Equal) \n",f);
		else System.out.printf(" Comparison : %d (Not Equal) \n",f);
		System.out.println(" Fraction1 + Fraction2 : ");
		f1.addFraction(f2);
		System.out.println("\n (Fraction 1 used for operations)");
		System.out.print(" Enter an integer : ");
		x = ip.nextInt();
		f1.addFraction(x);
		f = f1.compare(x);
		if(f==0) System.out.printf(" Comparison : %d (Equal) \n",f);
		else System.out.printf(" Comparison : %d (Not Equal) \n",f);
		ip.close();
	}

}
