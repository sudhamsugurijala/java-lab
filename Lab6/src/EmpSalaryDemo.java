import java.util.Scanner;

class EmpSalary {
	protected String Emp_name,Address,Mail_id;
	protected long Emp_id,Mobil_no;
	protected double da,hra,pf,fund,gp,np;
	
	EmpSalary(double bp){
		da = 0.97*bp;	hra = 0.1*bp;
		pf = 0.12*bp;	fund = 0.001*bp;
		gp = bp+da+hra;	np = gp - (pf+fund);
	}
	protected void details() {
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter Employee ID : ");
		this.Emp_id = ip.nextInt();
		System.out.print(" Enter Employee Name : ");
		this.Emp_name = ip.next();
		System.out.print(" Enter Address : ");
		this.Address = ip.next();
		System.out.print(" Enter mail ID : ");
		this.Mail_id = ip.next();
		System.out.print(" Enter Mobile Number : ");
		this.Mobil_no = ip.nextLong();
	}
	protected void payslip() {
			System.out.println("\n PAYSLIP");
			System.out.println("\n Employee ID : "+this.Emp_id);
			System.out.println(" Employee Name : "+this.Emp_name);
			System.out.println(" Address : "+this.Address);
			System.out.println(" mail ID : "+this.Mail_id);
			System.out.println(" Mobile Number : "+this.Mobil_no);
			System.out.println(" Gross Salary : "+this.gp);
			System.out.println(" Net Salary : "+this.np);	
	}
}

class Programmer extends EmpSalary {
	Programmer(double x) {
		super(x);
		super.details();
		super.payslip();
	}
}
class AsstProf extends EmpSalary {
	AsstProf(double x) {
		super(x);
		super.details();
		super.payslip();
	}
}
class AssocProf extends EmpSalary {
	AssocProf(double x) {
		super(x);
		super.details();
		super.payslip();
	}
}
class Professor extends EmpSalary {
	Professor(double x) {
		super(x);
		super.details();
		super.payslip();
	}
}

public class EmpSalaryDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int opt; double bp; char ch='y';
		System.out.println("\n OCCUPATION MENU");
		System.out.println("\n 1. Programmer\n 2. Professor");
		System.out.println(" 3. Associate Professor");
		System.out.println(" 4. Assistant Professor");
		while(ch=='y'||ch=='Y') {
			System.out.print("\n Enter option : "); opt = ip.nextInt();
			switch(opt) {
			case 1: System.out.print(" Enter basic pay : "); bp = ip.nextInt();
				Programmer obj1 = new Programmer(bp); break;
			case 2: System.out.print(" Enter basic pay : "); bp = ip.nextInt();
					Professor obj2 = new Professor(bp); break;
			case 3: System.out.print(" Enter basic pay : "); bp = ip.nextInt();
				AssocProf obj3 = new AssocProf(bp); break;
			case 4: System.out.print(" Enter basic pay : "); bp = ip.nextInt();
					AsstProf obj4 = new AsstProf(bp); break;
			default: System.out.println(" Wrong Option Chosen!");
			}
			System.out.print("\n Another Employee?(Y/N) : ");
			ch = ip.next().charAt(0);
		}
		ip.close();
	}

}
