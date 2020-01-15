package bank;
import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
			int n,i,x,f=0;
			Scanner ip = new Scanner(System.in);
			System.out.print("\n Enter number of accounts : ");
			n = ip.nextInt();
			Account ob[] = new Account[n];
			for(i=0;i<n;i++) ob[i] = new Account();
			for(i=0;i<n;i++) {
				x = ob[i].createAccount();
				if(x==0) ob[i].invalidAccount();
			}
			System.out.print("\n Enter Account Number to perform Transactions : ");
			x = ip.nextInt();
			try {
				for(i=0;i<n;i++)
					if(ob[i].searchAccount(x)==1) {
						f++;
						System.out.print("\n Enter deposit money : ");
						x = ip.nextInt();
						ob[i].depositAmount(x);
						System.out.print("\n Enter withdrawal money : ");
						x = ip.nextInt();
						ob[i].withdrawAmount(x);
				}
				ip.close();
				if(f==0) throw new AccountNotFoundException();
			} catch(AccountNotFoundException e){
				e.display();
			} finally {
				System.out.println("\n Transactions Closed.");
			}
	}

}

