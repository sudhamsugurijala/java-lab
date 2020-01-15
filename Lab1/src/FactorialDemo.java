import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int f=1,t,n;
		System.out.print("\n Enter 'N' to print Factorial of N = ");
		n = ip.nextInt();
		t = n;
		while(t!=0) {
			f *= t;
			t--;
		}
		System.out.print(" Result ("+n+"!) = "+f);
		ip.close();
	}

}
