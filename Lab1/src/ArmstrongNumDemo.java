import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n,t,c=0,sum=0;
		System.out.println("\n Armstrong Number?");
		System.out.print("\n Enter number 'N' = ");
		n = ip.nextInt();
		t=n;
		while(t!=0) {
			t/=10;
			++c;
		}
		t=n;
		while(t!=0) {
			sum+=Math.pow(t%10,c);
			t/=10;
		}
		if(n==sum)System.out.println(" "+n+" is an armstrong number!");
		else System.out.println(" "+n+" is not an armstrong number!");
		ip.close();

	}

}
