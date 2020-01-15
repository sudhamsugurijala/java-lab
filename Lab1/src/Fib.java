import java.util.*;
public class Fib {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int i,n,a=0,b=1,c=0;
		System.out.print("\n Enter 'N' to print 'Nth' fibonacci number = ");
		n = ip.nextInt();
		System.out.print(" Result = ");
		if(n==1) System.out.print(a);
		else if(n==2) System.out.print(b);
		else {
		for(i=3;i<=n;i++) {
			c = a+b;
			a=b; b=c;
		}
		System.out.print(c);
	}
		ip.close();
  }
}
