import java.util.*;

public class Fivedig {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n,sum=0;
		System.out.print("\n Enter a 5 digit number = ");
		n = ip.nextInt();
		while(n!=0) {
			sum += (n%10);
			n /=10;
		}
		System.out.print(" Sum of all digits = "+sum);
		ip.close();
	}

}
