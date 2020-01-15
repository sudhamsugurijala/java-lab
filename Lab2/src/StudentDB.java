import java.util.Scanner;

class StudProfile {
	public String name,dept;
	char grade;
	public int id,marks,credits,credTotal,sum;
	public float gpa;
	Scanner ip = new Scanner(System.in);

	StudProfile() {
		credTotal = sum = 0;
	}
	
	public void add(int x,int y) {
		sum += x*y;
		credTotal += y;
	}
	
	public void calculate() {
		gpa = (float)sum/credTotal;
	}
	
	void getInfo() {
		
		System.out.print(" Name = ");
		name = ip.next();
		System.out.print(" ID = ");
		id = ip.nextInt();
		System.out.print(" Department = ");
		dept = ip.next();
		System.out.print(" Enter grades and credits obtained =\n");
		for(int j=0;j<3;j++) {
			System.out.print(" Subject "+(j+1)+" grade = ");
			grade = ip.next().charAt(0);
			switch(grade) {
			case 'o': marks = 10; break;
			case 'O': marks = 10; break;
			case 'a': marks = 9; break;
			case 'A': marks = 9; break;
			case 'b': marks = 8; break;
			case 'B': marks = 8; break;
			case 'c': marks = 7; break;
			case 'C': marks = 7; break;
			default : marks = 6;
			}
			System.out.print(" Credits = ");
			credits = ip.nextInt();
			add(marks,credits);
		}
	}
	
	void display() {
			System.out.println(" Name = "+name);
			System.out.println(" ID = "+id);
			System.out.println(" Department = "+dept);
			System.out.println(" GPA = "+gpa);
	}
	
	int search(int x) {
		if(x==id) {
			display();
			return 1;
		}
		return 0;
	}
}

public class StudentDB {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int n,i,id;
		int f=0;
		System.out.print("\n Enter number of students = ");
		n = ip.nextInt();
		StudProfile[] obj = new StudProfile[n];
		for(i=0;i<n;i++) obj[i] = new StudProfile();
		for(i=0;i<n;i++) {
			System.out.println(" Enter Details of student"+(i+1)+" =");
			obj[i].getInfo();
		}
		System.out.println("\n\t\t GPA \n");
		for(i=0;i<n;i++) { 
			obj[i].calculate();
			obj[i].display();
		}
		System.out.println("\n Search by ID");
		System.out.print(" Enter ID to search = ");
		id = ip.nextInt();
		for(i=0;i<n;i++) f = obj[i].search(id);
		if(f==0) System.out.println("\n Record NOT found!");
		System.out.print("\n Program Terminated!");
		ip.close();
	}

}
