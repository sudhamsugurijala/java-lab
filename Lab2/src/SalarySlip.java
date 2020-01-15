import java.util.Scanner;

class DBEmp {
	public String name;
	public int bp,cca,ins;
	public float da,hra,pf,gp,ded,np;

	public void process() {
		da = (float)0.88*bp;
		hra = (float)0.08*bp;
		cca = 1000; ins = 2000;
		pf = (float)0.10*bp;
		gp = bp+da+hra+cca;
		ded = ins + pf;
		np = gp - ded;
	}
}

public class SalarySlip {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		char ch = 'y';
		DBEmp obj = new DBEmp();
		do {
		System.out.print("\n Enter Employee Details =\n\n ");
		System.out.print("Name = ");
		obj.name = ip.next();
		System.out.print(" Basic Pay = ");
		obj.bp = ip.nextInt();
		obj.process();
		System.out.print("\n\t\t Salary slip \n\n");
		System.out.print(" Name = "+obj.name);
		System.out.print("\n Basic Pay = "+obj.bp);
		System.out.print("\n Gross Pay = "+obj.gp);
		System.out.print("\n Deductions = "+obj.ded);
		System.out.print("\n Net Pay = "+obj.np);
		System.out.print("\n\n Continue ? (Y/N) = ");
		ch = ip.next().charAt(0);
		} while(ch=='y' || ch=='Y');
		ip.close();
		System.out.print(" Program Terminated!");
	}
}
