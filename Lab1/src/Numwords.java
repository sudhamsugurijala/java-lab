import java.util.*;

public class Numwords {

	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.print("\n Enter a number = ");
		n = ip.nextInt();
		switch(n)
		{
		case 0: System.out.print(" Zero"); break;
		case 1: System.out.print(" One"); break;
		case 2: System.out.print(" Two"); break;
		case 3: System.out.print(" Three"); break;
		case 4: System.out.print(" Four"); break;
		case 5: System.out.print(" Five"); break;
		default: System.out.print(" Number out of range!");
		}
		ip.close();
	}

}
