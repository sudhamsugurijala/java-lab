import java.util.Scanner;

public class OddEvenDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.print("\n Enter 'N' to check if it is ODD or EVEN = ");
		n = ip.nextInt();
		if(n%2==0) System.out.println(" "+n+" is EVEN");
		else System.out.println(" "+n+" is ODD");
		ip.close();

	}

}
