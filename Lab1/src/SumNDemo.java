import java.util.Scanner;

public class SumNDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n,sum=0;
		System.out.println("\n Sum of first 'N' natural numbers");
		System.out.print("\n Enter 'N' = ");
		n = ip.nextInt();
		sum = (n*(n+1))/2;
		System.out.println(" Sum = "+sum);
		ip.close();
	}

}
