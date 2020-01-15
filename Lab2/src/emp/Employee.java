package emp;
import java.util.Scanner;

public class Employee {
	
	public int id,yrsOfXp;
	protected String name,desig;
	protected int hrsWorked,optlic;
	protected double bp,hrWage,da,hra,lic,pf,ded,gp,np;
	
	public Employee() {
		lic = 800; pf = 500;
		hrWage = 70; hrsWorked = 0;
		yrsOfXp = 0; bp = 0;
		da = 2000; hra = 1000;
		bp = 30000; optlic = 0;
	}
	
	public int input() {
		
		int f=1;
		char ch;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter employee ID = ");
		id = ip.nextInt();
		System.out.print(" Enter employee name = ");
		name = ip.next();
		System.out.print(" Enter designation");
		System.out.print(" (Enter 'others' for Trainee,Analyst,Software Engineer,Team Lead) =\n ");
		desig= ip.next();
		desig = desig.toUpperCase();
		
		if(desig.charAt(0) == 'I') {
		System.out.print(" Enter Number of Hours worked = ");
		hrsWorked = ip.nextInt();
		}
		
		else if(desig.charAt(0) == 'O' || desig.charAt(0) == 'M'){
		System.out.print(" Enter Years of Experience = ");
		yrsOfXp = ip.nextInt();
		}
		
		else {
			System.out.print("\n Wrong Input ");
			f=0;
		}
		
		System.out.print(" Opt for LIC premium amount ? (Y/N) = ");
		ch = ip.next().charAt(0);
		if(ch == 'y' || ch == 'Y') optlic = 1;
		return f;
		
	}
	
	public void calc() {
		
		if(desig.charAt(0) == 'I') {
			gp = (hrsWorked*hrWage)+da+hra;
			if (optlic==1) ded = lic+pf;
			else ded = pf;
			np = gp-ded;
		}
		
		else if(desig.charAt(0) == 'M') {
			da = 0.40*bp; hra = 0.10*bp; pf = 0.08*bp;
			gp = bp+da+hra;
			if(optlic==1) ded = lic+pf;
			else ded = pf;
			np = gp-ded;
		}
		
		else {
			da = 0.30*bp; hra = 0.10*bp; pf = 0.08*bp;
			gp = bp+da+hra;
			if(optlic==1) ded = lic+pf;
			else ded = pf;
			np = gp-ded;
		}
		
	}
	
public void displayall() {
		
		System.out.println(" Employee ID = "+id);
		System.out.println(" Employee Name = "+name);
		System.out.println(" Designation = "+desig);
		System.out.println(" Gross Salary = "+gp);
		System.out.println(" Deductions = "+ded);
		System.out.println(" Net Salary = "+np);
		
	}

	public void display() {
		
		System.out.print("\n PaySlip \n\n");
		System.out.println(" Employee ID = "+id);
		System.out.println(" Employee Name = "+name);
		System.out.println(" Designation = "+desig);
		System.out.println(" Gross Salary = "+gp);
		System.out.println(" Deductions = "+ded);
		System.out.println(" Net Salary = "+np);
		
	}
}
