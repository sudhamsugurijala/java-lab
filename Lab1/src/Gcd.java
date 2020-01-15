import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int gcd=0,a,b;
		System.out.print("\n Enter two numbers to find GCD = ");
		a = ip.nextInt();
		b = ip.nextInt();
		if (b>a) {
			b +=a;
			a =b-a; b = b-a; 
		}
		if (a%b==0) gcd = b;
		while(a%b!=0) {
			gcd = a%b;
			a=b; b = gcd;
		}
		System.out.print(" GCD = "+ gcd);
		ip.close();

	}

}
