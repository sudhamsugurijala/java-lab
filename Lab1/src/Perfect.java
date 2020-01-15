import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {

		int u,l,sum=0;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter Upper and Lower limits = ");
		u = ip.nextInt();
		l = ip.nextInt();
		int i=0,j=2;
		for(i=l; i<=u; i++) {
			sum = 0;
			for(j=1; j<i; j++)
				if(i%j==0) sum+=j;
			if(sum==i) System.out.print(" "+ sum);
		}
		ip.close();
	}

}
