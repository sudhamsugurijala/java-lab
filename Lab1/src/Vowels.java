import java.util.*;

public class Vowels {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("\n Enter a string = ");
		String s = stdin.next();
		s=s.toLowerCase();
		int n =0;
		for(int i=0;i<s.length();i++)
			switch(s.charAt(i)) {
				case 'a': n++; break;
				case 'e': n++; break;
				case 'i': n++; break;
				case 'o': n++; break;
				case 'u': n++; break;
			}
		System.out.print(" Number of vowels = " + n);
		stdin.close();
	}

}