package empDemo;
import emp.*;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		int x,n,i,ch;
		System.out.print("\n Enter number of employees : ");
		n = in.nextInt();
		Employee[] e = new Employee[n];
		for(i=0;i<n;i++) e[i] = new Employee();
		for(i=0;i<n;i++) {
			x = e[i].input();
			if(x==1) e[i].calc();
		}
		System.out.println("\n Details of all employees :\n");
		for(i=0;i<n;i++) e[i].displayall();
		System.out.print("\n Enter employee ID to print payslip = ");
		x = in.nextInt();
		for(i=0;i<n;i++)
			if(x==e[i].id) e[i].display();
		System.out.println("\n\n Promotion Request :");
		do {
				System.out.print("\n Enter employee ID = ");
				x = in.nextInt();
				for(i=0;i<n;i++)
					if(x==e[i].id) {
						System.out.println("\n Employee found.");
						System.out.println(" Years of experience = "+ e[i].yrsOfXp);
						if(e[i].yrsOfXp>10) System.out.println(" Promotion Granted!");
						else System.out.println(" Experience insufficient for promotion!");
					}
				System.out.print("\n Continue?(Yes=1 / No = 0) = ");
				ch = in.nextInt();
		} while(ch==1);
		in.close();
	}

}
