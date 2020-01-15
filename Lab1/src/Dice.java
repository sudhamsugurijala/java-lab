import java.util.*;
public class Dice {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random r = new Random();
		char ch = 'y';
		System.out.println("\n These dice can give values from 2 - 12");
		System.out.print("\n Throw the dice ? (Y/N) =  ");
		ch = ip.next().charAt(0);
		while(ch == 'Y' || ch == 'y') {
			int n = r.nextInt(11) +2;
			System.out.println(" You got "+n+"!");
			System.out.print("\n Throw the dice again ? (Y/N) =  ");
			ch = ip.next().charAt(0);			
		}
		System.out.print("\n Game Over!");
		ip.close();
	}

}
