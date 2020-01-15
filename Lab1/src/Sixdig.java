import java.util.Scanner;

public class Sixdig {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n,se=0,so=0;
		System.out.print("\n Enter a 6 digit number = ");
		n = ip.nextInt();
		while(n!=0) {
			if((n%10)%2==0)se += (n%10);
			else so += (n%10);
			n /= 10;
		}
		System.out.print(" Sum of all even digits = "+se);
		System.out.print("\n Sum of all odd digits = "+so);
		ip.close();
	}

}
