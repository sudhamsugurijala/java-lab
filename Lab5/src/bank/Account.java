package bank;
import java.util.Scanner;

class PANRequiredException extends Exception {
	public void display() {
		System.out.println(" PANRequiredException");
	}
}
class MinBalRequiredException extends Exception {
	public void display() {
		System.out.println(" MinBalRequiredException");
	}
}
class NotEnoughMoneyInAccountException extends Exception {
	public void display() {
		System.out.println(" NotEnoughMoneyInAccountException");
	}
}
class AccountNotFoundException extends Exception {
	public void display() {
		System.out.println(" AccountNotFoundException");
	}
}
class PANFormatMismatchException extends Exception {
	public void display() {
		System.out.println(" PANFormatMismatchException");
	}
}
class BranchNotFoundException extends Exception {
	public void display() {
		System.out.println(" BranchNotFoundException");
	}
}

public class Account {
	
	protected String name,branch,PAN_num;
	protected long acct_num,balance,minimum_bal;
	protected String[] branches = {"mumbai","delhi","chennai","canada"};
	
	Account(){
		name = "None";	branch = "None";	PAN_num = "None";
		acct_num = 0;	balance = 0; minimum_bal=5000;
	}
	
	int checkPAN() {
		int i;
		try{
			if(this.PAN_num.length()!=10)
				throw new PANFormatMismatchException();
			for(i=0;i<10;i++) {
				if(i==5||i==6||i==7||i==8)
					if(PAN_num.charAt(i)>='0' && PAN_num.charAt(i)<='9');
					else throw new PANFormatMismatchException();
				else {
					if(PAN_num.charAt(i)>='a' && PAN_num.charAt(i)<='z');
					else if(PAN_num.charAt(i)>='A' && PAN_num.charAt(i)<='Z');
					else throw new PANFormatMismatchException();
				}
			}
		} catch(PANFormatMismatchException e){
			e.display(); return 0;
		}
		return 1;
	}
	
	void invalidAccount() { this.acct_num = -1; }
	
	int createAccount() {
		int i,f=0;	this.balance = 0;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter Name : "); this.name = ip.next();
		System.out.print(" Enter Account Number : ");	this.acct_num = ip.nextLong();
		System.out.print(" Enter Branch : ");	this.branch = ip.next();
		try {
			for(i=0;i<4;)
				if(this.branch.equalsIgnoreCase(branches[i++])) f++;
			if(f==0) throw new BranchNotFoundException();
		} catch(BranchNotFoundException e){
			e.display(); 
			System.out.println("\n Account not created."); return 0;
		}
		System.out.print(" Enter PAN number : "); this.PAN_num = ip.next();
		if(checkPAN()==0) { 
			System.out.println("\n Account creation Failed.");
			return 0;
		}
		else System.out.println(" Account Created."); return 1;
	}
	
	void depositAmount(long x){
			Scanner ip = new Scanner(System.in);
			try{
				if(x>25000)
					throw new PANRequiredException();
				else
					balance += x;
				System.out.println(" Current Balance : "+this.balance);
				System.out.println(" Deposit Success");
			} catch(PANRequiredException e) {
				e.display();
				System.out.print("\n Enter PAN number to proceed : ");
				this.PAN_num = ip.next();
				if(checkPAN()==0) {
					System.out.println("\n PAN number invalid. Transaction Failed.");
					return;
				}
				else balance += x;
				System.out.println(" Current Balance : "+this.balance);
				System.out.println(" Deposit Success");
			}
	}
	
	void withdrawAmount(long x) {
		try{
			if(x>this.balance) throw new NotEnoughMoneyInAccountException();
			else this.balance -= x;
			System.out.println(" Current Balance : "+this.balance);
			if(this.balance<minimum_bal)
				throw new MinBalRequiredException();
		} catch(NotEnoughMoneyInAccountException e){
			e.display();
		} catch(MinBalRequiredException e) {
			e.display();
		}
	}
	
	int searchAccount(long x) {
		if(this.acct_num==x) return 1;
		return 0;
	}
	
}
