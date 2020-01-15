import java.util.Scanner;

class Matrix {
	public void showMatrix(int x[][],int n) {
		int i,j;
		for(i=0;i<n;i++) {
			System.out.println();
			for(j=0;j<n;j++)
				System.out.print(" "+x[i][j]);
		}
	}
	public void addition(int a[][],int b[][],int n) {
		int i,j;
		int[][] c=new int[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				c[i][j] = a[i][j] + b[i][j];
		System.out.print("\n Resultant matrix = ");
		showMatrix(c,n);
	}
	
	public void subtraction(int a[][],int b[][],int n) {
		int i,j;
		int[][] c=new int[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				c[i][j] = a[i][j] - b[i][j];
		System.out.print("\n Resultant matrix = ");
		showMatrix(c,n);
	}
	
	public void multiplication(int a[][],int b[][],int n) {
		int i,j,k;
		int[][] c=new int[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				for(k=0;k<n;k++)
					c[i][j]  += a[i][k] * b[k][j];
		System.out.print("\n Resultant matrix = ");
		showMatrix(c,n);
	}
}

public class MatrixDemo {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		char ch = 'y';
		int opt,n,i,j;
		Matrix obj = new Matrix();
		System.out.print("\n Enter 'N' for NXN matrix = ");
		n = ip.nextInt();
		int[][] a = new int[n][n];
		int[][] b = new int[n][n];
		System.out.print(" Enter first matrix elements = ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				a[i][j] = ip.nextInt();
		System.out.print(" Enter second matrix elements = ");
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b[i][j] = ip.nextInt();
		System.out.print("\n First Martrix = ");
		obj.showMatrix(a, n);
		System.out.print("\n Second Martrix = ");
		obj.showMatrix(b, n);
		while(ch == 'Y' || ch == 'y') {
			System.out.println("\n Matrix Manipulation");
			System.out.print("\n 1. Addition \n 2. Subtraction \n 3. Multiplication");
			System.out.print("\n Enter option = ");
			opt = ip.nextInt();
			switch(opt) {
			case 1: obj.addition(a, b, n); break;
			case 2: obj.subtraction(a, b, n); break;
			case 3: obj.multiplication(a, b, n); break;
			default: System.out.println("\n Wrong choice!");
			}
			System.out.print("\n Try again ? (Y/N) =  ");
			ch = ip.next().charAt(0);			
		}
		System.out.print("\n Program Terminated!");
		ip.close();

	}

}
