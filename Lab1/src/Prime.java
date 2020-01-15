import java.util.*;

public class Prime {

	public static void main(String[] args) {

		int u,l,f=0;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter Upper and Lower limits = ");
		u = ip.nextInt();
		l = ip.nextInt();
		int i=0,j=2;
		for(i=l; i<=u; i++) {
			for(j=2; j<i; j++)
				if(i%j==0) { f=0; break; }
				else f=1;
			if(i==2) System.out.print(" 2");
			if(f==1) System.out.print(" "+ i);
		}
		ip.close();
	}

}
